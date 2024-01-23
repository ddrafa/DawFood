/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package daw;

import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author ddrafa
 */
public class Producto {
    
    //Atributos
    private final String Id;
    private String nomProducto;
    private String descripcion;
    private double precio;
    private CATEGORIA categoria;
    private SUBCATEGORIA subcategoria;
    private int stock;
    private IVA iva;

    public Producto(String nomProducto, String descripcion, double precio,
            CATEGORIA categoria, SUBCATEGORIA subcategoria, int stock, IVA iva) {
        this.nomProducto = nomProducto;
        this.descripcion = descripcion;
        this.iva = iva;
        this.precio = precio+(precio*this.iva.getValue());
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.stock = stock;
        
        String aux = UUID.randomUUID().toString().toUpperCase();
        Stream<Character> digit = aux.chars().mapToObj(i -> (char) i).filter(Character::isDigit).limit(3);
        Stream<Character> alpha = aux.chars().mapToObj(i -> (char) i).filter(Character::isAlphabetic).limit(3);
        List<Character> collect = Stream.concat(digit, alpha).collect(Collectors.toList());
        Collections.shuffle(collect);
        this.Id = collect.stream().map(Object::toString).collect(Collectors.joining());
    }

    public String getId() {
        return Id;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public CATEGORIA getCategoria() {
        return categoria;
    }

    public SUBCATEGORIA getSubcategoria() {
        return subcategoria;
    }

    public int getStock() {
        return stock;
    }

    public IVA getIva() {
        return iva;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCategoria(CATEGORIA categoria) {
        this.categoria = categoria;
    }

    public void setSubcategoria(SUBCATEGORIA subcategoria) {
        this.subcategoria = subcategoria;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setIva(IVA iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("Id=").append(Id);
        sb.append(", nomProducto=").append(nomProducto);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", precio=").append(precio);
        sb.append(", categoria=").append(categoria);
        sb.append(", subcategoria=").append(subcategoria);
        sb.append(", stock=").append(stock);
        sb.append(", iva=").append(iva);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
