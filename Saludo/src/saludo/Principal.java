/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saludo;

import models.City;

/**
 *
 * @author jadg13
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola, bienvenido a Metodología de POO");
        City city = new City(1, "Managua", "Capital de Nicaragua");
        System.out.println(city);
    }
    
}
