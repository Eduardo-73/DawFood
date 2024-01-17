/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package daw;

/**
 *
 * @author eduar
 */
public enum Categorias {
    
    COMIDAS ("Comidas del menú"),
    BEBIDAS ("Bebidas del menú"),
    POSTRES ("Postres del menú");
    
    String valorCategorias;

    private Categorias(String valorCategorias) {
        this.valorCategorias = valorCategorias;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(valorCategorias);
        return sb.toString();
    }
    
    
}
