/**
 * 
 */
package practicapdf;

/**
 * 
 */
import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class Trabajo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		// Entrada
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese las horas");
		int horas = sc.nextInt();

		System.out.println("Ingrese la tarifa");
		double tarifa = sc.nextDouble();

		// Proceso
		double basico = horas * tarifa;
		double bonificacion = basico * 0.2;
		double neto = (basico + bonificacion) * 0.9;

		// Salida
		System.out.print(" ** Resumen de Pago a Empleado ** ");
		System.out.println("El básico es: " + basico);
		System.out.println("La bonificación es: " + bonificacion);
		System.out.println("El neto es: " + neto);
		
	}

}
