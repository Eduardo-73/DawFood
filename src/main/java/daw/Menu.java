/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;

/**
 *
 * @author eduar
 */
public class Menu {

    private ArrayList<Productos> listaProductos;

    // Constructor
    public Menu(ArrayList<Productos> listaProductos) {
        this.listaProductos = listaProductos;
    }

    // Get y Set
    public ArrayList<Productos> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Productos> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String texto = "";
        for (int i = 0; i < listaProductos.size(); i++) {
            texto += listaProductos.get(i) + "\n";
        }
        sb.append(texto);
        return sb.toString();
    }

}
