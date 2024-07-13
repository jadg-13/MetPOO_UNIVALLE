/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author jadg13
 */
public class Animal {
    
    private String nombre;
    private String descripcion;
    private int año;

    public Animal() {
    }

    public Animal(String nombre, String descripcion, int año) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public String caminar(){
        return "Caminar";
    }
    
}
