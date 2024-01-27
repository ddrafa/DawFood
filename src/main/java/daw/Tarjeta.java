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

    private final String numeroTarjeta;
    private final String CVV;
    private final String titular;
    private double saldo;
    private final LocalDate fechaVencimiento;

    public Tarjeta(String numeroTarjeta, String CVV, String titular, double saldo, LocalDate fechaVencimiento) {
        this.numeroTarjeta = numeroTarjeta;
        this.CVV = CVV;
        this.titular = titular;
        this.saldo = saldo;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getCVV() {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tarjeta:");
        sb.append(" numeroTarjeta=").append(numeroTarjeta);
        sb.append(", CVV=").append(CVV);
        sb.append(", saldo=").append(saldo);
        sb.append(", fechaVencimiento=").append(fechaVencimiento).append("|");
        return sb.toString();
    }
    
}

//Las tarjetas estarán incluidas en la BBDD y usarán el método class porque sus valores van a cambiar, más especificamente el saldo
