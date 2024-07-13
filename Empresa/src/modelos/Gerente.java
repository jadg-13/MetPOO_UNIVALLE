/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author jadg13
 */
public class Gerente extends Empleado {
    
    /**
     * Aumentar Salario en un 5%
     */
    public void aumentarSalario(){
        this.setSalario(this.getSalario()*1.05);
    }
    
    /**
     * Aumentar salario por un % dado por el usuario
     * @param porc 
     */
    public void aumentarSalario(double porc){
        this.setSalario(this.getSalario()*(1+porc));
    }

    public Gerente() {
    }

    public Gerente(int id, String nombres, String cargo, double salario) {
        super(id, nombres, cargo, salario);
    }

  
      
}
