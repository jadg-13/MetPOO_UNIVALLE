/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.Venta;

/**
 *
 * @author jadg13
 */
public class VentaDao {
    
    ArrayList<Venta> ventas = new ArrayList<>();
    
    public void AgregarVenta(Venta venta){
        ventas.add(venta);
    }
    
    public double mostrarTotalVenta(){
        double totalVenta = 0;
        for(Venta venta: ventas){
            totalVenta += venta.getMonto();
        }
        return totalVenta;
    }
    
    public double mostrarTotalTigo(){
        double totalVenta = 0;
        for(Venta venta: ventas){
            if(venta.getEmpresa().equals("Tigo")){
                totalVenta += venta.getMonto();
            }
        }
        return totalVenta;
    }
    
    public double mostrarTotalClaro(){
        double totalVenta = 0;
        for (Venta venta: ventas){
            if(venta.getEmpresa().equals("Claro")){
                totalVenta += venta.getMonto();
            }
        }
        return totalVenta;
    }
    
    public DefaultTableModel mostrarRegistros(){
        DefaultTableModel registros = new DefaultTableModel();
        
        String titulos[] = {"Compañia", "Numero", "Monto"};
        registros.setColumnIdentifiers(titulos);
        for(Venta venta: ventas){
            Object fila[] = new Object[3];
            fila[0] = venta.getEmpresa();
            fila[1] = venta.getNumero();
            fila[2] = venta.getMonto();
            registros.addRow(fila);
        }
        
        return registros;
    }
    
}
