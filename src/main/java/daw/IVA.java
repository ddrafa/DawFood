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
    ivaRefrescosAlcohol(21), ivaOtros(10);

    private final int valor;

    IVA(int value) {
        this.valor = value;

    }

    public int getValue() {
        return valor;
    }
}
