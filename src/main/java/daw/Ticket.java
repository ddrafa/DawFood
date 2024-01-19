/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;

/**
 *
 * @author ddrafa
 */
public class Ticket {

//Atributos de Ticket
    private ArrayList<Producto> listaTicket = new ArrayList<>();
    private double Total;
    
//El constructor está vacío porque por ahora no vamos a rellenar nada 
    public Ticket() {
    }

    public ArrayList<Producto> getListaTicket() {
        return listaTicket;
    }

    public double getTotal() {
        return Total;
    }

    public void setListaTicket(ArrayList<Producto> listaTicket) {
        this.listaTicket = listaTicket;
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
        for (int i = 0; i < listaTicket.size(); i++) {
            sb.append(i + 1).append(".- ").append(listaTicket.get(i)).append("----").append(listaTicket.get(i).nomProducto).append("\n");
        }
        sb.append("-------------------------------------------------").append("\n");
        sb.append(", Total=").append(Total);
        return sb.toString();
    }

    public void descartarProducto() {

    }
}
