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
public class Carrito {
    //Atributo del carrito
    private ArrayList<Producto> listaSeleccionados = new ArrayList<>();

    public Carrito() {
    }

    public ArrayList<Producto> getListaSeleccionados() {
        return listaSeleccionados;
    }

    public void setListaSeleccionados(ArrayList<Producto> listaSeleccionados) {
        this.listaSeleccionados = listaSeleccionados;
    }

    public void agregarProducto(Producto p) {
        listaSeleccionados.add(p);
    }
    
    public void eliminarProducto(Producto p) {
        listaSeleccionados.remove(listaSeleccionados.indexOf(p));
    }

    public double precioTotal() {
        double acum=0;
        for(Producto p : listaSeleccionados){
            acum+=p.getPrecio();
        }
        return acum;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carrito:").append("\n");
        for(int i = 0;i<listaSeleccionados.size();i++){
            sb.append(i+1).append(".- ")
                    .append(listaSeleccionados.get(i).getNomProducto())
                    .append(" ").append(listaSeleccionados.get(i)
                            .getPrecio()).append("€").append("\n");
        }
        return sb.toString();
    }
    
    
}
