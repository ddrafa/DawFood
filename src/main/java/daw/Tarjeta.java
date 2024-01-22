/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDate;

/**
 *
 * @author ddrafa
 */
public class Tarjeta {

    private final int numeroTarjeta;
    private final int CVV;
    private final String titular;
    private double saldo;
    private final LocalDate fechaVencimiento;

    public Tarjeta(int numeroTarjeta, int CVV, String titular, double saldo, LocalDate fechaVencimiento) {
        this.numeroTarjeta = numeroTarjeta;
        this.CVV = CVV;
        this.titular = titular;
        this.saldo = saldo;
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public int getCVV() {
        return CVV;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

//Las tarjetas estarán incluidas en la BBDD y usarán el método class porque sus valores van a cambiar, más especificamente el saldo
