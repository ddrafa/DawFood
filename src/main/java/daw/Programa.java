/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author nuria
 */
public class Programa {

    public static TPV elegirTPV(BBDD baseDatos) {
        final String[] OPCIONESMENU = {"TPV 1", "TPV 2", "TPV 3", "TPV 4"};
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
        boolean permiso = false;
        final String[] OPCIONESMENU = {"Catálogo de Productos", "Carrito", "Salir"};
        int opcion = JOptionPane.showOptionDialog(null,
                "¿Qué desea hacer?", "Acceder como Usuario",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                OPCIONESMENU, OPCIONESMENU[0]);
        switch (opcion) {

            //caso de catálogo de productos
            case 0 -> {
                Programa.catalogo(maquina, baseDatos);

            }

            case 1 -> {

            }

            case 2 -> {
                return null;
            }

        }

        //El ticket se debe crear despues de haber agregado o eliminido todos los productos del carrito
        Ticket ticket = new Ticket(carrito);
        return ticket;
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
                }
                case 1 -> {
                    int subOpcion = JOptionPane.showOptionDialog(null,
                            menu, "SubMenu",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                            SUBCATEGORIAENTRANTE.values(), SUBCATEGORIAENTRANTE.Fritos);
                }
                case 2 -> {
                    int subOpcion = JOptionPane.showOptionDialog(null,
                            menu, "SubMenu",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                            SUBCATEGORIABEBIDA.values(), SUBCATEGORIABEBIDA.Refresco);
                }
                case 3 -> {
                    int subOpcion = JOptionPane.showOptionDialog(null,
                            menu, "SubMenu",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                            SUBCATEGORIAOTROS.values(), SUBCATEGORIAOTROS.Postres);
                }
                case 4 -> {
                    repetir = false;
                }
            }
        } while (repetir);
    }
    
    public static boolean comoAdministrador(TPV maquina, BBDD baseDatos) {
        boolean permiso = true;
        String password = JOptionPane.showInputDialog("Introduce la contraseña del TPV de " + maquina.getLocation() + ":");
        if (maquina.getPassword().equals(password)) {
            final String[] OPCIONESMENU = {"Añadir Producto", "Consultar Ventas", "Eliminar producto", "Editar producto", "Salir de la selección"};
            int opcion = JOptionPane.showOptionDialog(null,
                    "¿Qué tarea desea realizar?", "Acceder como Admin",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                    OPCIONESMENU, OPCIONESMENU[0]);

            switch (opcion) {
                //Añadir producto
                case 0 -> {
                 
                    final String[] OPCIONANADIR = {"Hamburguesa Pollo", "Hamburguesa Parrilla", "Hamburguesa Vegetal",
                        "Entrante Frito", "Entrante Ensalada ", "Bebida Alcoholica","Bebida Refresco", "Bebida Caliente", "Postres", "Otros"};
                    int clave = JOptionPane.showOptionDialog(null,
                            "¿Qué tarea desea realizar?", "Acceder como Admin",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                            OPCIONESMENU, OPCIONESMENU[0]);
                    Programa.agregarProducto(baseDatos, clave);
                  
                }
                //Consultar ventas
                case 1 -> {

                }
                //Eliminar producto
                case 2 -> {
                    Producto p = Programa.catalogo(maquina, baseDatos);
                    Programa.eliminarProducto(baseDatos, p);
                }
                //Editar producto
                case 3 -> {
                    Programa.catalogo(maquina, baseDatos);
                    
                }
            }
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
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio: ")), CATEGORIA.Hamburguesas, SUBCATEGORIAHAMBURGUESA.Parrilla,
                    Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del producto: ")), IVA.ivaOtros));
        }
         if (clave == 2) {
            baseDatos.getListaProductos().add(new Producto(
                    JOptionPane.showInputDialog("Ingrese el nombre del nuevo producto: "),
                    JOptionPane.showInputDialog("Ingrese la desdripción del nuevo producto: "),
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio: ")), CATEGORIA.Hamburguesas, SUBCATEGORIAHAMBURGUESA.Pollo,
                    Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del producto: ")), IVA.ivaOtros));
        }
          if (clave == 3) {
            baseDatos.getListaProductos().add(new Producto(
                    JOptionPane.showInputDialog("Ingrese el nombre del nuevo producto: "),
                    JOptionPane.showInputDialog("Ingrese la desdripción del nuevo producto: "),
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio: ")), CATEGORIA.Hamburguesas, SUBCATEGORIAHAMBURGUESA.Vegetal,
                    Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del producto: ")), IVA.ivaOtros));
        }
           if (clave == 4) {
            baseDatos.getListaProductos().add(new Producto(
                    JOptionPane.showInputDialog("Ingrese el nombre del nuevo producto: "),
                    JOptionPane.showInputDialog("Ingrese la desdripción del nuevo producto: "),
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio: ")), CATEGORIA.Entrantes, SUBCATEGORIAENTRANTE.Fritos,
                    Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del producto: ")), IVA.ivaOtros));
        }
            if (clave == 5) {
            baseDatos.getListaProductos().add(new Producto(
                    JOptionPane.showInputDialog("Ingrese el nombre del nuevo producto: "),
                    JOptionPane.showInputDialog("Ingrese la desdripción del nuevo producto: "),
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio: ")), CATEGORIA.Entrantes, SUBCATEGORIAENTRANTE.Ensalada,
                    Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del producto: ")), IVA.ivaOtros));
            
         
        }
             if (clave == 6) {
            baseDatos.getListaProductos().add(new Producto(
                    JOptionPane.showInputDialog("Ingrese el nombre del nuevo producto: "),
                    JOptionPane.showInputDialog("Ingrese la desdripción del nuevo producto: "),
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio: ")), CATEGORIA.Bebidas, SUBCATEGORIABEBIDA.Alcohol,
                    Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del producto: ")), IVA.ivaRefrescosAlcohol));
            
         
        }
                if (clave == 7) {
            baseDatos.getListaProductos().add(new Producto(
                    JOptionPane.showInputDialog("Ingrese el nombre del nuevo producto: "),
                    JOptionPane.showInputDialog("Ingrese la desdripción del nuevo producto: "),
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio: ")), CATEGORIA.Bebidas, SUBCATEGORIABEBIDA.Refresco,
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
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio: ")), CATEGORIA.Otros,  SUBCATEGORIAOTROS.Otros,
                    Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del producto: ")), IVA.ivaOtros));
            
         
        }
         
    }
    public static void eliminarProducto(BBDD baseDatos, Producto producto) {
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

    public static void guardarTarjeta(BBDD baseDatos) {

    }

    public static void modificarProducto(int Id, String nuevoNombre, String nuevaDescripición, double nuevoPrecio, int nuevoStock) {

    }

}
