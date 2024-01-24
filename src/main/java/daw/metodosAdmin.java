/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class metodosAdmin {

    public static int mostrarAcciones() {
        int seleccion = JOptionPane.showOptionDialog(null,
                "Seleccione una acción de admin",
                "Modo Administrador", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Añadir Producto", "Editar Producto", "Eliminar Producto"},
                "Comidas");

        return seleccion;
    }

    public static boolean introducirContraseña() {
        String contraseña2 = generarPasswd();
        boolean acceder = true;
        for (int i = 0; i < 3; i++) {
            String contraseña = JOptionPane.showInputDialog(null,
                    "Introduce la contraseña", "Verificación de contraseña",
                    JOptionPane.QUESTION_MESSAGE);
            int intento = i + 1;
            if (contraseña.equals(contraseña2)) {
                JOptionPane.showMessageDialog(null, "Contraseña correcta ", contraseña, 1);
                acceder = true;
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña erronea " + " intento " + intento + "/3", contraseña, 0);
                acceder = false;
            }
        }
        
        return acceder;
    }

    public static String generarPasswd() {
        Random random = new Random();
        String minus = "abcdefghijklmnñopqrstuvwxyz";
        String mayus = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String numeros = "0123456789";
        String especial = "#$%&()*+,-.:;<=>@";
        String suma = minus + mayus + numeros + especial;
        StringBuilder contraseña = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            int pos = random.nextInt(suma.length());
            char letra = suma.charAt(pos);
            contraseña.append(letra);
        }
        System.out.println(contraseña);
        return contraseña.toString();
    }

    public static void añadirProducto(ArrayList<Productos> menu) {
        Categorias cat;
        Subcategorias sub = null;

        //Pide descripcion nueva
        String desc = JOptionPane.showInputDialog("Introduce la descripcion del producto");

        //Pide que categoria es el producto
        Object aux = JOptionPane.showInputDialog(null,
                "Que categoria es el producto", "Agregar producto",
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Comida", "Bebida", "Postre"}, "Seleccione");

        if (aux.equals("Comida")) {
            cat = Categorias.COMIDAS;
            //Pide subcategoria
            Object aux2 = JOptionPane.showInputDialog(null,
                    "Que subcategoria es el producto", "Agregar producto",
                    JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Ensalada", "Carne", "Pescado"}, "Seleccione");
            if (aux2.equals("Ensalada")) {
                sub = Subcategorias.ENSALADAS;
            } else if (aux2.equals("Carne")) {
                sub = Subcategorias.CARNES;
            } else {
                sub = Subcategorias.PESCADOS;
            }
        } else if (aux.equals("Bebida")) {
            cat = Categorias.BEBIDAS;
            //Pide subcategoria
            Object aux2 = JOptionPane.showInputDialog(null,
                    "Que subcategoria es el producto", "Agregar producto",
                    JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Resfrescos", "Alcohol", "Cafe"}, "Seleccione");
            if (aux2.equals("Resfrescos")) {
                sub = Subcategorias.REFRESCOS;
            } else if (aux2.equals("Alcohol")) {
                sub = Subcategorias.ALCOHOL;
            } else {
                sub = Subcategorias.CAFES;
            }
        } else {
            cat = Categorias.POSTRES;
            sub = Subcategorias.POSTRES;
        }

        //Pide precio
        double precio = 0;
        boolean repetir = true;
        do {
            try {
                precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto"));
                repetir = false;
            } catch (NumberFormatException iae) {
                JOptionPane.showMessageDialog(null, "Datos eroneos introduce de nuevo");
                repetir = true;
            }
        } while (repetir);
        //pone IVA dependiendo del producto
        IVA iva;
        if (sub.equals(Subcategorias.REFRESCOS) || sub.equals(Subcategorias.ALCOHOL)) {
            iva = IVA.VENTIUNO;
        } else {
            iva = IVA.DIEZ;
        }

        menu.add(new Productos(desc, cat, sub, precio, iva));
    }

    public static void editarProducto(ArrayList<Productos> menuTPV) {
        int posicion = 0;
        Categorias categoria;
        //seleccion de producto
        int seleccion = JOptionPane.showOptionDialog(null,
                "Seleccione una opcion",
                "Eleccion producto a cambiar", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Comidas", "Bebidas", "Postres"},
                "Comidas");

        switch (seleccion) {
            case 0 -> {
                posicion = MetodosDeClases.cartaComidas(menuTPV);
            }
            case 1 -> {
                posicion = MetodosDeClases.cartaBebidas(menuTPV);
            }
            case 2 -> {
                posicion = MetodosDeClases.mostrarArray(menuTPV,
                        Categorias.POSTRES, Subcategorias.POSTRES);
            }
        }
        //Seleccion de campo que quieres que cambiar del producto anterirmente seleccionado
        int campoCambiar = JOptionPane.showOptionDialog(null,
                "Seleccione una opcion para cambiar",
                "Eleccion campo a cambiar", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Descripcion", "Precio", "Categoria", "Subcategoria", "IVA"},
                "Precio");
        switch (campoCambiar) {
            case 0 -> {
                String desc = JOptionPane.showInputDialog("Introduce la nueva descripcion del producto");
                menuTPV.get(posicion).setDescripcion(desc);
            }

            case 1 -> {
                boolean repetir = true;
                double precio = 0;
                do {
                    try {
                        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto"));
                        repetir = false;
                    } catch (NumberFormatException iae) {
                        JOptionPane.showMessageDialog(null, "Datos eroneos introduce de nuevo");
                        repetir = true;
                    }
                } while (repetir);
                menuTPV.get(posicion).setPrecio(precio);
            }

            case 2 -> {
                categoria = (Categorias) JOptionPane.showInputDialog(
                        null, "Seleccione la nueva categoría",
                        "Elección categoría", JOptionPane.PLAIN_MESSAGE,
                        null, Categorias.values(),
                        Categorias.COMIDAS);
                menuTPV.get(posicion).setCategoria(categoria);
            }

            case 3 -> {
                Subcategorias subcategoria = (Subcategorias) JOptionPane.showInputDialog(
                        null, "Seleccione la nueva subcategoria",
                        "Elección subcategoria", JOptionPane.PLAIN_MESSAGE,
                        null, Subcategorias.values(),
                        Subcategorias.ALCOHOL);
                menuTPV.get(posicion).setSc(subcategoria);
            }

            case 4 -> {
                IVA iva = (IVA) JOptionPane.showInputDialog(
                        null, "Seleccione el nuevo Iva",
                        "Elección iva", JOptionPane.PLAIN_MESSAGE,
                        null, IVA.values(),
                        IVA.DIEZ);
                menuTPV.get(posicion).setIva(iva);
            }
        }
    }

    public static void eliminarProducto(ArrayList<Productos> menuTPV) {
        int posicion = 0;
        //seleccion de producto
        int seleccion = JOptionPane.showOptionDialog(null,
                "Seleccione una opcion",
                "Eleccion producto a eliminar", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Comidas", "Bebidas", "Postres"},
                "Comidas");

        switch (seleccion) {
            case 0 -> {
                posicion = MetodosDeClases.cartaComidas(menuTPV);
            }
            case 1 -> {
                posicion = MetodosDeClases.cartaBebidas(menuTPV);
            }
            case 2 -> {
                posicion = MetodosDeClases.mostrarArray(menuTPV,
                        Categorias.POSTRES, Subcategorias.POSTRES);
            }
        }
        //Eliminar producto
        menuTPV.remove(posicion);
    }
}
