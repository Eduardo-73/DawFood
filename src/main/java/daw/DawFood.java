/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;

/**
 *
 * @author edu
 */
public class DawFood {

    public static void main(String[] args) {

        String menuPrincipal = """
                               ***********************
                                1.- Modo Usuario
                                2.- Modo Administrador
                               ***********************
                               """;

        String menuSegundario = """
                               ************************ 
                                1.- Menú Comida
                                2.- Menú Bebida
                                3-. Menú Postres 
                                4-. Mostrar Carrito
                               ************************
                                """;
        ArrayList<Comida> carne = new ArrayList<>();
        Comida c1 = new Comida("Ensaladas", 12.6);
        ArrayList<Bebida> gaseosa = new ArrayList<>();
        Bebida b1 = new Bebida("Fanta", 2.5);
        ArrayList<Postres> tartas = new ArrayList<>();
        Postres t1 = new Postres("Tarta de Queso", 6.00);

        Productos p1 = new Productos(carne, gaseosa, tartas);
        System.out.println(c1);
        System.out.println(b1);
        System.out.println(t1);
        System.out.println(p1);
    }
}
