/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package daw;

/**
 *
 * @author nuria
 */
public enum IVA {
    //IVAS dependiendo de los productos
    ivaRefrescosAlcohol(0.21), ivaOtros(0.10);

    private final double valor;

    IVA(double value) {
        this.valor = value;

    }

    public double getValue() {
        return valor;
    }
}
