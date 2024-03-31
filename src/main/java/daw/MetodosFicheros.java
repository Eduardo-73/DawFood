/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class MetodosFicheros {

    public static void main(String[] args) {
        List<String> fichero = leerFichero();
        fichero.forEach(System.out::println);
        List<Productos> listaProd = listaProductos(fichero);
        listaProd.forEach(System.out::println);
    }

    public static List<String> leerFichero() {
        List<String> fichero = new ArrayList();
        String ficha = "productos.csv";
        try {
            fichero = Files.readAllLines(Paths.get(ficha));
        } catch (IOException ioe) {
            System.out.println("Error");
        }
        return fichero;
    }

    public static List<Productos> listaProductos(List<String> lista) {
        lista.remove(0);
        List<Productos> listaProductos = new ArrayList();
        for (String fichero : lista) {
            String[] array = fichero.split(",");
            String desProd = array[0];
            Categorias catProd = Categorias.valueOf(array[1]);
            Subcategorias subCatProd = Subcategorias.valueOf(array[2]);
            double precProd = Double.parseDouble(array[3]);
            IVA ivaProd = IVA.valueOf(array[4]);
            Productos prod = new Productos(desProd, catProd,
                    subCatProd, precProd, ivaProd);
            listaProductos.add(prod);
        }
        return listaProductos;
    }
}
