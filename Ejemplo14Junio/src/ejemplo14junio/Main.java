/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo14junio;

import javax.swing.JOptionPane;
import models.Empleado;
import models.Operacion;

/**
 *
 * @author jadg13
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tipo de variable nombreVariable;
       /* Empleado emp = new Empleado();
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el ID"));
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre");
        String apellidos = JOptionPane.showInputDialog("Ingres los apellidos");
        String ciudad = JOptionPane.showInputDialog("Ingresa la Ciudad");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el salario"));
        emp.setId(id);
        emp.setNombre(nombre);
        emp.setApellidos(apellidos);
        emp.setCiudad(ciudad);
        emp.setSalario(salario);
        String msn = ""+ emp.getId() + "\n" + emp.getNombre() + " " + emp.getApellidos()
                + "\n" +emp.getCiudad() + "\n" + emp.getSalario();
        JOptionPane.showMessageDialog(null, msn);
        //Aumentar el salario en un 5%;
        double aumento = emp.aumentarSalario(5);
        emp.setSalario(salario+ aumento);
        msn = ""+ emp.getId() + "\n" + emp.getNombre() + " " + emp.getApellidos()
                + "\n" +emp.getCiudad() + "\n" + emp.getSalario();
        JOptionPane.showMessageDialog(null, msn);*/
       Operacion op = new Operacion();
       int num1 = Integer.parseInt(JOptionPane.showInputDialog("Dime el primer numero"));
       int num2 = Integer.parseInt(JOptionPane.showInputDialog("Dime el segundo numero"));
       int s = op.sumar(num1, num2);
       int r = op.restar(num1, num2);
       int m = op.multiplicar(num1, num2);
       double d = op.dividir(num1, num2);
       JOptionPane.showMessageDialog(null, "Suma: " + s + "\nResta: "+ r + "\nMultiplicacion: "+
               m + "\nDivisión: "+ d);
       
       
   
    }
    
}
