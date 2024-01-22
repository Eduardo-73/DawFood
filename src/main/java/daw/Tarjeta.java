/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author eduar
 */
public class Tarjeta {

    private static Random rd = new Random();

    private String nombre;
    private final int PAN;
    private double saldo;
    private LocalDate fechaVencimiento;
    private final int CVV;

    // Constructor
    public Tarjeta(String nombre, double saldo) {
        this.nombre = nombre;
        this.PAN = rd.nextInt(1_111, 9_999);
        this.saldo = saldo;
        this.fechaVencimiento = LocalDate.now().plusYears(5);
        this.CVV = rd.nextInt(111, 999);
    }

    // Get y Set
    
    public int getCVV() {
        return CVV;
    }

    public int getPAN() {
        return PAN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    // ToString 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre = ").append(nombre);
        sb.append(", PAN = ").append(PAN);
        sb.append(", Saldo Cuenta= ").append(saldo);
        sb.append(", Válida hasta el final de = ").append(fechaVencimiento);
        sb.append(", CVV = ").append(CVV);
        return sb.toString();
    }

}
