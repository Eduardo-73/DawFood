/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author edu
 */
public class Ticket {

    private static Random sc = new Random();

    private int id;
    private int turno;
    private LocalDate fecha;
    private LocalTime hora;
    private double precioTotal;
    private ArrayList<Productos> lista;
    private static int contador = 1;

    // Constructor
    public Ticket(double precioTotal, ArrayList<Productos> lista) {
        this.id = contador++;
        this.turno = sc.nextInt(111, 999);
        this.fecha = LocalDate.now();
        this.hora = LocalTime.now();
        this.precioTotal = precioTotal;
        this.lista = lista;
    }

    // Get y Set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public ArrayList<Productos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Productos> lista) {
        this.lista = lista;
    }

    // ToString 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String prod = "";
        for (Productos productos : lista) {
            prod += " " + productos.getStock() + " ---- " + productos.getDescripcion()
                    + " ---- " + (productos.getPrecio() * productos.getIva().valor) + "€\n";
        }
        String precioTotalFormateado = String.format("%.2f", precioTotal);
        String txt = "-------------------------------------------------------------------------------------\n"
                + "                                     DawFood\n"
                + "Turno: " + turno + "\n"
                + "Fecha: " + fecha + " Hora: " + hora.getHour() + ":" + hora.getMinute() + "\n"
                + "-------------------------------------------------------------------------------------\n"
                + prod
                + "--------------------------------------------------------------------------------------\n"
                + "Precio Total: " + precioTotalFormateado + "€" + "\n"
                + "--------------------------------------------------------------------------------------\n";
        sb.append(txt);
        return sb.toString();
    }

}
