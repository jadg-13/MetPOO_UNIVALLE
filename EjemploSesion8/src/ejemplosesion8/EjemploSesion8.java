/*
 Polimorfismo
*/
package ejemplosesion8;

import modelos.Animal;
import modelos.Perro;
import modelos.Tortuga;

/**
 *
 * @author jadg13
 */
public class EjemploSesion8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal1 = new Animal("Doggi", "Color blanco", 5);
        System.out.println(animal1.getNombre() + " realiza la accion "+ animal1.caminar());
        Perro dog = new Perro("Pluto", "Alto", 2);
        System.out.println(dog.getNombre() + " realiza accion "+ dog.caminar());
        System.out.println(dog.getNombre() + " realiza accion "+ dog.ladrar());
        Animal dog2 = new Perro("Muñeca", "Pastor aleman", 2);
        System.out.println(dog2.getNombre());
        System.out.println("Acción "+ dog2.caminar());
        Tortuga tortuga = new Tortuga();
        System.out.println("Accion " + tortuga.caminar() );
    }
    
}
