package com.gourmet.modelo;

import com.gourmet.modelo.abstrato.Prato;

public class Doce extends Prato{

	private static Doce INSTANCIA;
	
	private Doce() {}
	
	
	@Override
	public String toString() {
		return "DOCE!";
	}

	@Override
	public int getTipo() {
		return 2;
		
	}
	
	public static synchronized Doce getInstance() {
		if ( INSTANCIA == null ) { 
			INSTANCIA = new Doce();
		}
		return INSTANCIA;
	}

}
