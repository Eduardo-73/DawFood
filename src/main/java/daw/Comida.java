/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author edu
 */
public class Comida {

    // Atributos Encapsulados
    private String nombreComida;
    private double precioComida;

    // Constructores
    public Comida(String nombreComida, double precioComida) {
        this.nombreComida = nombreComida;
        this.precioComida = precioComida;
    }

    public Comida() {
    }

    // Get y Set 
    public String getNombreComida() {
        return nombreComida;
    }

    public void setNombreComida(String nombreComida) {
        this.nombreComida = nombreComida;
    }

    public double getPrecioComida() {
        return precioComida;
    }

    public void setPrecioComida(double precioComida) {
        this.precioComida = precioComida;
    }

    // ToString 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombreComida);
        sb.append(", Importe = ").append(precioComida);
        return sb.toString();
    }

}
