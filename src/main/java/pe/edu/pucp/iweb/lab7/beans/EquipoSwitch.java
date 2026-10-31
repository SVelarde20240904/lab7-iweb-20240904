package pe.edu.pucp.iweb.lab7.beans;

/**
 * Ejercicio 2b: equipo de tipo 'SWITCH'.
 *
 * Soporte mensual (S/) = 0.015 x precio x cantidad
 */
public class EquipoSwitch { // TODO 2b: debe heredar de EquipoRed

    // TODO 2b: implementar calcularSoporteMensual()

    public double calcularSoporteMensual(double precio, int cantidad){

        double soporte = 0.015*precio*cantidad;

        return soporte;
    }

}
