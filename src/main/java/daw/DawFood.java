/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author edu
 */
public class DawFood {

    public static void main(String[] args) {
        int menu;
        String menuCarta;
        ArrayList<Productos> carnes = MetodosDeClases.carnes();
        ArrayList<Productos> ensaladas = MetodosDeClases.ensaladas();
        ArrayList<Productos> pescados = MetodosDeClases.pescados();
        ArrayList<Productos> refrescos = MetodosDeClases.refrescos();
        ArrayList<Productos> alcohol = MetodosDeClases.alcoholes();
        ArrayList<Productos> cafes = MetodosDeClases.cafesInfusiones();

        do {
            menu = MetodosDeClases.menuModos();
            switch (menu) {
                case 0 -> {
                    do {
                        menuCarta = MetodosDeClases.menuComida();
                        switch (menuCarta) {
                            case "Carta Comidas" -> {
                                MetodosDeClases.CartaComidas(carnes, ensaladas,
                                        pescados);
                            }

                            case "Cartas Bebidas" -> {
                                MetodosDeClases.CartaBebidas(refrescos, alcohol,
                                        cafes);
                            }

                            case "Cartas Postres" -> {

                            }

                            case "Carrito" -> {

                            }

                        }
                    } while (true);
                }

                case 1 -> {

                }
            }
        } while (true);
    }
}
