/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;

/**
 *
 * @author edu
 */
public class MetodosDeClases {

    public ArrayList<Productos> ensaladas() {
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

    public ArrayList<Productos> carnes() {
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

    public ArrayList<Productos> pescados() {
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
    
    
}
