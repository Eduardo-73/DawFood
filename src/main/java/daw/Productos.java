/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package daw;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author eduar
 */
public class Productos {

    public static Random rd = new Random();

    private final int id;
    private String descripcion;
    private Categorias categoria;
    private Subcategorias sc;
    private double precio;
    private IVA iva;
    private int stock;
    private static int contador = 0;

    // Constructor
    public Productos(String descripcion, Categorias categoria, Subcategorias sc,
            double precio, IVA iva) {
        this.id = contador++;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.sc = sc;
        this.precio = precio;
        this.iva = iva;
        this.stock = rd.nextInt(1, 30 + 1);
    }

    // Get y Set
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public Subcategorias getSc() {
        return sc;
    }

    public void setSc(Subcategorias sc) {
        this.sc = sc;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public IVA getIva() {
        return iva;
    }

    public void setIva(IVA iva) {
        this.iva = iva;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // ToString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("#,##");
        sb.append(", Descripción = ").append(descripcion);
        sb.append(", Precio = ").append(df.format(precio));
        sb.append(", Stock = ").append(stock);
        return sb.toString();
    }
}
