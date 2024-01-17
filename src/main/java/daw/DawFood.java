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

        String menuSegundario = """
                               ************************ 
                                1.- Menú Comida
                                2.- Menú Bebida
                                3-. Menú Postres 
                                4-. Mostrar Carrito
                               ************************
                                """;

        String color = JOptionPane.showInputDialog(null, "Seleccione Un Color",
                "Modos", JOptionPane.QUESTION_MESSAGE, null,
                new String[]{"Modo Usuario", "Modo Administrador"}, "Seleccione");
    }
}
