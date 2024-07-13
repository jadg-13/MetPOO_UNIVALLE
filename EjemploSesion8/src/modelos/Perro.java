/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author jadg13
 */
public class Perro extends Animal{

    public Perro() {
    }

    public Perro(String nombre, String descripcion, int año) {
        super(nombre, descripcion, año);
    }
    
    public String ladrar(){
        return "Ladrar";
    }
    
    @Override
    public String caminar(){
        return "Camina mas rapido";
    }
    
}
