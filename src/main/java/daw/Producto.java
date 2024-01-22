/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package daw;

/**
 *
 * @author ddrafa
 */
public class Producto {
    
    //Atributos
    private int Id;
    private String nomProducto;
    private String descripcion;
    private double precio;
    private CATEGORIA categoria;
    private SUBCATEGORIA subcategoria;
    private int stock;
    private IVA iva;

    public Producto(int Id, String nomProducto, String descripcion, double precio,
            CATEGORIA categoria, SUBCATEGORIA subcategoria, int stock, IVA iva) {
        this.Id = Id;
        this.nomProducto = nomProducto;
        this.descripcion = descripcion;
        this.iva = iva;
        this.precio = precio+(precio*this.iva.getValue());
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.stock = stock;
    }

    public int getId() {
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

    public void setId(int Id) {
        this.Id = Id;
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
