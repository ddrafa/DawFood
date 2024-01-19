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
        TPV tpv1 = new TPV("Estepona, Avd.JuanCarlos");
        System.out.println(tpv1.toString());

        TPV tpv2 = new TPV("Manilva, Calle Mar");
        System.out.println(tpv2.toString());

        TPV tpv3 = new TPV("Estepona, Avd.España");
        System.out.println(tpv3.toString());

        TPV tpv4 = new TPV("Cancelada, Avd.Las Palmeras");
        System.out.println(tpv4.toString());

        //HAMBURGUESAS
        Producto p1 = new Producto(111, "El Pollazo",
                "Sabrosa hamburguesa de pollo crujiente con bacon, queso y salsa rosa",
                8, CATEGORIA.hamburguesa, SUBCATEGORIA.pollo,
                150, IVA.ivaOtros);
        Producto p2 = new Producto(112, "La Chillona",
                "Si las hamburguesas hablasen esta CHILLARÍA por su carne de ternera poco echa, bacon y queso fundido",
                6, CATEGORIA.hamburguesa, SUBCATEGORIA.parrilla,
                200, IVA.ivaOtros);
        Producto p3 = new Producto(113, "El Queso",
                "Los científicos catalogan a esta hamburguesa como un nuevo tipo de queso creado por las cantidades bárbaras de queso que tiene",
                10, CATEGORIA.hamburguesa, SUBCATEGORIA.pollo,
                100, IVA.ivaOtros);
        Producto p4 = new Producto(114, "La Jugosa",
                "Una buena carne de cerdo al punto, jugosa y sabrosa, con bacon crujiente, para chuparse los dedos",
                8, CATEGORIA.hamburguesa, SUBCATEGORIA.parrilla,
                175, IVA.ivaOtros);
        Producto p5 = new Producto(115, "La Enredadera",
                "Alternativa Vegetariana de 'La Chillona' que te atrapará y enredará en su fuerte sabor y especias",
                7, CATEGORIA.hamburguesa, SUBCATEGORIA.vegetal,
                50, IVA.ivaOtros);
        Producto p6 = new Producto(116, "El Musgo",
                "Alternativa vegetariana de 'La Jugosa' que se esparcirá por tus papilas gustativas cuál musgo en una cueva",
                9, CATEGORIA.hamburguesa, SUBCATEGORIA.vegetal,
                75, IVA.ivaOtros);
        //Entrantes 
        Producto p7 = new Producto(117, "Chilipapas",
                "Deliciosas patatas fritas cubiertas por una capa de queso, jalapeños y carne picada de ternera sazonada con nuestra mezcla secreta de especias",
                7.60, CATEGORIA.entrantes, SUBCATEGORIA.fritos,
                60, IVA.ivaOtros);
        Producto p8 = new Producto(118, "Julieta Cesar", "Ensalada de brotes verdes con nuestra deliciosa salsa César, queso parmesano y delicioso pollo frito ",
                7, CATEGORIA.entrantes, SUBCATEGORIA.ensalada, 90, IVA.ivaOtros);
        Producto p9 = new Producto(119, "Aritos", "Aros de cebolla fritos con una salsa a elegir",
                6.50, CATEGORIA.entrantes, SUBCATEGORIA.fritos, 50, IVA.ivaOtros);
        Producto p10 = new Producto(120, "BoniChips", "Fritos de boniato con una salsa a elegir",
                6.50, CATEGORIA.entrantes, SUBCATEGORIA.fritos, 40, IVA.ivaOtros);
        //Refresco 
        Producto p11 = new Producto(121, "Refresco", "Refresco a elegir de entre nuesta gran variedad de bebidas burbujeantes",
                2, CATEGORIA.bebidas, SUBCATEGORIA.refresco, 200, IVA.ivaRefrescosAlcohol);
        Producto p12 = new Producto(122, "Café", "Delicioso café arábico para los días fríos (o no tan fríos)",
                1.60, CATEGORIA.bebidas, SUBCATEGORIA.bebidaCaliente, 100, IVA.ivaOtros);
        Producto p13 = new Producto(123, "Cerveza", "Cerveza a elegir de entre nuestra gran variedad",
                2.50, CATEGORIA.bebidas, SUBCATEGORIA.alcohol, 140, IVA.ivaRefrescosAlcohol);
        //Postres
        Producto p14 = new Producto(124, "Brownie de Chocolate y Avellanas", "Un brownie denso y suculento con trozos de avellanas tostadas, acompañado de una bola de helado de vainilla.",
                7, CATEGORIA.otros, SUBCATEGORIA.postres, 50, IVA.ivaOtros);
        Producto p15 = new Producto(125, "Helado Arcoíris", "Una generosa porción de helado de vainilla con colorido jarabe de frutas, chispas de chocolate y crema",
                4.50, CATEGORIA.otros, SUBCATEGORIA.postres, 75, IVA.ivaOtros);
        Producto p16 = new Producto(126, "Tarta de Chocolate y Caramelo Salado", "Un bizcocho de chocolate con capas de caramelo salado y nueces, cubierto de chocolate",
                5.50, CATEGORIA.otros, SUBCATEGORIA.postres, 20, IVA.ivaOtros);
        //Otros
        Producto p17 = new Producto(127, "Ketchup", "Ketchup del de toda la vida", 0.3,
                CATEGORIA.otros, SUBCATEGORIA.otros, 300, IVA.ivaOtros);
        Producto p18 = new Producto(128, "Mayonesa", "Mayonesa de la de toda la vida", 0.3,
                CATEGORIA.otros, SUBCATEGORIA.otros, 300, IVA.ivaOtros);
        Producto p19 = new Producto(129, "Miel y mostaza", "Deliciosa salsa con un toque dulce", 0.5,
                CATEGORIA.otros, SUBCATEGORIA.otros, 100, IVA.ivaOtros);

    }
}
