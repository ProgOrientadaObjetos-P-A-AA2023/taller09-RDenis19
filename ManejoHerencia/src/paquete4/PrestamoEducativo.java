/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;
import paquete5.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {


    private String nivelEstudio;
    private double valorCarrera;
    private double valorMensual;

    public PrestamoEducativo(String nivelEs, double valorCa,
            Persona benefi, int tiempoPre, String ciudadPre) {
        super(benefi, tiempoPre, ciudadPre);
        nivelEstudio = nivelEs;
        valorCarrera = valorCa;

    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public void establecerNivelEstudio(String n) {
        nivelEstudio = n;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public void establecerValorCarrera(double n) {
        valorCarrera = n;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    public void calcularValorMensual() {
        double operacion = valorCarrera / tiempoPrestamo;
        double porciento = operacion * 0.10;
        valorMensual = operacion - porciento;
    }
@Override
    public String toString() {
        String x = String.format("%s Ciudad Prestamo: %s\n\n"
                + "Prestamo Educativo\n"
                + " *Nivel de estudio: %s\n"
                + " *Valor de la carrera: $%.2f\n"
                + " *Valor mensual a pagar: $%.2f\n"
                + "--------------------------------\n",
                super.toString(),
                ciudadPrestamo.toUpperCase(),
                nivelEstudio,
                valorCarrera,
                valorMensual);
        return x;
    }
}