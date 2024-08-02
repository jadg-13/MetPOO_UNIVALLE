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
    
    private String emailInst;
    
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

    public Gerente(String emailInst, int id, String nombres, String cargo, double salario) {
        super(id, nombres, cargo, salario);
        this.emailInst = emailInst;
    }

    public String getEmailInst() {
        return emailInst;
    }

    public void setEmailInst(String emailInst) {
        this.emailInst = emailInst;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Gerente{");
        sb.append("id=").append(getId());
        sb.append(", nombres=").append(getNombres());
        sb.append(", cargo=").append(getCargo());
        sb.append(", salario=").append(getSalario());
        sb.append(",emailInst=").append(getEmailInst());
        sb.append('}');
        return sb.toString();
    }
    
    
}
