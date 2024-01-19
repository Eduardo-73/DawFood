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

    public static ArrayList<Productos> ensaladas() {
        Productos p1 = new Productos("Ensalada de atún",
                Categorias.COMIDAS, Subcategorias.ENSALADAS,
                12.5, IVA.DIEZ);
        Productos p2 = new Productos("Ensalada de queso de cabra",
                Categorias.COMIDAS, Subcategorias.ENSALADAS,
                18.20, IVA.DIEZ);
        Productos p3 = new Productos("Ensalada César",
                Categorias.COMIDAS, Subcategorias.ENSALADAS,
                10.5, IVA.DIEZ);
        ArrayList<Productos> ensaladas = new ArrayList<>();
        ensaladas.add(p1);
        ensaladas.add(p2);
        ensaladas.add(p3);
        return ensaladas;
    }

    public static ArrayList<Productos> carnes() {
        Productos p1 = new Productos("Pechuga de pollo",
                Categorias.COMIDAS, Subcategorias.CARNES,
                15.00, IVA.DIEZ);
        Productos p2 = new Productos("Entrecot",
                Categorias.COMIDAS, Subcategorias.CARNES,
                23.00, IVA.DIEZ);
        Productos p3 = new Productos("Sécreto",
                Categorias.COMIDAS, Subcategorias.CARNES,
                18.50, IVA.DIEZ);
        ArrayList<Productos> carnes = new ArrayList<>();
        carnes.add(p1);
        carnes.add(p2);
        carnes.add(p3);
        return carnes;
    }

    public static ArrayList<Productos> pescados() {
        Productos p1 = new Productos("Lubina",
                Categorias.COMIDAS, Subcategorias.PESCADOS,
                20.00, IVA.DIEZ);
        Productos p2 = new Productos("Boquerones",
                Categorias.COMIDAS, Subcategorias.PESCADOS,
                12.99, IVA.DIEZ);
        Productos p3 = new Productos("Pez espada",
                Categorias.COMIDAS, Subcategorias.PESCADOS,
                25.00, IVA.DIEZ);
        ArrayList<Productos> pescados = new ArrayList<>();
        pescados.add(p1);
        pescados.add(p2);
        pescados.add(p3);
        return pescados;
    }

    public static ArrayList<Productos> refrescos() {
        Productos p1 = new Productos("Fanta Naranja",
                Categorias.BEBIDAS, Subcategorias.REFRESCOS,
                2.50, IVA.VENTIUNO);
        Productos p2 = new Productos("Coca-cola",
                Categorias.BEBIDAS, Subcategorias.REFRESCOS,
                2.50, IVA.VENTIUNO);
        Productos p3 = new Productos("Ensalada César",
                Categorias.BEBIDAS, Subcategorias.REFRESCOS,
                2.50, IVA.VENTIUNO);
        ArrayList<Productos> refrescos = new ArrayList<>();
        refrescos.add(p1);
        refrescos.add(p2);
        refrescos.add(p3);
        return refrescos;
    }

    public static ArrayList<Productos> alcoholes() {
        Productos p1 = new Productos("Blue Label",
                Categorias.BEBIDAS, Subcategorias.REFRESCOS,
                30.00, IVA.VENTIUNO);
        Productos p2 = new Productos("Double Black Label",
                Categorias.BEBIDAS, Subcategorias.REFRESCOS,
                15.00, IVA.VENTIUNO);
        Productos p3 = new Productos("Red Label",
                Categorias.BEBIDAS, Subcategorias.REFRESCOS,
                12.00, IVA.VENTIUNO);
        ArrayList<Productos> alcohol = new ArrayList<>();
        alcohol.add(p1);
        alcohol.add(p2);
        alcohol.add(p3);
        return alcohol;
    }

    public static ArrayList<Productos> cafesInfusiones() {
        Productos p1 = new Productos("Té de Menta",
                Categorias.BEBIDAS, Subcategorias.REFRESCOS,
                2.50, IVA.DIEZ);
        Productos p2 = new Productos("Café Soló",
                Categorias.BEBIDAS, Subcategorias.REFRESCOS,
                2.50, IVA.DIEZ);
        Productos p3 = new Productos("Café con Leche",
                Categorias.BEBIDAS, Subcategorias.REFRESCOS,
                2.50, IVA.DIEZ);
        ArrayList<Productos> refrescos = new ArrayList<>();
        refrescos.add(p1);
        refrescos.add(p2);
        refrescos.add(p3);
        return refrescos;
    }

    public static String mostrarArray(ArrayList<Productos> mostrar) {
        String texto = "";
        for (int i = 0; i < mostrar.size(); i++) {
            texto += mostrar.get(i) + "\n";
        }
        JOptionPane.showInputDialog(texto);
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

    public static void CartaComidas(ArrayList<Productos> carnes,
            ArrayList<Productos> ensaladas, ArrayList<Productos> pescados) {
        Object menuComida = JOptionPane.showInputDialog(null,
                "¿Qué te apetece?",
                "Menú", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Carnes", "Ensaladas", "Pescados"},
                "Seleccione");
        String seleccionComida = menuComida.toString();
        switch (seleccionComida) {
            case "Carnes" -> {
                mostrarArray(carnes);
            }

            case "Ensaladas" -> {
                mostrarArray(ensaladas);
            }

            case "Pescados" -> {
                mostrarArray(pescados);
            }
        }
    }

    public static void CartaBebidas(ArrayList<Productos> refrescos,
            ArrayList<Productos> alcohol, ArrayList<Productos> cafes) {
        Object menuBebidas = JOptionPane.showInputDialog(null,
                "¿Qué te apetece?",
                "Menú", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Refrescos", "Bebidas Alcohólicas", "Cafés y Infusiones"},
                "Seleccione");
        String seleccionBebida = menuBebidas.toString();
        switch (seleccionBebida) {
            case "Refrescos" -> {
                mostrarArray(refrescos);
            }

            case "Bebidas Alcohólicas" -> {
                mostrarArray(alcohol);
            }

            case "Cafés y Infusiones" -> {
                mostrarArray(cafes);
            }
        }
    }
}
