package com.gourmet.modelo.abstrato;

import java.util.List;

import com.gourmet.modelo.inetface.PratoInterface;

public abstract class Prato implements PratoInterface{
	List<String> lista1;
	List<String> lista2;
	public List<String> getLista1() {
		return lista1;
	}
	public void setLista1(List<String> lista1) {
		this.lista1 = lista1;
	}
	public List<String> getLista2() {
		return lista2;
	}
	public void setLista2(List<String> lista2) {
		this.lista2 = lista2;
	}
	
}
