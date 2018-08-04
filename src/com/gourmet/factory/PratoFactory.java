package com.gourmet.factory;

import com.gourmet.modelo.Doce;
import com.gourmet.modelo.Massa;
import com.gourmet.modelo.abstrato.Prato;

public class PratoFactory {
	
	public static Prato getPrato(int prato) {
		if (prato==1) {
			return Massa.getInstance();
		}
		
		return Doce.getInstance();
	}

}
