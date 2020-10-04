/**
 * 
 */
package com.oscar.Presentacion;
import java.util.Scanner;

import com.oscarlogica_negocios.logicaNegocio;


/**
 * @author Usuario
 *
 */
public class Presetnacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Bienvenido a la práctica del primer ejercicio");
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el nombre: ");
		String nombre = sc.next();
		System.out.println("El número de coches que tiene " + nombre + " es de: " + new logicaNegocio().Ccoches());

	}

}
