/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author edu
 */
public class MetodosDeClases {

    public static ArrayList<Productos> cartaTPV() {
        ArrayList<Productos> menu = new ArrayList<>();
        menu.add(new Productos("Ensalada de atún",
                Categorias.COMIDAS, Subcategorias.ENSALADAS,
                12.5, IVA.DIEZ));
        menu.add(new Productos("Ensalada de queso de cabra",
                Categorias.COMIDAS, Subcategorias.ENSALADAS,
                18.20, IVA.DIEZ));
        menu.add(new Productos("Ensalada César",
                Categorias.COMIDAS, Subcategorias.ENSALADAS,
                10.5, IVA.DIEZ));
        menu.add(new Productos("Pechuga de pollo",
                Categorias.COMIDAS, Subcategorias.CARNES,
                15.00, IVA.DIEZ));
        menu.add(new Productos("Entrecot",
                Categorias.COMIDAS, Subcategorias.CARNES,
                23.00, IVA.DIEZ));
        menu.add(new Productos("Sécreto",
                Categorias.COMIDAS, Subcategorias.CARNES,
                18.50, IVA.DIEZ));
        menu.add(new Productos("Lubina",
                Categorias.COMIDAS, Subcategorias.PESCADOS,
                20.00, IVA.DIEZ));
        menu.add(new Productos("Boquerones",
                Categorias.COMIDAS, Subcategorias.PESCADOS,
                12.99, IVA.DIEZ));
        menu.add(new Productos("Pez espada",
                Categorias.COMIDAS, Subcategorias.PESCADOS,
                25.00, IVA.DIEZ));
        menu.add(new Productos("Fanta Naranja",
                Categorias.BEBIDAS, Subcategorias.REFRESCOS,
                2.50, IVA.VENTIUNO));
        menu.add(new Productos("Coca-cola",
                Categorias.BEBIDAS, Subcategorias.REFRESCOS,
                2.50, IVA.VENTIUNO));
        menu.add(new Productos("Sprite",
                Categorias.BEBIDAS, Subcategorias.REFRESCOS,
                2.50, IVA.VENTIUNO));
        menu.add(new Productos("Blue Label",
                Categorias.BEBIDAS, Subcategorias.ALCOHOL,
                30.00, IVA.VENTIUNO));
        menu.add(new Productos("Double Black Label",
                Categorias.BEBIDAS, Subcategorias.ALCOHOL,
                15.00, IVA.VENTIUNO));
        menu.add(new Productos("Red Label",
                Categorias.BEBIDAS, Subcategorias.ALCOHOL,
                12.00, IVA.VENTIUNO));
        menu.add(new Productos("Té de Menta",
                Categorias.BEBIDAS, Subcategorias.CAFES,
                2.50, IVA.DIEZ));
        menu.add(new Productos("Café Soló",
                Categorias.BEBIDAS, Subcategorias.CAFES,
                2.50, IVA.DIEZ));
        menu.add(new Productos("Café con Leche",
                Categorias.BEBIDAS, Subcategorias.CAFES,
                2.50, IVA.DIEZ));
        menu.add(new Productos("Tarta de Queso",
                Categorias.POSTRES, Subcategorias.POSTRES,
                6.00, IVA.DIEZ));
        menu.add(new Productos("Flan de Huevo",
                Categorias.POSTRES, Subcategorias.POSTRES,
                6.00, IVA.DIEZ));
        menu.add(new Productos("Leche frita",
                Categorias.POSTRES, Subcategorias.POSTRES,
                6.00, IVA.DIEZ));
        return menu;
    }

    public static int mostrarArray(ArrayList<Productos> mostrar, Categorias c,
            Subcategorias sc) {
        String[] texto = new String[mostrar.size()];
        int contador = 0;
        for (Productos productos : mostrar) {
            if (productos.getCategoria() == c && productos.getSc() == sc) {
                texto[contador++] = "Producto: /"
                        + productos.getDescripcion()
                        + "/ Precio: " + productos.getPrecio() + "€";
            }
        }
        String seleccion = (String) JOptionPane.showInputDialog(
                null,
                "Selecciona un producto",
                "Menú",
                JOptionPane.QUESTION_MESSAGE,
                null, texto,
                texto[0]);
        if (seleccion == null) {
            return 0;
        }
        String[] partes = seleccion.split("/");
        String parteDes = partes[1];
        int idSeleccionada = 0;
        for (Productos producto : mostrar) {
            if (parteDes.equals(producto.getDescripcion())) {
                idSeleccionada = producto.getId();
                break;
            }
        }
        return idSeleccionada;
    }

    public static int mostrarCarrito(ArrayList<Productos> mostrar) {
        String texto = "";
        DecimalFormat df = new DecimalFormat("#,##");
        if (mostrar.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "No hay nada en el Carrito ");
        }
        for (Productos productos : mostrar) {
            double precioIVA = productos.getPrecio() * productos.getIva().valor;
            String precioIVAF = String.format("%.2f", precioIVA);
            texto += "Cantidad " + productos.getStock() + ", Producto "
                    + productos.getDescripcion()
                    + ", Precio " + productos.getPrecio() + "€, Precio con IVA "
                    + precioIVAF + "€\n";
        }
        int pago = JOptionPane.showOptionDialog(null,
                texto, "Pago", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Pagar", "No comprar", "Segui Comprando"},
                "Modo Usuario");
        return pago;
    }

    public static int menuModos() {
        int seleccionMenu = JOptionPane.showOptionDialog(null,
                "Seleccione una opcion",
                "Modos TPV", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Modo Usuario", "Modo Administrador", "Salir"},
                "Modo Usuario");
        return seleccionMenu;
    }

    public static int menuComida() {
        int menuComida = JOptionPane.showOptionDialog(null,
                "Seleccione Una Opción",
                "Menú", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Carta Comidas", "Cartas Bebidas", "Cartas Postres",
                    "Carrito", "Salir"},
                "Seleccione");
        return menuComida;
    }

    public static int cartaComidas(ArrayList<Productos> menu) {
        int posicion = 0;
        Object menuComida = JOptionPane.showInputDialog(null,
                "¿Qué te apetece?",
                "Menú", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Carnes", "Ensaladas", "Pescados"},
                "Seleccione");
        if (menuComida == null) {
            return posicion;
        }
        String seleccionComida = menuComida.toString();
        switch (seleccionComida) {
            case "Carnes" -> {
                posicion = mostrarArray(menu, Categorias.COMIDAS,
                        Subcategorias.CARNES);
            }

            case "Ensaladas" -> {
                posicion = mostrarArray(menu, Categorias.COMIDAS,
                        Subcategorias.ENSALADAS);
            }

            case "Pescados" -> {
                posicion = mostrarArray(menu, Categorias.COMIDAS,
                        Subcategorias.PESCADOS);
            }
        }
        return posicion;
    }

    public static int cartaBebidas(ArrayList<Productos> menu) {
        int posicion = 0;
        Object menuBebidas = JOptionPane.showInputDialog(null,
                "¿Qué te apetece?",
                "Menú", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Refrescos", "Bebidas Alcohólicas", "Cafés y Infusiones"},
                "Seleccione");
        if (menuBebidas == null) {
            return posicion;
        }
        String seleccionBebida = menuBebidas.toString();
        switch (seleccionBebida) {
            case "Refrescos" -> {
                posicion = mostrarArray(menu, Categorias.BEBIDAS,
                        Subcategorias.REFRESCOS);
            }

            case "Bebidas Alcohólicas" -> {
                posicion = mostrarArray(menu, Categorias.BEBIDAS,
                        Subcategorias.ALCOHOL);
            }

            case "Cafés y Infusiones" -> {
                posicion = mostrarArray(menu, Categorias.BEBIDAS,
                        Subcategorias.CAFES);
            }
        }
        if (seleccionBebida == null) {
            return 0;
        }
        return posicion;
    }

    public static void carrito(ArrayList<Productos> menu,
            ArrayList<Productos> carrito, int posicion) {
        int cantidad = 0;
        boolean repetir = true;
        // Preguntar al usuario la cantidad
        do {
            try {
                cantidad = Integer.parseInt(JOptionPane.showInputDialog(
                        "Ingrese la cantidad que desea para " + menu.get(posicion).getDescripcion()));
                repetir = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,
                        "Introduce los datos correctos", "Información",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } while (repetir);
        // Verificar si hay suficiente stock
        if (cantidad <= menu.get(posicion).getStock()) {
            // Agregar al carrito con la cantidad especificada
            Productos prodCarrito = new Productos(
                    menu.get(posicion).getDescripcion(),
                    menu.get(posicion).getCategoria(),
                    menu.get(posicion).getSc(),
                    menu.get(posicion).getPrecio(),
                    menu.get(posicion).getIva());
            double nuevoPrecio = menu.get(posicion).getPrecio() * cantidad;
            prodCarrito.setPrecio(nuevoPrecio);
            prodCarrito.setStock(cantidad);
            carrito.add(prodCarrito);
            JOptionPane.showMessageDialog(null, "Producto agregado al carrito.",
                    "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No hay suficiente stock para la cantidad deseada.",
                    "", JOptionPane.ERROR_MESSAGE);
        }
        int nuevoStock = menu.get(posicion).getStock() - cantidad;
        menu.get(posicion).setStock(nuevoStock);
    }

    public static void ticket(ArrayList<Productos> array, Tarjeta credito, ArrayList<Ticket> ticket) {
        System.out.println("CVV: " + credito.getCVV());
        System.out.println("PAN: " + credito.getPAN());
        int numCVVCliente = 0;
        double precioFinal = 0, restarSaldo;
        for (Productos productos : array) {
            precioFinal += productos.getPrecio() * productos.getIva().valor;
        }
        System.out.println(precioFinal);
        Ticket t1 = new Ticket(precioFinal, array);
        do {
            numCVVCliente = Integer.parseInt(JOptionPane.showInputDialog(
                    "Introduce el CVV de tu tarjeta "));
            if (numCVVCliente == credito.getCVV()) {
                JOptionPane.showMessageDialog(null,
                        "CVV Correcto ");
                if (credito.getSaldo() > precioFinal) {
                    restarSaldo = credito.getSaldo() - precioFinal;
                    credito.setSaldo(restarSaldo);
                    JOptionPane.showMessageDialog(null,
                            t1);
                    ticket.add(t1);
                    array.removeAll(array);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "No tienes saldo sufiente ");
                    break;
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "CVV erroneo ");
            }
        } while (numCVVCliente != credito.getCVV());
    }

    public static void noComprar(ArrayList<Productos> array) {
        JOptionPane.showMessageDialog(null, "Se van a "
                + "eliminar todos los productos del Carrito ");
        array.removeAll(array);
    }

}
