package com.gourmet.modelo;

import com.gourmet.modelo.abstrato.Prato;

public class Massa extends Prato{

	private static Massa INSTANCIA;
	
	private Massa() {}
	
	
	@Override
	public String toString() {
		return "MASSA!"; 
	}

	@Override
	public int getTipo() {
		return 1;
		
	}
	
	public static synchronized Massa getInstance() {
		if ( INSTANCIA == null ) { 
			INSTANCIA = new Massa();
		}
		return INSTANCIA;
	}

}
