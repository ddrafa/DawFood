/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;


/**
 *
 * @author ddrafa
 */
public class Main {

    public static void main(String[] args) {
        
        //CREACIÓN DE LAS 4 TPV
        
        TPV tpv1 = new TPV("Estepona Avd.JuanCarlos");
        System.out.println(tpv1.toString());
        
        TPV tpv2 = new TPV("Manilva Calle Mar");
        System.out.println(tpv2.toString());
        
        TPV tpv3 = new TPV("Estepona Avd.España");
        System.out.println(tpv3.toString());
        
        TPV tpv4 = new TPV("Cancelada Avd.Las Palmeras");
        System.out.println(tpv4.toString());
        
        //HAMBURGUESAS
        
        Producto p1 = new Producto(001, "El Pollazo", 
                "Sabrosa hamburguesa de pollo crujiente con bacon, queso y salsa rosa", 
                8, CATEGORIA.hamburguesa,SUBCATEGORIA.pollo,
                150, IVA.ivaOtros);
        Producto p2 = new Producto(002, "La Chillona", 
                "Si las hamburguesas hablasen esta CHILLARÍA por su carne de ternera poco echa, bacon y queso fundido", 
                6, CATEGORIA.hamburguesa,SUBCATEGORIA.parrilla,
                200, IVA.ivaOtros);
        Producto p3 = new Producto(003, "El Queso", 
                "Los científicos catalogan a esta hamburguesa como un nuevo tipo de queso creado por las cantidades bárbaras de queso que tiene", 
                10, CATEGORIA.hamburguesa,SUBCATEGORIA.pollo,
                100, IVA.ivaOtros);
        Producto p4 = new Producto(004, "La Jugosa", 
                "Una buena carne de cerdo al punto, jugosa y sabrosa, con bacon crujiente, para chuparse los dedos", 
                8, CATEGORIA.hamburguesa,SUBCATEGORIA.parrilla,
                175, IVA.ivaOtros);
        Producto p5 = new Producto(005, "La Enredadera", 
                "Alternativa Vegetariana de 'La Chillona' que te atrapará y enredará en su fuerte sabor y especias", 
                7, CATEGORIA.hamburguesa,SUBCATEGORIA.vegetal,
                50, IVA.ivaOtros);
        Producto p6 = new Producto(006, "El Musgo", 
                "Alternativa vegetariana de 'La Jugosa' que se esparcirá por tus papilas gustativas cuál musgo en una cueva", 
                9, CATEGORIA.hamburguesa,SUBCATEGORIA.vegetal,
                75, IVA.ivaOtros);
        
        
    }
}
