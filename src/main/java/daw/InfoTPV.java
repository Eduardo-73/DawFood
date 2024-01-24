/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 *
 * @author adam
 */
public class InfoTPV {
    
    private UUID numSerie;
    private String direccion;
    private LocalDateTime fechaHora;

    public InfoTPV(String direccion) {
        this.direccion = direccion;
        this.fechaHora = LocalDateTime.now();
        this.numSerie = UUID.randomUUID();
    }
 
    public UUID getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(UUID numSerie) {
        this.numSerie = numSerie;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("numSerie{");
        sb.append("numSerie=").append(numSerie);
        sb.append(", direccion=").append(direccion);
        sb.append(", fechaHora=").append(fechaHora);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
