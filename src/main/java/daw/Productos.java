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
public class Productos {

    // Atributos encapsulados
    private ArrayList<Comida> comida;
    private ArrayList<Bebida> bebida;
    private ArrayList<Postres> postre;

    // Constructores
    public Productos(ArrayList<Comida> comida, ArrayList<Bebida> bebida,
            ArrayList<Postres> postre) {
        this.comida = comida;
        this.bebida = bebida;
        this.postre = postre;
    }

    public Productos() {
    }

    // Get y Set 
    public ArrayList<Comida> getComida() {
        return comida;
    }

    public void setComida(ArrayList<Comida> comida) {
        this.comida = comida;
    }

    public ArrayList<Bebida> getBebida() {
        return bebida;
    }

    public void setBebida(ArrayList<Bebida> bebida) {
        this.bebida = bebida;
    }

    public ArrayList<Postres> getPostre() {
        return postre;
    }

    public void setPostre(ArrayList<Postres> postre) {
        this.postre = postre;
    }

    // ToString 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String texto1 = "";
        String texto2 = "";
        String texto3 = "";
        for (int i = 0; i < this.comida.size(); i++) {
            texto1 += this.comida.get(i);
        }
        sb.append(texto1);
        for (int i = 0; i < this.bebida.size(); i++) {
            texto2 += this.bebida.get(i);
        }
        sb.append(texto2);
        for (int i = 0; i < this.postre.size(); i++) {
            texto3 += this.postre.get(i);
        }
        sb.append(texto3);
        return sb.toString();
    }
}
