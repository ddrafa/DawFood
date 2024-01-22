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
        listaSeleccionados.remove(p);
    }
    
    public void masProducto(Producto p, int cuantos) {
        for(int i = 1;i<=cuantos;i++){
        listaSeleccionados.add(p);
        }
    }
}
