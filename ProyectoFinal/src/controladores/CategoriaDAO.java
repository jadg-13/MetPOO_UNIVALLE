/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import modelos.Categoria;

/**
 *
 * @author jadg13
 */
public class CategoriaDAO {
    
    Conexion conexion = new Conexion();
    Connection conn = null;
    ResultSet rs = null;
    private PreparedStatement ps = null;

    /**
     * Constructor de la clase DaoCategoria inicia las consultas
     */
    public CategoriaDAO() {

    }

    public void getRecords() {
        conn = conexion.obtenerConexion();
        String tSQL = "Select * from categorias";
        try {
            ps = conn.prepareStatement(tSQL,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE,
                    ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Llena el campo listCategoria de tipo arrayList con todos los registros de
     * la tabla categorias
     */
    public ArrayList<Categoria> getAllCategorias() {
        ArrayList<Categoria> listCategoria = new ArrayList<>();
        try {
            this.getRecords();
            while (rs.next()) {    
                listCategoria.add(new Categoria(rs.getInt("ID"),
                        rs.getString("nombre")));
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener las Categorias");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conexion.close(conn);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return listCategoria;
    }

    public boolean isCategoria(int id) {
        boolean flag = false;
        this.getRecords();
        try {
            rs.beforeFirst();

            while (rs.next()) {
                if (rs.getInt("ID") == id) {
                    flag = true;
                    break;
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar el registro por el id: " + id + " el error fue: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conexion.close(conn);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return flag;
    }

    public Categoria getcategoriasByID(int id) {
        Categoria category = new Categoria();
        this.getRecords();
        try {
            rs.beforeFirst();

            while (rs.next()) {
                if (rs.getInt("ID") == id) {
                    category.setId(rs.getInt("ID"));
                    category.setNombre(rs.getString("nombre"));
                    break;
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar el registro por el id: " + id + " el error fue: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conexion.close(conn);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return category;
    }
    
    /**
     * Obtener categoria por Nombre
     * @param nombre
     * @return 
     */
    public ArrayList<Categoria> getcategoriasByName(String nombre) {
        ArrayList<Categoria> listCategoria = new ArrayList<>();
        
        this.getRecords();
        try {
            rs.beforeFirst();

            while (rs.next()) {
                if (rs.getString("nombre").toLowerCase().contains(nombre.toLowerCase())) {
                    
                    Categoria category = new Categoria();
                    category.setId(rs.getInt("ID"));
                    category.setNombre(rs.getString("nombre"));
                    listCategoria.add(category);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar el registro por el nombre: " + nombre + " el error fue: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conexion.close(conn);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return listCategoria;
    }

    /**
     * Obtiene el ultimo registro almacenado y le suma 1
     *
     * @return
     */
    public int getLastCategoria() {
        int id = 0;
        this.getRecords();
        try {
            rs.afterLast();
            if (rs.next()) {
                id = rs.getInt("ID");
            }
        } catch (Exception e) {
            System.out.println("Error al obtener el ultimo id: " + e.getMessage());
        }
        return id + 1;
    }

    /**
     * Devuelve un ComboBox
     *
     * @return
     */
    public DefaultComboBoxModel showcategoriasCombo() {
        this.getRecords();
        DefaultComboBoxModel<Categoria> combo = new DefaultComboBoxModel<>();
        
        try {
            while (rs.next()) {
                Categoria category = new Categoria(rs.getInt("IDCategoria"),
                        rs.getString("nombre"));
                combo.addElement(category);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return combo;
    }

    public boolean addCategoria(Categoria category) {
        boolean flag = true;
        this.getRecords();
        try {
            rs.moveToInsertRow();
            rs.updateString("nombre", category.getNombre());
            rs.insertRow();
            rs.moveToCurrentRow();
            flag = true;
        } catch (SQLException e) {
            System.out.println("Error al insertar categoria: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conexion.close(conn);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return flag;
    }

    public boolean updatecategorias(Categoria category) {
        boolean flag = false;
        try {
            this.getRecords();
            rs.beforeFirst();
            while (rs.next()) {
                if (rs.getInt("ID") == category.getId()) {
                    rs.updateString("nombre", category.getNombre());
                    rs.updateRow();
                    flag = true;
                    break;
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar categoria: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conexion.close(conn);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return flag;
    }

    public boolean deletecategorias(Categoria category) {
        boolean flag = false;
        try {
            this.getRecords();
            rs.beforeFirst();
            while (rs.next()) {
                if (rs.getInt("ID") == category.getId()) {
                    rs.deleteRow();
                    flag = true;
                    break;
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar categoria: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conexion.close(conn);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return flag;
    }
    
}
