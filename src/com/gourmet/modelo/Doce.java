package com.gourmet.modelo;

import com.gourmet.modelo.abstrato.Prato;

public class Doce extends Prato{

	private static Doce INSTANCIA;
	
	private Doce() {}
	
	@Override
	public boolean isFimLista2() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFim() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void toLista1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addLista1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addLista2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showPratoPrincipal() {
		// TODO Auto-generated method stub
		
	}
	
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
