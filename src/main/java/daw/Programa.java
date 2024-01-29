/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nuria
 */
public class Programa {

    public static TPV elegirTPV(BBDD baseDatos) {
        final String[] OPCIONESMENU = {"TPV 1", "TPV 2", "TPV 3", "TPV 4", "Salir"};
        int seleccion = JOptionPane.showOptionDialog(null, "Selecciona una TPV", "Selección",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, OPCIONESMENU, OPCIONESMENU[0]);

        //a partir de aquí se duplica
        switch (seleccion) {
            case 0 -> {
                return baseDatos.getListaTPVs().get(0);
            }
            case 1 -> {
                return baseDatos.getListaTPVs().get(1);
            }
            case 2 -> {
                return baseDatos.getListaTPVs().get(2);
            }
            case 3 -> {
                return baseDatos.getListaTPVs().get(3);
            }
        }
        return null;
    }

    public static int encenderTPV(TPV maquina) {
        final String[] OPCIONESMENU = {"Modo Usuario", "Modo Administrador", "Apagar TPV"};
        return JOptionPane.showOptionDialog(null,
                "¡Bienvenido a DawFood! ¿Cómo quieres acceder?", "Acceder",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                OPCIONESMENU, OPCIONESMENU[0]);
    }

    public static Ticket comoUsuario(TPV maquina, BBDD baseDatos) {
        Carrito carrito = new Carrito();
        boolean proceder = true;
        do {
            final String[] OPCIONESMENU = {"Catálogo de Productos", "Carrito", "Salir"};
            int opcion = JOptionPane.showOptionDialog(null,
                    "¿Qué desea hacer?", "Acceder como Usuario",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                    OPCIONESMENU, OPCIONESMENU[0]);
            switch (opcion) {

                //caso de catálogo de productos
                case 0 -> {
                    Producto producto = Programa.catalogo(maquina, baseDatos);
                    if (!(producto.getNomProducto().equalsIgnoreCase("NaN"))) {
                        if (producto.getStock() > 8) {
                            final String[] OPCIONCANT = {" 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", " 8 "};
                            int cantidad = JOptionPane.showOptionDialog(null,
                                    "¿Cúantos " + producto.getNomProducto() + " quieres añadir?", "tam",
                                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                    OPCIONCANT, OPCIONCANT[0]);
                            for (int i = 0; i <= cantidad; i++) {
                                carrito.agregarProducto(producto);
                            }
                        } else if (!(producto.getStock() > 7)) {
                            final String[] OPCIONCANT = {" 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 "};
                            int cantidad = JOptionPane.showOptionDialog(null,
                                    "¿Cúantos " + producto.getNomProducto() + " quieres añadir?", "tam",
                                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                    OPCIONCANT, OPCIONCANT[0]);
                            for (int i = 0; i <= cantidad; i++) {
                                carrito.agregarProducto(producto);
                            }
                        } else if (!(producto.getStock() > 6)) {
                            final String[] OPCIONCANT = {" 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 "};
                            int cantidad = JOptionPane.showOptionDialog(null,
                                    "¿Cúantos " + producto.getNomProducto() + " quieres añadir?", "tam",
                                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                    OPCIONCANT, OPCIONCANT[0]);
                            for (int i = 0; i <= cantidad; i++) {
                                carrito.agregarProducto(producto);
                            }
                        } else if (!(producto.getStock() > 5)) {
                            final String[] OPCIONCANT = {" 1 ", " 2 ", " 3 ", " 4 ", " 5 "};
                            int cantidad = JOptionPane.showOptionDialog(null,
                                    "¿Cúantos " + producto.getNomProducto() + " quieres añadir?", "tam",
                                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                    OPCIONCANT, OPCIONCANT[0]);
                            for (int i = 0; i <= cantidad; i++) {
                                carrito.agregarProducto(producto);
                            }
                        } else if (!(producto.getStock() > 4)) {
                            final String[] OPCIONCANT = {" 1 ", " 2 ", " 3 ", " 4 "};
                            int cantidad = JOptionPane.showOptionDialog(null,
                                    "¿Cúantos " + producto.getNomProducto() + " quieres añadir?", "tam",
                                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                    OPCIONCANT, OPCIONCANT[0]);
                            for (int i = 0; i <= cantidad; i++) {
                                carrito.agregarProducto(producto);
                            }
                        } else if (!(producto.getStock() > 3)) {
                            final String[] OPCIONCANT = {" 1 ", " 2 ", " 3 "};
                            int cantidad = JOptionPane.showOptionDialog(null,
                                    "¿Cúantos " + producto.getNomProducto() + " quieres añadir?", "tam",
                                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                    OPCIONCANT, OPCIONCANT[0]);
                            for (int i = 0; i <= cantidad; i++) {
                                carrito.agregarProducto(producto);
                            }
                        } else if (!(producto.getStock() > 2)) {
                            final String[] OPCIONCANT = {" 1 ", " 2 "};
                            int cantidad = JOptionPane.showOptionDialog(null,
                                    "¿Cúantos " + producto.getNomProducto() + " quieres añadir?", "tam",
                                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                    OPCIONCANT, OPCIONCANT[0]);
                            for (int i = 0; i <= cantidad; i++) {
                                carrito.agregarProducto(producto);
                            }
                        } else if (!(producto.getStock() > 1)) {
                            final String[] OPCIONCANT = {" 1 "};
                            int cantidad = JOptionPane.showOptionDialog(null,
                                    "¿Cúantos " + producto.getNomProducto() + " quieres añadir?", "tam",
                                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                    OPCIONCANT, OPCIONCANT[0]);
                            for (int i = 0; i <= cantidad; i++) {
                                carrito.agregarProducto(producto);
                            }
                        }
                    }
                }

                case 1 -> {
                    if (carrito.getListaSeleccionados().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "El carrito está vacío");
                    } else {
                        final String[] OPCIONESCARRITO = {"Ver Carrito", "Pagar", "Volver"};
                        int optCarrito = JOptionPane.showOptionDialog(null,
                                "¿Qué desea hacer con el carrito?", "Carrito",
                                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                OPCIONESCARRITO, OPCIONESCARRITO[0]);
                        switch (optCarrito) {
                            case 0 -> {
                                Programa.gestionarCarrito(carrito);
                            }
                            case 1 -> {
                                proceder = false;
                            }
                        }
                    }
                }

                case 2 -> {
                    return null;
                }

            }
        } while (proceder);
        //El ticket se debe crear despues de haber agregado o eliminido todos los productos del carrito
        Ticket ticket = Programa.pagar(baseDatos, carrito);
        return ticket;
    }

    public static void gestionarCarrito(Carrito carrito) {
        final String[] OPCIONESCARRITO = {"Eliminar Producto", "Volver"};
        int optCarrito = JOptionPane.showOptionDialog(null,
                carrito.toString(), "Ver Carrito",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                OPCIONESCARRITO, OPCIONESCARRITO[0]);
        switch (optCarrito) {
            case 0 -> {

                ArrayList<String> listaProductos = new ArrayList<>();
                for (Producto selected : carrito.getListaSeleccionados()) {
                    listaProductos.add(selected.getNomProducto() + " " + selected.getPrecio() + "€");
                }
                String eliminar = (String) JOptionPane.showInputDialog(null,
                        "¿Cuál quieres eliminar?", "Eliminar producto del carrito", JOptionPane.QUESTION_MESSAGE,
                        null, listaProductos.toArray(), listaProductos.get(0));
                for (Producto selected : carrito.getListaSeleccionados()) {
                    if (selected.getNomProducto().concat(" " + selected.getPrecio() + "€").equalsIgnoreCase((eliminar))) {
                        carrito.eliminarProducto(selected);
                        break;
                    }
                }
            }
        }
    }

    public static Ticket pagar(BBDD baseDatos, Carrito carrito) {
        boolean proceder = true;
        final double TOTAL = carrito.precioTotal();
        Ticket ticket = new Ticket(carrito, TOTAL);
        try {
            String digitos = JOptionPane.showInputDialog("Inserta los 4 últimos dígitos de tú tarjeta\nTotal: " + TOTAL + "€");
            String cvv = JOptionPane.showInputDialog("Inserta los 3 dígitos del cvv");
            LocalDate date = LocalDate.of(
                    Integer.parseInt(JOptionPane.showInputDialog("Inserta el año de vencimento")),
                    Integer.parseInt(JOptionPane.showInputDialog("Inserta el mes de vencimento")), 30);
            for (int i = 0; i < baseDatos.getListaTarjetas().size(); i++) {
                if ((baseDatos.getListaTarjetas().get(i).getNumeroTarjeta().equalsIgnoreCase(digitos))
                        && (TOTAL <= baseDatos.getListaTarjetas().get(i).getSaldo())
                        && baseDatos.getListaTarjetas().get(i).getCVV().equalsIgnoreCase(cvv)
                        && baseDatos.getListaTarjetas().get(i).getFechaVencimiento().getYear() == date.getYear()
                        && baseDatos.getListaTarjetas().get(i).getFechaVencimiento().getMonthValue() == date.getMonthValue()) {
                    ticket.setTarjeta(baseDatos.getListaTarjetas().get(i));
                    baseDatos.getListaTarjetas().get(i).setSaldo(baseDatos.getListaTarjetas().get(i).getSaldo() - TOTAL);
                    baseDatos.agregarTickets(ticket);
                    for (int k = 0; k < baseDatos.getListaProductos().size(); k++) {
                        for (int j = 0; j < carrito.getListaSeleccionados().size(); j++) {
                            if (baseDatos.getListaProductos().get(k).equals(carrito.getListaSeleccionados().get(j))) {
                                baseDatos.getListaProductos().get(k).setStock(baseDatos.getListaProductos().get(j).getStock() - 1);
                            }
                        }
                    }
                    return ticket;
                }
            }
        } catch (NumberFormatException nfe) {
        }

        JOptionPane.showMessageDialog(null,
                "ERROR, LA TARJETA QUE HA INSERTADO NO SIRVE");
        return null;
    }

    public static Producto catalogo(TPV maquina, BBDD baseDatos) {
        boolean repetir = true;
        String menu = """
                      ----------------------------------------------------
                                            Menu
                      ----------------------------------------------------
                      """;
        do {
            int opcion = JOptionPane.showOptionDialog(null,
                    menu, "Menu",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                    CATEGORIA.values(), CATEGORIA.Hamburguesas);
            switch (opcion) {
                case 0 -> {
                    int subOpcion = JOptionPane.showOptionDialog(null,
                            menu, "SubMenu",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                            SUBCATEGORIAHAMBURGUESA.values(), SUBCATEGORIAHAMBURGUESA.Pollo);
//HAMBURGUESAS-HAMBURGUESAS-HAMBURGUESAS-HAMBURGUESAS-HAMBURGUESAS-HAMBURGUESAS-HAMBURGUESAS-HAMBURGUESAS-HAMBURGUESAS-HAMBURGUESAS-HAMBURGUESAS
                    switch (subOpcion) {
                        case 0 -> {
                            //Lista con nombre de las hamburguesas de pollo
                            ArrayList<String> listaPollos = new ArrayList<>();
                            for (Producto selected : baseDatos.getListaProductos()) {
                                if (selected.getSubCategoriaH() == (SUBCATEGORIAHAMBURGUESA.Pollo)) {
                                    listaPollos.add(selected.getNomProducto() + " " + selected.getPrecio() + "€");
                                }
                            }
                            listaPollos.add("Volver");
                            int selectProducto = JOptionPane.showOptionDialog(null,
                                    menu, "Menu",
                                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                    listaPollos.toArray(), listaPollos.get(0));
                            //Manda el producto al carrito
                            for (Producto selected : baseDatos.getListaProductos()) {
                                if (selected.getNomProducto().concat(" " + selected.getPrecio() + "€").equalsIgnoreCase(listaPollos.get(selectProducto))) {
                                    return selected;
                                }
                            }
                        }
                        case 1 -> {
                            //Lista con nombre de las hamburguesas de parrilla
                            ArrayList<String> listaParrillas = new ArrayList<>();
                            for (Producto selected : baseDatos.getListaProductos()) {
                                if (selected.getSubCategoriaH() == (SUBCATEGORIAHAMBURGUESA.Parrilla)) {
                                    listaParrillas.add(selected.getNomProducto() + " " + selected.getPrecio() + "€");
                                }
                            }
                            listaParrillas.add("Volver");
                            int selectProducto = JOptionPane.showOptionDialog(null,
                                    menu, "Menu",
                                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                    listaParrillas.toArray(), listaParrillas.get(0));
                            //Manda el producto al carrito
                            for (Producto selected : baseDatos.getListaProductos()) {
                                if (selected.getNomProducto().concat(" " + selected.getPrecio() + "€").equalsIgnoreCase(listaParrillas.get(selectProducto))) {
                                    return selected;
                                }
                            }
                        }
                        case 2 -> {
                            //Lista con nombre de las hamburguesas de vegetal
                            ArrayList<String> listaVegetales = new ArrayList<>();
                            for (Producto selected : baseDatos.getListaProductos()) {
                                if (selected.getSubCategoriaH() == (SUBCATEGORIAHAMBURGUESA.Vegetal)) {
                                    listaVegetales.add(selected.getNomProducto() + " " + selected.getPrecio() + "€");
                                }
                            }
                            listaVegetales.add("Volver");
                            int selectProducto = JOptionPane.showOptionDialog(null,
                                    menu, "Menu",
                                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                    listaVegetales.toArray(), listaVegetales.get(0));
                            //Manda el producto al carrito
                            for (Producto selected : baseDatos.getListaProductos()) {
                                if (selected.getNomProducto().concat(" " + selected.getPrecio() + "€").equalsIgnoreCase(listaVegetales.get(selectProducto))) {
                                    return selected;
                                }
                            }
                        }
                    }
                }
                case 1 -> {
                    int subOpcion = JOptionPane.showOptionDialog(null,
                            menu, "SubMenu",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                            SUBCATEGORIAENTRANTE.values(), SUBCATEGORIAENTRANTE.Fritos);
//ENTRANTES-ENTRANTES-ENTRANTES-ENTRANTES-ENTRANTES-ENTRANTES-ENTRANTES-ENTRANTES-ENTRANTES-ENTRANTES-ENTRANTES-ENTRANTES-ENTRANTES-ENTRANTES
                    switch (subOpcion) {
                        case 0 -> {
                            //Lista con nombre de los entrantes de frito
                            ArrayList<String> listaFritos = new ArrayList<>();
                            for (Producto selected : baseDatos.getListaProductos()) {
                                if (selected.getSubCategoriaE() == (SUBCATEGORIAENTRANTE.Fritos)) {
                                    listaFritos.add(selected.getNomProducto() + " " + selected.getPrecio() + "€");
                                }
                            }
                            listaFritos.add("Volver");
                            int selectProducto = JOptionPane.showOptionDialog(null,
                                    menu, "Menu",
                                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                    listaFritos.toArray(), listaFritos.get(0));
                            //Manda el producto al carrito
                            for (Producto selected : baseDatos.getListaProductos()) {
                                if (selected.getNomProducto().concat(" " + selected.getPrecio() + "€").equalsIgnoreCase(listaFritos.get(selectProducto))) {
                                    return selected;
                                }
                            }
                        }
                        case 1 -> {
                            //Lista con nombre de los entrantes de ensalada
                            ArrayList<String> listaEnsaladas = new ArrayList<>();
                            for (Producto selected : baseDatos.getListaProductos()) {
                                if (selected.getSubCategoriaE() == (SUBCATEGORIAENTRANTE.Ensalada)) {
                                    listaEnsaladas.add(selected.getNomProducto() + " " + selected.getPrecio() + "€");
                                }
                            }
                            listaEnsaladas.add("Volver");
                            int selectProducto = JOptionPane.showOptionDialog(null,
                                    menu, "Menu",
                                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                    listaEnsaladas.toArray(), listaEnsaladas.get(0));
                            //Manda el producto al carrito
                            for (Producto selected : baseDatos.getListaProductos()) {
                                if (selected.getNomProducto().concat(" " + selected.getPrecio() + "€").equalsIgnoreCase(listaEnsaladas.get(selectProducto))) {
                                    return selected;
                                }
                            }
                        }
                    }
                }

                case 2 -> {
                    int subOpcion = JOptionPane.showOptionDialog(null,
                            menu, "SubMenu",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                            SUBCATEGORIABEBIDA.values(), SUBCATEGORIABEBIDA.Refresco);
//BEBIDAS-BEBIDAS-BEBIDAS-BEBIDAS-BEBIDAS-BEBIDAS-BEBIDAS-BEBIDAS-BEBIDAS-BEBIDAS-BEBIDAS-BEBIDAS-BEBIDAS-BEBIDAS-BEBIDAS-BEBIDAS-BEBIDAS
                    switch (subOpcion) {
                        case 0 -> {
                            //Lista con nombre de las bebidas de refresco
                            ArrayList<String> listaRefrescos = new ArrayList<>();
                            for (Producto selected : baseDatos.getListaProductos()) {
                                if (selected.getSubCategoriaB() == (SUBCATEGORIABEBIDA.Refresco)) {
                                    listaRefrescos.add(selected.getNomProducto() + " " + selected.getPrecio() + "€");
                                }
                            }
                            listaRefrescos.add("Volver");
                            int selectProducto = JOptionPane.showOptionDialog(null,
                                    menu, "Menu",
                                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                    listaRefrescos.toArray(), listaRefrescos.get(0));
                            //Manda el producto al carrito
                            for (Producto selected : baseDatos.getListaProductos()) {
                                if (selected.getNomProducto().concat(" " + selected.getPrecio() + "€").equalsIgnoreCase(listaRefrescos.get(selectProducto))) {
                                    return selected;
                                }
                            }
                        }
                        case 1 -> {
                            //Lista con nombre de las bebidas de alcohol
                            ArrayList<String> listaAlcoholes = new ArrayList<>();
                            for (Producto selected : baseDatos.getListaProductos()) {
                                if (selected.getSubCategoriaB() == (SUBCATEGORIABEBIDA.Alcohol)) {
                                    listaAlcoholes.add(selected.getNomProducto() + " " + selected.getPrecio() + "€");
                                }
                            }
                            listaAlcoholes.add("Volver");
                            int selectProducto = JOptionPane.showOptionDialog(null,
                                    menu, "Menu",
                                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                    listaAlcoholes.toArray(), listaAlcoholes.get(0));
                            //Manda el producto al carrito
                            for (Producto selected : baseDatos.getListaProductos()) {
                                if (selected.getNomProducto().concat(" " + selected.getPrecio() + "€").equalsIgnoreCase(listaAlcoholes.get(selectProducto))) {
                                    return selected;
                                }
                            }
                        }
                        case 2 -> {
                            //Lista con nombre de las bebidas calientes
                            ArrayList<String> listaCalientes = new ArrayList<>();
                            for (Producto selected : baseDatos.getListaProductos()) {
                                if (selected.getSubCategoriaB() == (SUBCATEGORIABEBIDA.BebidaCaliente)) {
                                    listaCalientes.add(selected.getNomProducto() + " " + selected.getPrecio() + "€");
                                }
                            }
                            listaCalientes.add("Volver");
                            int selectProducto = JOptionPane.showOptionDialog(null,
                                    menu, "Menu",
                                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                    listaCalientes.toArray(), listaCalientes.get(0));
                            //Manda el producto al carrito
                            for (Producto selected : baseDatos.getListaProductos()) {
                                if (selected.getNomProducto().concat(" " + selected.getPrecio() + "€").equalsIgnoreCase(listaCalientes.get(selectProducto))) {
                                    return selected;
                                }
                            }
                        }
                        case 3 -> {
                            //Lista con nombre de las bebidas agua
                            ArrayList<String> listaAguas = new ArrayList<>();
                            for (Producto selected : baseDatos.getListaProductos()) {
                                if (selected.getSubCategoriaB() == (SUBCATEGORIABEBIDA.Aguas)) {
                                    listaAguas.add(selected.getNomProducto() + " " + selected.getPrecio() + "€");
                                }
                            }
                            listaAguas.add("Volver");
                            int selectProducto = JOptionPane.showOptionDialog(null,
                                    menu, "Menu",
                                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                    listaAguas.toArray(), listaAguas.get(0));
                            //Manda el producto al carrito
                            for (Producto selected : baseDatos.getListaProductos()) {
                                if (selected.getNomProducto().concat(" " + selected.getPrecio() + "€").equalsIgnoreCase(listaAguas.get(selectProducto))) {
                                    return selected;
                                }
                            }
                        }
                    }
                }
                case 3 -> {
                    int subOpcion = JOptionPane.showOptionDialog(null,
                            menu, "SubMenu",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                            SUBCATEGORIAOTROS.values(), SUBCATEGORIAOTROS.Postres);
//OTROS-OTROS-OTROS-OTROS-OTROS-OTROS-OTROS-OTROS-OTROS-OTROS-OTROS-OTROS-OTROS-OTROS-OTROS-OTROS-OTROS-OTROS-OTROS-OTROS-OTROS-OTROS-OTROS
                    switch (subOpcion) {
                        case 0 -> {
                            //Lista con nombre de los postres
                            ArrayList<String> listaPostres = new ArrayList<>();
                            for (Producto selected : baseDatos.getListaProductos()) {
                                if (selected.getSubCategoriaO() == (SUBCATEGORIAOTROS.Postres)) {
                                    listaPostres.add(selected.getNomProducto() + " " + selected.getPrecio() + "€");
                                }
                            }
                            listaPostres.add("Volver");
                            int selectProducto = JOptionPane.showOptionDialog(null,
                                    menu, "Menu",
                                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                    listaPostres.toArray(), listaPostres.get(0));
                            //Manda el producto al carrito
                            for (Producto selected : baseDatos.getListaProductos()) {
                                if (selected.getNomProducto().concat(" " + selected.getPrecio() + "€").equalsIgnoreCase(listaPostres.get(selectProducto))) {
                                    return selected;
                                }
                            }
                        }
                        case 1 -> {
                            //Lista con nombre de los otros
                            ArrayList<String> listaOtros = new ArrayList<>();
                            for (Producto selected : baseDatos.getListaProductos()) {
                                if (selected.getSubCategoriaO() == (SUBCATEGORIAOTROS.Otros)) {
                                    listaOtros.add(selected.getNomProducto() + " " + selected.getPrecio() + "€");
                                }
                            }
                            listaOtros.add("Volver");
                            int selectProducto = JOptionPane.showOptionDialog(null,
                                    menu, "Menu",
                                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                    listaOtros.toArray(), listaOtros.get(0));
                            //Manda el producto al carrito
                            for (Producto selected : baseDatos.getListaProductos()) {
                                if (selected.getNomProducto().concat(" " + selected.getPrecio() + "€").equalsIgnoreCase(listaOtros.get(selectProducto))) {
                                    return selected;
                                }
                            }
                        }
                    }
                }
                case 4 -> {
                    repetir = false;
                }
            }
        } while (repetir);
        return new Producto("NaN", "NaN", 0, CATEGORIA.Otros, SUBCATEGORIAOTROS.Otros, 0, IVA.ivaOtros);
    }

    public static boolean comoAdministrador(TPV maquina, BBDD baseDatos) {
        String password = JOptionPane.showInputDialog("Introduce la contraseña del TPV de " + maquina.getLocation() + ":");
        if (maquina.getPassword().equals(password)) {
            boolean repetir = true;
            do {
                final String[] OPCIONESMENU = {"Añadir Producto", "Consultar Ventas", "Eliminar producto", "Editar producto", "Salir"};
                int opcion = JOptionPane.showOptionDialog(null,
                        "¿Qué tarea desea realizar?", "Acceder como Admin",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                        OPCIONESMENU, OPCIONESMENU[0]);

                switch (opcion) {
                    //Añadir producto
                    case 0 -> {

                        final String[] OPCIONANADIR = {"Hamburguesa Pollo", "Hamburguesa Parrilla", "Hamburguesa Vegetal",
                            "Entrante Frito", "Entrante Ensalada ", "Bebida Alcoholica", "Bebida Refresco", "Bebida Caliente", "Postres", "Otros"};
                        int clave = JOptionPane.showOptionDialog(null,
                                "¿Qué tarea desea realizar?", "Acceder como Admin",
                                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                OPCIONANADIR, OPCIONANADIR[0]);
                        Programa.agregarProducto(baseDatos, clave);

                    }
                    //Consultar ventas
                    case 1 -> {
                        final String[] OPCIONANADIR = {"Consultar ventas de hoy", "Volver"};
                        int clave = JOptionPane.showOptionDialog(null,
                                "¿Qué tarea desea realizar?", "Acceder como Admin",
                                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                OPCIONANADIR, OPCIONANADIR[0]);

                        switch (clave) {

                            case 0 -> {
                                ArrayList<Ticket> listaTickectsHoy = new ArrayList<>();
                                for (Ticket ticket : baseDatos.getListaTickects()) {
                                    if (ticket.getFechaTicket().getYear() == LocalDate.now().getYear()) {
                                        if (ticket.getFechaTicket().getMonthValue() == LocalDate.now().getMonthValue()) {
                                            if (ticket.getFechaTicket().getDayOfMonth() == LocalDate.now().getDayOfMonth()) {
                                                listaTickectsHoy.add(ticket);
                                            }
                                        }
                                    }
                                }
                                JOptionPane.showMessageDialog(null, listaTickectsHoy.toString());
                            }
                        }

                    }
                    //Eliminar producto
                    case 2 -> {
                        Producto p = Programa.catalogo(maquina, baseDatos);
                        Programa.eliminarProducto(baseDatos, p);
                    }
                    //Editar producto
                    case 3 -> {
                        Programa.modificarProducto(maquina, baseDatos);

                    }
                    case 4 -> {
                        repetir = false;
                    }
                }
            } while (repetir);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            return false;
        }

    }

    public static void agregarProducto(BBDD baseDatos, int clave) {
        if (clave == 1) {
            baseDatos.getListaProductos().add(new Producto(
                    JOptionPane.showInputDialog("Ingrese el nombre del nuevo producto: "),
                    JOptionPane.showInputDialog("Ingrese la desdripción del nuevo producto: "),
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio: ")),
                    CATEGORIA.Hamburguesas, SUBCATEGORIAHAMBURGUESA.Parrilla,
                    Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del producto: ")), IVA.ivaOtros));
        }
        if (clave == 2) {
            baseDatos.getListaProductos().add(new Producto(
                    JOptionPane.showInputDialog("Ingrese el nombre del nuevo producto: "),
                    JOptionPane.showInputDialog("Ingrese la desdripción del nuevo producto: "),
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio: ")),
                    CATEGORIA.Hamburguesas, SUBCATEGORIAHAMBURGUESA.Pollo,
                    Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del producto: ")), IVA.ivaOtros));
        }
        if (clave == 3) {
            baseDatos.getListaProductos().add(new Producto(
                    JOptionPane.showInputDialog("Ingrese el nombre del nuevo producto: "),
                    JOptionPane.showInputDialog("Ingrese la desdripción del nuevo producto: "),
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio: ")),
                    CATEGORIA.Hamburguesas, SUBCATEGORIAHAMBURGUESA.Vegetal,
                    Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del producto: ")), IVA.ivaOtros));
        }
        if (clave == 4) {
            baseDatos.getListaProductos().add(new Producto(
                    JOptionPane.showInputDialog("Ingrese el nombre del nuevo producto: "),
                    JOptionPane.showInputDialog("Ingrese la desdripción del nuevo producto: "),
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio: ")),
                    CATEGORIA.Entrantes, SUBCATEGORIAENTRANTE.Fritos,
                    Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del producto: ")), IVA.ivaOtros));
        }
        if (clave == 5) {
            baseDatos.getListaProductos().add(new Producto(
                    JOptionPane.showInputDialog("Ingrese el nombre del nuevo producto: "),
                    JOptionPane.showInputDialog("Ingrese la desdripción del nuevo producto: "),
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio: ")),
                    CATEGORIA.Entrantes, SUBCATEGORIAENTRANTE.Ensalada,
                    Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del producto: ")), IVA.ivaOtros));

        }
        if (clave == 6) {
            baseDatos.getListaProductos().add(new Producto(
                    JOptionPane.showInputDialog("Ingrese el nombre del nuevo producto: "),
                    JOptionPane.showInputDialog("Ingrese la desdripción del nuevo producto: "),
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio: ")),
                    CATEGORIA.Bebidas, SUBCATEGORIABEBIDA.Alcohol,
                    Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del producto: ")), IVA.ivaRefrescosAlcohol));

        }
        if (clave == 7) {
            baseDatos.getListaProductos().add(new Producto(
                    JOptionPane.showInputDialog("Ingrese el nombre del nuevo producto: "),
                    JOptionPane.showInputDialog("Ingrese la desdripción del nuevo producto: "),
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio: ")),
                    CATEGORIA.Bebidas, SUBCATEGORIABEBIDA.Refresco,
                    Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del producto: ")), IVA.ivaRefrescosAlcohol));

        }
        if (clave == 8) {
            baseDatos.getListaProductos().add(new Producto(
                    JOptionPane.showInputDialog("Ingrese el nombre del nuevo producto: "),
                    JOptionPane.showInputDialog("Ingrese la desdripción del nuevo producto: "),
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio: ")), CATEGORIA.Bebidas, SUBCATEGORIABEBIDA.BebidaCaliente,
                    Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del producto: ")), IVA.ivaOtros));

        }
        if (clave == 9) {
            baseDatos.getListaProductos().add(new Producto(
                    JOptionPane.showInputDialog("Ingrese el nombre del nuevo producto: "),
                    JOptionPane.showInputDialog("Ingrese la desdripción del nuevo producto: "),
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio: ")), CATEGORIA.Otros, SUBCATEGORIAOTROS.Postres,
                    Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del producto: ")), IVA.ivaOtros));

        }
        if (clave == 10) {
            baseDatos.getListaProductos().add(new Producto(
                    JOptionPane.showInputDialog("Ingrese el nombre del nuevo producto: "),
                    JOptionPane.showInputDialog("Ingrese la desdripción del nuevo producto: "),
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio: ")),
                    CATEGORIA.Otros, SUBCATEGORIAOTROS.Otros,
                    Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del producto: ")), IVA.ivaOtros));

        }

    }

    public static void eliminarProducto(BBDD baseDatos, Producto producto) {
        if (!(producto.getNomProducto().equalsIgnoreCase("NaN"))) {
            final String[] OPCIONESMENU = {"Aceptar", "Cancelar"};
            int opcion = JOptionPane.showOptionDialog(null,
                    "¿Está seguro?", "Acceder como Admin",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                    OPCIONESMENU, OPCIONESMENU[0]);
            switch (opcion) {
                case 0 -> {
                    baseDatos.getListaProductos().remove(producto);
                    JOptionPane.showMessageDialog(null, "Producto eliminado con éxito.");
                }
                case 1 -> {
                    JOptionPane.showMessageDialog(null, "Se ha cancelado la acción");
                }
            }
        }
    }

    public static void modificarProducto(TPV maquina, BBDD baseDatos) {
        Producto producto = Programa.catalogo(maquina, baseDatos);
        final String[] OPCIONESMENU = {"Aceptar", "Cancelar"};
        int opcion = JOptionPane.showOptionDialog(null,
                "¿Está seguro de que quiere editar el producto?", "Acceder como Admin",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                OPCIONESMENU, OPCIONESMENU[0]);
        switch (opcion) {
            case 0 -> {
                final String[] ELECCION = {"Nombre", "Descripción", "Stock", "Precio", "Subcategoría"};
                int opcionEditar = JOptionPane.showOptionDialog(null,
                        "¿Qué desea editar?", "Acceder como Admin",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                        ELECCION, ELECCION[0]);

                switch (opcionEditar) {
                    //Nombre
                    case 0 -> {
                        String nombreNuevo = JOptionPane.showInputDialog("Escriba el nuevo nombre del producto: ");
                        producto.setNomProducto(nombreNuevo);
                    }
                    //Descripción
                    case 1 -> {
                        String descNueva = JOptionPane.showInputDialog("Escriba la nueva descripción del producto: ");
                        producto.setDescripcion(descNueva);
                    }
                    //Stock
                    case 2 -> {
                        int stockNuevo = Integer.parseInt((JOptionPane.showInputDialog("Escriba el nuevo stock del producto: ")));
                        producto.setStock(stockNuevo);
                    }
                    //Precio
                    case 3 -> {
                        double precioNuevo = Double.parseDouble((JOptionPane.showInputDialog("Escriba el nuevo precio del producto: ")));
                        producto.setPrecio(precioNuevo);
                    }
                    //Subcategoría
                    case 4 -> {
                        boolean proseguir = true;
                        do {
                            String nuevaSubcategoria = JOptionPane.showInputDialog("Introduce la nueva subcategoría del producto: ").toLowerCase();
                            switch (nuevaSubcategoria) {
                                case "pollo" -> {
                                    Producto productoNuevo = new Producto(producto.getNomProducto(),
                                            producto.getDescripcion(), producto.getPrecio(),
                                            CATEGORIA.Hamburguesas, SUBCATEGORIAHAMBURGUESA.Pollo,
                                            producto.getStock(), producto.getIva());
                                    baseDatos.getListaProductos().add(productoNuevo);
                                    baseDatos.getListaProductos().remove(producto);

                                }
                                case "parrilla" -> {
                                    Producto productoNuevo = new Producto(producto.getNomProducto(),
                                            producto.getDescripcion(), producto.getPrecio(),
                                            CATEGORIA.Hamburguesas, SUBCATEGORIAHAMBURGUESA.Parrilla,
                                            producto.getStock(), producto.getIva());
                                    baseDatos.getListaProductos().add(productoNuevo);
                                    baseDatos.getListaProductos().remove(producto);
                                }
                                case "vegetal" -> {
                                    Producto productoNuevo = new Producto(producto.getNomProducto(),
                                            producto.getDescripcion(), producto.getPrecio(),
                                            CATEGORIA.Hamburguesas, SUBCATEGORIAHAMBURGUESA.Vegetal,
                                            producto.getStock(), producto.getIva());
                                    baseDatos.getListaProductos().add(productoNuevo);
                                    baseDatos.getListaProductos().remove(producto);
                                }
                                case "frito" -> {
                                    Producto productoNuevo = new Producto(producto.getNomProducto(),
                                            producto.getDescripcion(), producto.getPrecio(),
                                            CATEGORIA.Entrantes, SUBCATEGORIAENTRANTE.Fritos,
                                            producto.getStock(), producto.getIva());
                                    baseDatos.getListaProductos().add(productoNuevo);
                                    baseDatos.getListaProductos().remove(producto);
                                }
                                case "ensalada" -> {
                                    Producto productoNuevo = new Producto(producto.getNomProducto(),
                                            producto.getDescripcion(), producto.getPrecio(),
                                            CATEGORIA.Entrantes, SUBCATEGORIAENTRANTE.Ensalada,
                                            producto.getStock(), producto.getIva());
                                    baseDatos.getListaProductos().add(productoNuevo);
                                    baseDatos.getListaProductos().remove(producto);
                                }
                                case "postre" -> {
                                    Producto productoNuevo = new Producto(producto.getNomProducto(),
                                            producto.getDescripcion(), producto.getPrecio(),
                                            CATEGORIA.Otros, SUBCATEGORIAOTROS.Postres,
                                            producto.getStock(), producto.getIva());
                                    baseDatos.getListaProductos().add(productoNuevo);
                                    baseDatos.getListaProductos().remove(producto);

                                }
                                case "Otros" -> {
                                    Producto productoNuevo = new Producto(producto.getNomProducto(),
                                            producto.getDescripcion(), producto.getPrecio(),
                                            CATEGORIA.Otros, SUBCATEGORIAOTROS.Otros,
                                            producto.getStock(), producto.getIva());
                                    baseDatos.getListaProductos().add(productoNuevo);
                                    baseDatos.getListaProductos().remove(producto);

                                }
                                default -> {
                                    JOptionPane.showMessageDialog(null, "Subcategoría no existente.");
                                    proseguir = false;
                                }
                            }

                        } while (proseguir);

                    }

                }

            }
            case 1 -> {
                JOptionPane.showMessageDialog(null, "Se ha cancelado la acción");
            }
        }

    }

}
