/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author ddrafa
 */
public class BBDD {

    private ArrayList<TPV> listaTPVs = new ArrayList<>();
    private ArrayList<Tarjeta> listaTarjetas = new ArrayList<>();
    private ArrayList<Producto> listaProductos = new ArrayList<>();
    private ArrayList<Ticket> listaTickects = new ArrayList<>();

    public BBDD() {
        //CREACIÓN DE LAS 4 TPV
        this.listaTPVs.add(new TPV("Estepona Avd.JuanCarlos"));

        this.listaTPVs.add(new TPV("Manilva Calle Mar"));

        this.listaTPVs.add(new TPV("Estepona Avd.España"));

        this.listaTPVs.add(new TPV("Cancelada Avd.Las Palmeras"));

        //TARJETAS
        this.listaTarjetas.add(new Tarjeta(1123, 456, "Paquito Sánchez", 114.89, LocalDate.of(2060, 5, 31)));

        this.listaTarjetas.add(new Tarjeta(8997, 113, "MariLoli García", 30.6, LocalDate.of(2025, 6, 30)));

        this.listaTarjetas.add(new Tarjeta(5559, 496, "Jesús Hernández", 500_000_000, LocalDate.of(2040, 12, 31)));

        this.listaTarjetas.add(new Tarjeta(6643, 224, "Nuria Del Castillo", 456, LocalDate.of(2036, 2, 28)));

        this.listaTarjetas.add(new Tarjeta(9213, 590, "Fernando Fernández", 749, LocalDate.of(3333, 3, 31)));

        this.listaTarjetas.add(new Tarjeta(6656, 777, "Inés González", 121212, LocalDate.of(2040, 11, 30)));

        this.listaTarjetas.add(new Tarjeta(4398, 130, "Sergio Pérez", 700, LocalDate.of(2029, 9, 30)));

        this.listaTarjetas.add(new Tarjeta(8966, 754, "Rafael Puentes", 2212, LocalDate.of(2045, 7, 31)));

        this.listaTarjetas.add(new Tarjeta(0773, 263, "Clara Palas", 3344, LocalDate.of(2026, 10, 31)));

        //HAMBURGUESAS
        this.listaProductos.add(new Producto("El Pollazo",
                "Sabrosa hamburguesa de pollo crujiente con bacon, queso y salsa rosa",
                8, CATEGORIA.Hamburguesas, SUBCATEGORIAHAMBURGUESA.Pollo,
                150, IVA.ivaOtros));
        this.listaProductos.add(new Producto("La Chillona",
                "Si las hamburguesas hablasen esta CHILLARÍA por su carne de ternera poco echa, bacon y queso fundido",
                6, CATEGORIA.Hamburguesas, SUBCATEGORIAHAMBURGUESA.Parrilla,
                200, IVA.ivaOtros));
        this.listaProductos.add(new Producto("El Queso",
                "Los científicos catalogan a esta hamburguesa como un nuevo tipo de queso creado por las cantidades bárbaras de queso que tiene",
                10, CATEGORIA.Hamburguesas, SUBCATEGORIAHAMBURGUESA.Pollo,
                100, IVA.ivaOtros));
        this.listaProductos.add(new Producto("La Jugosa",
                "Una buena carne de cerdo al punto, jugosa y sabrosa, con bacon crujiente, para chuparse los dedos",
                8, CATEGORIA.Hamburguesas, SUBCATEGORIAHAMBURGUESA.Parrilla,
                175, IVA.ivaOtros));
        this.listaProductos.add(new Producto("La Enredadera",
                "Alternativa Vegetariana de 'La Chillona' que te atrapará y enredará en su fuerte sabor y especias",
                7, CATEGORIA.Hamburguesas, SUBCATEGORIAHAMBURGUESA.Vegetal,
                50, IVA.ivaOtros));
        this.listaProductos.add(new Producto("El Musgo",
                "Alternativa vegetariana de 'La Jugosa' que se esparcirá por tus papilas gustativas cuál musgo en una cueva",
                9, CATEGORIA.Hamburguesas, SUBCATEGORIAHAMBURGUESA.Vegetal,
                75, IVA.ivaOtros));

        //ENTRANTES 
        this.listaProductos.add(new Producto("Chilipapas",
                "Deliciosas patatas fritas cubiertas por una capa de queso, jalapeños y carne picada de ternera sazonada con nuestra mezcla secreta de especias",
                7.60, CATEGORIA.Entrantes, SUBCATEGORIAENTRANTE.Fritos,
                60, IVA.ivaOtros));

        this.listaProductos.add(new Producto("Julieta Cesar",
                "Ensalada de brotes verdes con nuestra deliciosa salsa César, queso parmesano y delicioso pollo frito ",
                7, CATEGORIA.Entrantes, SUBCATEGORIAENTRANTE.Ensalada, 90, IVA.ivaOtros));

        this.listaProductos.add(new Producto("Aritos",
                "Aros de cebolla fritos con una salsa a elegir",
                6.50, CATEGORIA.Entrantes, SUBCATEGORIAENTRANTE.Fritos, 50, IVA.ivaOtros));

        this.listaProductos.add(new Producto("BoniChips",
                "Fritos de boniato con una salsa a elegir",
                6.50, CATEGORIA.Entrantes, SUBCATEGORIAENTRANTE.Fritos, 40, IVA.ivaOtros));

        //REFRESCOS 
        this.listaProductos.add(new Producto("Refresco",
                "Refresco a elegir de entre nuesta gran variedad de bebidas burbujeantes",
                2, CATEGORIA.Bebidas, SUBCATEGORIABEBIDA.Refresco, 200, IVA.ivaRefrescosAlcohol));

        this.listaProductos.add(new Producto("Café",
                "Delicioso café arábico para los días fríos (o no tan fríos)",
                1.60, CATEGORIA.Bebidas, SUBCATEGORIABEBIDA.BebidaCaliente, 100, IVA.ivaOtros));

        this.listaProductos.add(new Producto("Cerveza", "Cerveza a elegir de entre nuestra gran variedad",
                2.50, CATEGORIA.Bebidas, SUBCATEGORIABEBIDA.Alcohol, 140, IVA.ivaRefrescosAlcohol));
        
        this.listaProductos.add(new Producto("Agua", "Awita refrescante",
                0.50, CATEGORIA.Bebidas, SUBCATEGORIABEBIDA.Aguas, 300, IVA.ivaOtros));

        //POSTRES
        this.listaProductos.add(new Producto("Brownie de Chocolate y Avellanas",
                "Un brownie denso y suculento con trozos de avellanas tostadas, acompañado de una bola de helado de vainilla.",
                7, CATEGORIA.Otros, SUBCATEGORIAOTROS.Postres, 50, IVA.ivaOtros));

        this.listaProductos.add(new Producto("Helado Arcoíris",
                "Una generosa porción de helado de vainilla con colorido jarabe de frutas, chispas de chocolate y crema",
                4.50, CATEGORIA.Otros, SUBCATEGORIAOTROS.Postres, 75, IVA.ivaOtros));

        this.listaProductos.add(new Producto("Tarta de Chocolate y Caramelo Salado",
                "Un bizcocho de chocolate con capas de caramelo salado y nueces, cubierto de chocolate",
                5.50, CATEGORIA.Otros, SUBCATEGORIAOTROS.Postres, 20, IVA.ivaOtros));

        //OTROS
        this.listaProductos.add(new Producto("Ketchup",
                "Ketchup del de toda la vida", 0.3,
                CATEGORIA.Otros, SUBCATEGORIAOTROS.Otros, 300, IVA.ivaOtros));

        this.listaProductos.add(new Producto("Mayonesa",
                "Mayonesa de la de toda la vida", 0.3,
                CATEGORIA.Otros, SUBCATEGORIAOTROS.Otros, 300, IVA.ivaOtros));

        this.listaProductos.add(new Producto("Miel y mostaza",
                "Deliciosa salsa con un toque dulce", 0.5,
                CATEGORIA.Otros, SUBCATEGORIAOTROS.Otros, 100, IVA.ivaOtros));
    }

    public ArrayList<TPV> getListaTPVs() {
        return listaTPVs;
    }

    public ArrayList<Tarjeta> getListaTarjetas() {
        return listaTarjetas;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }
    
    public ArrayList<Ticket> getListaTickects() {
        return listaTickects;
    }
    
    public void setListaTickects(ArrayList<Ticket> listaTickects) {
        this.listaTickects = listaTickects;
    }

    public void setListaTPVs(ArrayList<TPV> listaTPVs) {
        this.listaTPVs = listaTPVs;
    }

    public void setListaTarjetas(ArrayList<Tarjeta> listaTarjetas) {
        this.listaTarjetas = listaTarjetas;
    }
    
    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BBDD{");
        sb.append("listaTPVs=").append(listaTPVs);
        sb.append(", listaTarjetas=").append(listaTarjetas);
        sb.append(", listaProductos=").append(listaProductos);
        sb.append('}');
        return sb.toString();
    }

    public void agregarTickets(Ticket t) {
        listaTickects.add(t);
    }
}
