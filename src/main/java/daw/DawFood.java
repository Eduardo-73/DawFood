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
        int menu, posicion = 0, menuCarta;
        ArrayList<Productos> menuTPV = MetodosDeClases.cartaTPV();
        ArrayList<Productos> carrito = new ArrayList<>();

        do {
            menu = MetodosDeClases.menuModos();
            switch (menu) {
                case 0 -> {
                    do {
                        menuCarta = MetodosDeClases.menuComida();
                        switch (menuCarta) {
                            case 0 -> {
                                posicion = MetodosDeClases.cartaComidas(menuTPV);
                                MetodosDeClases.carrito(menuTPV, carrito, posicion);
                            }

                            case 1 -> {
                                posicion = MetodosDeClases.cartaBebidas(menuTPV);
                                MetodosDeClases.carrito(menuTPV, carrito, posicion);
                            }

                            case 2 -> {

                            }

                            case 3 -> {
                                MetodosDeClases.mostrarArray(carrito);
                            }

                        }
                    } while (!(menuCarta == 4));
                }

                case 1 -> {

                }
            }
        } while (!(menu == 2));
    }
}
