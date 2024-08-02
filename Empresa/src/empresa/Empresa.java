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
        Gerente gerente = new Gerente("eric@univalle.edu.ni", 1, "Erick", 
                "Gerente General", 20000);
        System.out.println(gerente);
        gerente.aumentarSalario(0.2);
        System.out.println(gerente);
    
        Gerente gerVenta = new Gerente();
        
        gerVenta.setId(5);
        gerVenta.setNombres("Anselm Alvarado");
        gerVenta.setCargo("Gerente de Venta");
        gerVenta.setSalario(50000.0);
        gerVenta.setEmailInst("anselm@presidecia.ni");
        
        System.out.println("Datos de Anselm");
        System.out.println("ID: " + gerVenta.getId());
        System.out.println("Nombre Completo: "+ gerVenta.getNombres());
    }
    
    
}
