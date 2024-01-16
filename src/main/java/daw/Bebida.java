/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author edu
 */
public class Bebida {
    
    // Atributos encapsulados
    private String nombreBebida;
    private double precioBebida;
    
    // Constructores

    public Bebida(String nombreBebida, double precioBebida) {
        this.nombreBebida = nombreBebida;
        this.precioBebida = precioBebida;
    }

    public Bebida() {
    }
    
    // Set y Get
    public String getNombreBebida() {
        return nombreBebida;
    }

    public void setNombreBebida(String nombreBebida) {
        this.nombreBebida = nombreBebida;
    }

    public double getPrecioBebida() {
        return precioBebida;
    }

    public void setPrecioBebida(double precioBebida) {
        this.precioBebida = precioBebida;
    }
    
    // ToString 

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombreBebida);
        sb.append(", Importe = ").append(precioBebida);
        return sb.toString();
    }
    
}
