/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author jadg13
 */
public class Venta {
    private String Empresa;
    private int numero;
    private double monto;

    public Venta() {
    }

    public Venta(String Empresa, int numero, double monto) {
        this.Empresa = Empresa;
        this.numero = numero;
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venta{");
        sb.append("Empresa=").append(Empresa);
        sb.append(", numero=").append(numero);
        sb.append(", monto=").append(monto);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
