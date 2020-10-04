/**
 * 
 */
package com.oscar.consultaDatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Usuario
 *
 */
public class consultaDatos {
	
	public List<String> laLectura() throws IOException{
		File file = new File("C:\\ficheros");
		BufferedReader lector = new BufferedReader(new FileReader(file));
		
		List<String> lecturas = new ArrayList();
		String line;
		while((line = lector.readLine()) != null) { //¿?
			lecturas.add(recuPerson(line));
			}
		return lecturas;
	}
	public String recuPerson(String linea) {
		String[] Arpersona = linea.split("  -  ");
		return Arpersona[0];
	}
}

