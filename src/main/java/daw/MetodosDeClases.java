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
import java.util.Comparator;
import java.util.InputMismatchException;
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
        menu.add(new Productos("Cerveza",
                Categorias.BEBIDAS, Subcategorias.ALCOHOL,
                1.50, IVA.VENTIUNO));
        menu.add(new Productos("Ron-Cola",
                Categorias.BEBIDAS, Subcategorias.ALCOHOL,
                6.50, IVA.VENTIUNO));
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
        // Muestra la carta y con un split comparo la descripcion seleccionada
        // Con la descripcion de la carta y asi consigo el id del producto para
        // posterior mente meter ese producto al carrito
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
        // Muestra el carrito
        String texto = "";
        DecimalFormat df = new DecimalFormat("#,##");
        if (mostrar.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "No hay nada en el Carrito ");
        }
        for (Productos productos : mostrar) {
            double precioIVA = productos.getPrecio() * productos.getIva().valor;
            String precioIVAF = String.format("%.2f", precioIVA);
            texto += productos.getStock() + " -> Prod: "
                    + productos.getDescripcion() + ", Pre: "
                    + productos.getPrecio() + "€, IVA: "
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
        // Te muestra los dos modos del menu que hay 
        int seleccionMenu = JOptionPane.showOptionDialog(null,
                "Seleccione una opcion",
                "Modos TPV", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Modo Usuario", "Modo Administrador", "Salir"},
                "Modo Usuario");
        return seleccionMenu;
    }

    public static int menuComida() {
        // Muestra la carta del restaurante y depende de lo que elijas 
        // te muestra una subcategoria
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
        // Muestra las subcategorias de comidas y muestra el menu
        // según la subcategoria que hayas elegido
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
        // Muestra las subcategorias de bebidas y muestra el menu
        // según la subcategoria que hayas elegido
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
        int cantidadPositivo = 0;
        boolean repetir = true;
        // Preguntar al usuario la cantidad
        do {
            try {
                cantidad = Integer.parseInt(JOptionPane.showInputDialog(
                        "Ingrese la cantidad que desea para " + menu.get(posicion).getDescripcion()));
                if (cantidad == 0) {
                    JOptionPane.showMessageDialog(null,
                            "Debes introducir un número mayor a 0");
                    continue;
                }
                // Pongo la cantidad en positivo
                cantidadPositivo = Math.abs(cantidad);
                repetir = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,
                        "Introduce los datos correctos", "Información",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } while (repetir);
        // Verificar si hay suficiente stock
        if (cantidadPositivo <= menu.get(posicion).getStock()) {
            // Creo un producto y lo paso al método agregarProducto para ver si existe, 
            // o no, 
            Productos prodCarrito = new Productos(
                    menu.get(posicion).getDescripcion(),
                    menu.get(posicion).getCategoria(),
                    menu.get(posicion).getSc(),
                    menu.get(posicion).getPrecio(),
                    menu.get(posicion).getIva());
            agregarProductosCarrito(carrito, prodCarrito, cantidadPositivo);
            JOptionPane.showMessageDialog(null, "Producto agregado al carrito.",
                    "", JOptionPane.INFORMATION_MESSAGE);
            // Cambia el stock del producto que esta en el menu y va quitando cantidad a la carta
            int nuevoStock = menu.get(posicion).getStock() - cantidadPositivo;
            menu.get(posicion).setStock(nuevoStock);
        } else {
            // Si no hay stock no lo añade 
            JOptionPane.showMessageDialog(null, "No hay suficiente stock para la cantidad deseada.",
                    "", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void agregarProductosCarrito(ArrayList<Productos> carrito,
            Productos productoAAgregar, int cantidad) {
        boolean productoEncontrado = false;
        int nuevoStock = 0;
        // Hago un Comparator por descripcion para verificar si ese producto ya esta en el carrito
        Comparator<Productos> porDescripcion
                = (p1, p2) -> p1.getDescripcion().compareToIgnoreCase(p2.getDescripcion());
        for (Productos productosEnCarrito : carrito) {
            // Si está en el carrito le cambio la cantidad y el precio
            if (porDescripcion.compare(productosEnCarrito, productoAAgregar) == 0) {
                nuevoStock = productosEnCarrito.getStock() + cantidad;
                productosEnCarrito.setStock(nuevoStock);
                double nuevoPrecio = productosEnCarrito.getPrecio() * nuevoStock;
                productosEnCarrito.setPrecio(nuevoPrecio);
                productoEncontrado = true;
                break;
            }
        }
        // Si el producto no está en el carrito lo creo y lo añado
        if (!productoEncontrado) {
            Productos prodCarrito = new Productos(
                    productoAAgregar.getDescripcion(),
                    productoAAgregar.getCategoria(),
                    productoAAgregar.getSc(),
                    productoAAgregar.getPrecio(),
                    productoAAgregar.getIva());
            double nuevoPrecio = productoAAgregar.getPrecio() * cantidad;
            prodCarrito.setPrecio(nuevoPrecio);
            prodCarrito.setStock(cantidad);
            carrito.add(prodCarrito);
        }
    }

    public static void ticket(ArrayList<Productos> array, Tarjeta credito, ArrayList<Ticket> ticket) {
        // Muestro los datos de la tarjeta que hay que poner para continuar
        System.out.println("PAN: " + credito.getPAN());
        System.out.println("CVV: " + credito.getCVV());
        System.out.println("Fecha Vencimiento: " + credito.getFechaVencimiento().getMonthValue()
                + "/" + credito.getFechaVencimiento().getYear());
        System.out.printf("Saldo: %.2f\n", credito.getSaldo());
        int numCVVCliente = 0, numPANCliente = 0, numMesTarjetaCli = 0,
                numAnioTarjetaCli = 0;
        double precioFinal = 0, restarSaldo;
        boolean repetir = true;
        // Sumo el precio Total y se lo paso a la clase Ticket para crearlo
        for (Productos productos : array) {
            precioFinal += productos.getPrecio() * productos.getIva().valor;
        }
        Ticket t1 = new Ticket(precioFinal, array);
        // Le pido los datos al usuario de su tarjeta y si lo ponen mal 
        // vuelve a pedirselos desde el principio, si no tiene saldo no te 
        // deja comprar y te saca del carrito. Si esta todo correcto te muestra el ticket
        do {
            try {
                numPANCliente = Integer.parseInt(JOptionPane.showInputDialog(
                        "Introduce el PAN de tu tarjeta "));
                if (numPANCliente == credito.getPAN()) {
                    JOptionPane.showMessageDialog(null,
                            "PAN Correcto ");
                    numCVVCliente = Integer.parseInt(JOptionPane.showInputDialog(
                            "Introduce el CVV de tu tarjeta "));
                    if (numCVVCliente == credito.getCVV()) {
                        JOptionPane.showMessageDialog(null,
                                "CVV Correcto ");
                        numMesTarjetaCli = Integer.parseInt(JOptionPane.showInputDialog(
                                "Introduce el Mes de tu tarjeta "));
                        if (numMesTarjetaCli == credito.getFechaVencimiento().getMonthValue()) {
                            JOptionPane.showMessageDialog(null,
                                    "Mes Correcto ");
                            numAnioTarjetaCli = Integer.parseInt(JOptionPane.showInputDialog(
                                    "Introduce el Año de tu tarjeta "));
                            if (numAnioTarjetaCli == credito.getFechaVencimiento().getYear()) {
                                JOptionPane.showMessageDialog(null,
                                        "Año Correcto ");
                                if (credito.getSaldo() > precioFinal) {
                                    restarSaldo = credito.getSaldo() - precioFinal;
                                    credito.setSaldo(restarSaldo);
                                    JOptionPane.showMessageDialog(null,
                                            t1);
                                    // Añado el ticket para despues en el modo administrador poder verlo
                                    // Y borro el carrito para poder hacer otra compra desde 0
                                    ticket.add(t1);
                                    array.removeAll(array);
                                } else {
                                    JOptionPane.showMessageDialog(null,
                                            "No tienes saldo sufiente ");
                                    break;
                                }
                            } else {
                                JOptionPane.showMessageDialog(null,
                                        "Año erroneo ");
                                continue;
                            }
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Mes erroneo ");
                            continue;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "CVV erroneo ");
                        continue;
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                            "PAN erroneo ");
                    continue;
                }
                repetir = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,
                        "Introduce los datos correctos", "Información",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } while (repetir);
    }

    public static void noComprar(ArrayList<Productos> array) {
        // Elimina los productos del carrito si no se quiere comprar nada
        JOptionPane.showMessageDialog(null, "Se ha "
                + "eliminado todos los productos del Carrito ");
        array.removeAll(array);
    }

}
