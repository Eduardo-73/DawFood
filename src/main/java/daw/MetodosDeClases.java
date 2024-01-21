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
        return menu;
    }

    public static int mostrarArray(ArrayList<Productos> mostrar, Categorias c,
            Subcategorias sc) {
        String texto = "";
        for (Productos productos : mostrar) {
            if (productos.getCategoria() == c && productos.getSc() == sc) {
                texto += productos + "\n";
            }
        }
        int posicion = Integer.parseInt(JOptionPane.showInputDialog(texto));
        return posicion;
    }

    public static String mostrarArray(ArrayList<Productos> mostrar) {
        String texto = "";
        for (Productos productos : mostrar) {
            texto += productos + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
        return texto;
    }

    public static int menuModos() {
        int seleccionMenu = JOptionPane.showOptionDialog(null,
                "Seleccione una opcion",
                "Modos TPV", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Modo Usuario", "Modo Administrador"},
                "Modo Usuario");
        return seleccionMenu;
    }

    public static String menuComida() {
        Object menuComida = JOptionPane.showInputDialog(null,
                "Seleccione Una Opción",
                "Menú", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Carta Comidas", "Cartas Bebidas", "Cartas Postres",
                    "Carrito"},
                "Seleccione");
        String seleccionComida = menuComida.toString();
        return seleccionComida;
    }

    public static int cartaComidas(ArrayList<Productos> menu) {
        int posicion = 0;
        Object menuComida = JOptionPane.showInputDialog(null,
                "¿Qué te apetece?",
                "Menú", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Carnes", "Ensaladas", "Pescados"},
                "Seleccione");
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
        return posicion;
    }

    public static ArrayList<Productos> carrito(ArrayList<Productos> menu,
            int posicion) {
        ArrayList<Productos> carrito = new ArrayList<>();
        // Preguntar al usuario la cantidad
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingrese la cantidad que desea para " + menu.get(posicion).getDescripcion()));
        // Verificar si hay suficiente stock
        if (cantidad <= menu.get(posicion).getStock()) {
            // Agregar al carrito con la cantidad especificada
            carrito.add(menu.get(posicion));
            JOptionPane.showMessageDialog(null, "Producto agregado al carrito.");
        } else {
            JOptionPane.showMessageDialog(null, "No hay suficiente stock para la cantidad deseada.");
        }
        return carrito;
    }
}
