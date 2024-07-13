/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author jadg13
 */
public class Empleado {
    
    private int id;
    private String nombres;
    private String cargo;
    private double salario;

    public Empleado() {
    }

    public Empleado(int id, String nombres, String cargo, double salario) {
        this.id = id;
        this.nombres = nombres;
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("id=").append(id);
        sb.append(", nombres=").append(nombres);
        sb.append(", cargo=").append(cargo);
        sb.append(", salario=").append(salario);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
