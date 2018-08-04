package com.gourmet.modelo;

import com.gourmet.modelo.abstrato.Prato;

public class Massa extends Prato{

	private static Massa INSTANCIA;
	
	private Massa() {}
	
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
