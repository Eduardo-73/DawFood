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
        int menu, posicion = 0;
        String menuCarta;
        ArrayList<Productos> menuTPV = MetodosDeClases.cartaTPV();
        ArrayList<Productos> carrito = new ArrayList<>();

        do {
            menu = MetodosDeClases.menuModos();
            switch (menu) {
                case 0 -> {
                    do {
                        menuCarta = MetodosDeClases.menuComida();
                        switch (menuCarta) {
                            case "Carta Comidas" -> {
                                posicion = MetodosDeClases.cartaComidas(menuTPV);
                                carrito = MetodosDeClases.carrito(menuTPV, posicion);
                            }

                            case "Cartas Bebidas" -> {
                                posicion = MetodosDeClases.cartaBebidas(menuTPV);
                                carrito = MetodosDeClases.carrito(menuTPV, posicion);
                            }

                            case "Cartas Postres" -> {

                            }

                            case "Carrito" -> {
                                MetodosDeClases.mostrarArray(carrito);
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
