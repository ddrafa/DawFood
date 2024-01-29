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
    private SUBCATEGORIAHAMBURGUESA subCategoriaH;
    private SUBCATEGORIABEBIDA subCategoriaB;
    private SUBCATEGORIAENTRANTE subCategoriaE;
    private SUBCATEGORIAOTROS subCategoriaO;
    private int stock;
    private final IVA iva;

    public Producto(String nomProducto, String descripcion, double precio,
            CATEGORIA categoria, SUBCATEGORIAHAMBURGUESA subcategoria, int stock, IVA iva) {
        this.nomProducto = nomProducto;
        this.descripcion = descripcion;
        this.iva = iva;
        this.precio = precio + (precio * this.iva.getValue());
        this.categoria = categoria;
        this.subCategoriaH = subcategoria;
        this.stock = stock;

        String aux = UUID.randomUUID().toString().toUpperCase();
        Stream<Character> digit = aux.chars().mapToObj(i -> (char) i).filter(Character::isDigit).limit(3);
        Stream<Character> alpha = aux.chars().mapToObj(i -> (char) i).filter(Character::isAlphabetic).limit(3);
        List<Character> collect = Stream.concat(digit, alpha).collect(Collectors.toList());
        Collections.shuffle(collect);
        this.Id = collect.stream().map(Object::toString).collect(Collectors.joining());
    }

    public Producto(String nomProducto, String descripcion, double precio,
            CATEGORIA categoria, SUBCATEGORIABEBIDA subcategoria, int stock, IVA iva) {
        this.nomProducto = nomProducto;
        this.descripcion = descripcion;
        this.iva = iva;
        this.precio = precio + (precio * this.iva.getValue());
        this.categoria = categoria;
        this.subCategoriaB = subcategoria;
        this.stock = stock;

        String aux = UUID.randomUUID().toString().toUpperCase();
        Stream<Character> digit = aux.chars().mapToObj(i -> (char) i).filter(Character::isDigit).limit(3);
        Stream<Character> alpha = aux.chars().mapToObj(i -> (char) i).filter(Character::isAlphabetic).limit(3);
        List<Character> collect = Stream.concat(digit, alpha).collect(Collectors.toList());
        Collections.shuffle(collect);
        this.Id = collect.stream().map(Object::toString).collect(Collectors.joining());
    }

    public Producto(String nomProducto, String descripcion, double precio,
            CATEGORIA categoria, SUBCATEGORIAENTRANTE subcategoria, int stock, IVA iva) {
        this.nomProducto = nomProducto;
        this.descripcion = descripcion;
        this.iva = iva;
        this.precio = precio + (precio * this.iva.getValue());
        this.categoria = categoria;
        this.subCategoriaE = subcategoria;
        this.stock = stock;

        String aux = UUID.randomUUID().toString().toUpperCase();
        Stream<Character> digit = aux.chars().mapToObj(i -> (char) i).filter(Character::isDigit).limit(3);
        Stream<Character> alpha = aux.chars().mapToObj(i -> (char) i).filter(Character::isAlphabetic).limit(3);
        List<Character> collect = Stream.concat(digit, alpha).collect(Collectors.toList());
        Collections.shuffle(collect);
        this.Id = collect.stream().map(Object::toString).collect(Collectors.joining());
    }

    public Producto(String nomProducto, String descripcion, double precio,
            CATEGORIA categoria, SUBCATEGORIAOTROS subcategoria, int stock, IVA iva) {
        this.nomProducto = nomProducto;
        this.descripcion = descripcion;
        this.iva = iva;
        this.precio = precio + (precio * this.iva.getValue());
        this.categoria = categoria;
        this.subCategoriaO = subcategoria;
        this.stock = stock;

        String aux = UUID.randomUUID().toString().toUpperCase();
        Stream<Character> digit = aux.chars().mapToObj(i -> (char) i).filter(Character::isDigit).limit(3);
        Stream<Character> alpha = aux.chars().mapToObj(i -> (char) i).filter(Character::isAlphabetic).limit(3);
        List<Character> collect = Stream.concat(digit, alpha).collect(Collectors.toList());
        Collections.shuffle(collect);
        this.Id = collect.stream().map(Object::toString).collect(Collectors.joining());
    }

    //getters y setters
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

    public SUBCATEGORIAHAMBURGUESA getSubCategoriaH() {
        return subCategoriaH;
    }

    public int getStock() {
        return stock;
    }

    public IVA getIva() {
        return iva;
    }

    public SUBCATEGORIABEBIDA getSubCategoriaB() {
        return subCategoriaB;
    }

    public SUBCATEGORIAENTRANTE getSubCategoriaE() {
        return subCategoriaE;
    }

    public SUBCATEGORIAOTROS getSubCategoriaO() {
        return subCategoriaO;
    }

    public void setSubCategoriaB(SUBCATEGORIABEBIDA subCategoriaB) {
        this.subCategoriaB = subCategoriaB;
    }

    public void setSubCategoriaE(SUBCATEGORIAENTRANTE subCategoriaE) {
        this.subCategoriaE = subCategoriaE;
    }

    public void setSubCategoriaO(SUBCATEGORIAOTROS subCategoriaO) {
        this.subCategoriaO = subCategoriaO;
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

    public void setSubCategoriaH(SUBCATEGORIAHAMBURGUESA subCategoriaH) {
        this.subCategoriaH = subCategoriaH;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("Id=").append(Id);
        sb.append(", nomProducto=").append(nomProducto);
        sb.append(", stock=").append(stock);
        sb.append(", precio=").append(precio);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", categoria=").append(categoria);
        sb.append(", subcategoria=").append(subCategoriaH);
        sb.append(", iva=").append(iva);
        sb.append('}');
        return sb.toString();
    }

    public void setStockMenos(int stock) {
        this.stock = stock--;
    }
}
