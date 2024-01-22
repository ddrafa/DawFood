/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDateTime;

/**
 *
 * @author ddrafa
 */
public class Ticket {

//Atributos de Ticket
    private Carrito Carrito;
    private double Total;
    private LocalDateTime fechaTicket = LocalDateTime.now();
    private Tarjeta tarjeta;
//El constructor está vacío porque por ahora no vamos a rellenar nada 
    public Ticket() {
    }

    public Carrito getCarrito() {
        return Carrito;
    }

    public double getTotal() {
        return Total;
    }

    public void setCarrito(Carrito Carrito) {
        this.Carrito = Carrito;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
    
    
//toString personalizado para el ticket con el listado de productos, su respectivo precio y el total
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------------------------------------").append("\n");
        sb.append("Ticket:").append("\n");
        sb.append("-------------------------------------------------").append("\n");
        for (int i = 0; i < Carrito.getListaSeleccionados().size(); i++) {
            sb.append(i + 1).append(".- ").append(Carrito.getListaSeleccionados().get(i))
                    .append("----").append(Carrito.getListaSeleccionados().get(i).getNomProducto()).append("\n");
        }
        sb.append("-------------------------------------------------").append("\n");
        sb.append(", Total=").append(Total);
        sb.append("-------------------------------------------------").append("\n");
        sb.append("Fecha: ").append(fechaTicket);
        sb.append("-------------------------------------------------").append("\n");
        sb.append("Tarjeta con la que se ha realizado el pago: ").append(tarjeta.getNumeroTarjeta());
        return sb.toString();
    }
}
