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

    public static void encender() {
        int menu, posicion = 0, menuCarta, pago;
        ArrayList<Productos> menuTPV = MetodosDeClases.cartaTPV();
        ArrayList<Productos> carrito = new ArrayList<>();
        ArrayList<Ticket> tickets = new ArrayList<>();
        Tarjeta t1 = new Tarjeta("Pepe", 1000.00);
        int seleccionTPV;
        do {
            seleccionTPV = JOptionPane.showOptionDialog(null,
                    "Seleccione una opcion",
                    "DawFood", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Encender TPV", "ApagarTPV"},
                    "Encender TPV");
            switch (seleccionTPV) {
                case 0 -> {

                    do {
                        menu = MetodosDeClases.menuModos();
                        switch (menu) {
                            case 0 -> {
                                do {
                                    menuCarta = MetodosDeClases.menuComida();
                                    switch (menuCarta) {
                                        case 0 -> {
                                            posicion = MetodosDeClases.cartaComidas(menuTPV);
                                            if (posicion != 0) {
                                                MetodosDeClases.carrito(menuTPV, carrito, posicion);
                                            }
                                        }

                                        case 1 -> {
                                            posicion = MetodosDeClases.cartaBebidas(menuTPV);
                                            if (posicion != 0) {
                                                MetodosDeClases.carrito(menuTPV, carrito, posicion);
                                            }
                                        }

                                        case 2 -> {
                                            posicion = MetodosDeClases.mostrarArray(menuTPV,
                                                    Categorias.POSTRES, Subcategorias.POSTRES);
                                            if (posicion != 0) {
                                                MetodosDeClases.carrito(menuTPV, carrito, posicion);
                                            }
                                        }

                                        case 3 -> {
                                            if (carrito.isEmpty()) {
                                                JOptionPane.showMessageDialog(null,
                                                        "No hay nada en el Carrito ");
                                            } else {
                                                pago = MetodosDeClases.mostrarCarrito(carrito);
                                                switch (pago) {
                                                    case 0 -> {
                                                        MetodosDeClases.ticket(carrito, t1, tickets);
                                                    }
                                                    case 1 -> {
                                                        MetodosDeClases.noComprar(carrito);
                                                    }
                                                    case 2 -> {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } while (!(menuCarta == 4));
                            }

                            case 1 -> {
                                boolean contraseña = metodosAdmin.introducirContraseña();
                                if (contraseña == false) {
                                    break;
                                }
                                int accion = accion = metodosAdmin.mostrarAcciones();
                                switch (accion) {
                                    case 0 -> {
                                        metodosAdmin.añadirProducto(menuTPV);
                                    }

                                    case 1 -> {
                                        metodosAdmin.editarProducto(menuTPV);
                                    }

                                    case 2 -> {
                                        metodosAdmin.eliminarProducto(menuTPV);
                                    }

                                    case 3 -> {
                                        metodosAdmin.comprobarVentas(tickets);
                                    }

                                    case 4 -> {
                                        break;
                                    }
                                }
                            }
                        }
                    } while (!(menu == 2));
                }
            }
        } while (!(seleccionTPV == 1));
    }
}
