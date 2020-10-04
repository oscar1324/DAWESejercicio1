/**
 * 
 */
package com.oscarlogica_negocios;
import com.oscar.consultaDatos.*;

import java.util.List;

import com.oscar.Presentacion.*;
/**
 * @author Usuario
 *
 */
public class logicaNegocio {
	public  Integer Ccoches() {
		List<String> Lnombres = new consultaDatos().LaLectura();
		int con = 0;
		for(String nombres : Lnombres) {
			if(nombres.contains(nombres)) {
				con++;
			}
		}

	}
	}
	

