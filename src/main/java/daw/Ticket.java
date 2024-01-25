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
        String cantidad = "", precioIVAF = "", precioTotalFormateado = "", producto = "", precio = "";
        double precioIVA = 0;
        sb.append("-------------------------------------------------------------------------------------\n");
        sb.append("                                       DawFood\n");
        sb.append("Turno: ").append(turno).append("\n");
        sb.append("Fecha: ").append(fecha).append("   Hora: ").append(hora.getHour()).append(":").append(hora.getMinute()).append("\n");
        sb.append("-------------------------------------------------------------------------------------\n");
        sb.append("Cantidad                   Producto                  Precio\n");
        for (Productos productos : lista) {
            precioIVA = productos.getPrecio() * productos.getIva().valor;
            cantidad = String.valueOf(productos.getStock());
            producto = productos.getDescripcion();
            precio = String.format("%.2f", precioIVA);
            sb.append("  ").append(cantidad).append("                         ").append(producto).append("               ").append(precio).append("€\n");
        }
        precioTotalFormateado = String.format("%.2f", precioTotal);
        sb.append("-------------------------------------------------------------------------------------\n");
        sb.append("Precio Total: ").append(precioTotalFormateado).append("€\n");
        sb.append("-------------------------------------------------------------------------------------\n");
        return sb.toString();
    }

}
