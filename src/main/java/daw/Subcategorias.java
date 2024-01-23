/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package daw;

/**
 *
 * @author eduar
 */
public enum Subcategorias {
    
    ENSALADAS("Ensaladas "),
    CARNES("Carnes "),
    PESCADOS("Pescados "),
    REFRESCOS("Bebidas con Gas "),
    ALCOHOL("Bebidas alcohólicas"),
    CAFES("Cafes e Infusiones "),
    POSTRES("Postres Caseros");
    
    String valorCategoria;

    private Subcategorias(String valorCategoria) {
        this.valorCategoria = valorCategoria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(valorCategoria);
        return sb.toString();
    }
    
    
    
    
}
