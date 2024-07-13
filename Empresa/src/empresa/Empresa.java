/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

import modelos.Gerente;

/**
 *
 * @author jadg13
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gerente gerente = new Gerente(1, "Erick", 
                "Gerente General", 20000);
        System.out.println(gerente);
        gerente.aumentarSalario(0.2);
        System.out.println(gerente);
    }
    
    
}
