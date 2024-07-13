/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author jadg13
 */
public class Empleado {
    private int id;
    private String nombre;
    private String apellidos;
    private String ciudad;
    private double salario;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellidos, String ciudad, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ciudad = ciudad;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", ciudad=" + ciudad + ", salario=" + salario + '}';
    }
    
    public double aumentarSalario(double aumento){
        double porcentaje = aumento / 100;
        return this.salario *  porcentaje;
    }
    
}
