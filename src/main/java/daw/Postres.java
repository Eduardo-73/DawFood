/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author edu
 */
public class Postres {

    // Atributos encapsulados
    private String nombrePostres;
    private double precioPostres;

    // Contructores
    public Postres(String nombrePostres, double precioPostres) {
        this.nombrePostres = nombrePostres;
        this.precioPostres = precioPostres;
    }

    public Postres() {
    }

    // Get y Set
    public String getNombrePostres() {
        return nombrePostres;
    }

    public void setNombrePostres(String nombrePostres) {
        this.nombrePostres = nombrePostres;
    }

    public double getPrecioPostres() {
        return precioPostres;
    }

    public void setPrecioPostres(double precioPostres) {
        this.precioPostres = precioPostres;
    }

    // ToString 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombrePostres);
        sb.append(", Importe = ").append(precioPostres);
        return sb.toString();
    }

}
