/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author ddrafa
 */
public class Ticket {

//Atributos de Ticket
    private final String ID;
    private double Total;
    private final ArrayList<Producto> listaProductos;
    private LocalDateTime fechaTicket = LocalDateTime.now();
    private Tarjeta tarjeta;
//El constructor está compuesto solo por la lista del carrito y un id propio de 5 digitos
    public Ticket(Carrito carrito) {
        this.listaProductos=carrito.getListaSeleccionados();
        
        String aux = UUID.randomUUID().toString().toUpperCase();
        Stream<Character> digit = aux.chars().mapToObj(i -> (char) i).filter(Character::isDigit).limit(3);
        Stream<Character> alpha = aux.chars().mapToObj(i -> (char) i).filter(Character::isAlphabetic).limit(3);
        List<Character> collect = Stream.concat(digit, alpha).collect(Collectors.toList());
        Collections.shuffle(collect);
        this.ID = collect.stream().map(Object::toString).collect(Collectors.joining());
    }

    public ArrayList<Producto> getlistaProductos() {
        return listaProductos;
    }

    public double getTotal() {
        return Total;
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
        for (int i = 0; i < listaProductos.size();i++) {
            sb.append(i + 1).append(".- ").append(listaProductos.get(i))
                    .append("----").append(listaProductos.get(i).getNomProducto()).append("\n");
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
