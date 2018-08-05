package com.gourmet;

import com.gourmet.factory.PratoFactory;
import com.gourmet.modelo.abstrato.Prato;

import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		try {
			do {
				int prato = escolherPrato();
				
				Prato objPrato = PratoFactory.getPrato(prato);
				
				if (objPrato.getTipo() == 1 ) {
					escolheuMassa(objPrato);
					System.out.println("Continuar? (S/N)");
					Scanner scan = new Scanner(System.in);
					String continuar = scan.nextLine();
					if (continuar.toUpperCase().equals("S")) {
						continue;
					} else {
						break;
					}
				} else {
					escolheuDoce(objPrato);
					System.out.println("Continuar? (S/N)");
					Scanner scan = new Scanner(System.in);
					String continuar = scan.nextLine();
					if (continuar.toUpperCase().equals("S")) {
						continue;
					} else {
						break;
					}
				}
			} while(true);
		} catch (Exception e) {
			System.out.println("Nossa, que vergonha, algo deu errado! Vou fechar o programa, mas pode abrir novamente, ok? :)");
			Scanner scan = new Scanner(System.in);
			String continuar = scan.nextLine();
		}
	}
	
	private static int escolherPrato() {
		int prato = 0;
		System.out.println("Pense num prato que gosta!");
		System.out.println("O prato que você pensou é massa? (S=sim / N=não)");
		Scanner scan = new Scanner(System.in);
		String tipoPrato = scan.nextLine();
		//scan.close();
		
		if (tipoPrato.toUpperCase().equals("S")) {
			prato = 1;
		} else if (tipoPrato.toUpperCase().equals("N")){
			prato = 2;
		} else {
			System.out.println("Digite apenas 's' ou 'n'!");
		}
		return prato;
	}
	
	private static void escolheuMassa(Prato objPrato) {
		if ( objPrato.getLista2()==null ) {
			System.out.println("O prato que você pensou é Lasanha? (S=sim / N=não)");
			Scanner scan0 = new Scanner(System.in);
			String tipoPrato = scan0.nextLine();
			//scan0.close();
			if (tipoPrato.toUpperCase().equals("S")) {
				System.out.println("Acertei de novo!");
				//vai pro inicio
			} else if (tipoPrato.toUpperCase().equals("N")){
				List<String> lista1 = new ArrayList<String>();
				if (objPrato.getLista1()!=null) {lista1 = objPrato.getLista1();}
				List<String> lista2 = new ArrayList<String>();
				if (objPrato.getLista2()!=null) {lista2 = objPrato.getLista2();}
				
				System.out.println("Qual prato você pensou?");
				Scanner scan1 = new Scanner(System.in);
				String p1  = scan1.nextLine();
				//scan1.close();
				lista1.add(p1);
				objPrato.setLista1(lista1);
				
				System.out.println(p1+" é ______ mas Lasanha não.");
				Scanner scan2 = new Scanner(System.in);
				String p2  = scan2.nextLine();
				//scan2.close();
				lista2.add(p2);
				objPrato.setLista2(lista2);
				//vai pro inicio
			} else {
				System.out.println("Digite apenas 's' ou 'n'!");
			}
			
		} else {
			int indice = 0;
			for( String p : objPrato.getLista2()) {
				System.out.println("O prato que você pensou é "+p+"? (S=sim / N=não)");
				Scanner scan0 = new Scanner(System.in);
				String tipoPrato = scan0.nextLine();
				//scan0.close();
				if (tipoPrato.toUpperCase().equals("S")) {
					for( int i = indice; i<objPrato.getLista1().size(); ++i) {
						System.out.println("O prato que você pensou é "+objPrato.getLista1().get(i)+"? (S=sim / N=não)");
						Scanner scanP1 = new Scanner(System.in);
						String sp1 = scanP1.nextLine();
						if (sp1.toUpperCase().equals("S")){
							continue;
						}else {
							List<String> lista1 = new ArrayList<String>();
							if (objPrato.getLista1()!=null) {lista1 = objPrato.getLista1();}
							List<String> lista2 = new ArrayList<String>();
							if (objPrato.getLista2()!=null) {lista2 = objPrato.getLista2();}
							
							System.out.println("Qual prato você pensou?");
							Scanner scanpa1 = new Scanner(System.in);
							String pa1  = scanpa1.nextLine();
							//scan1.close();
							lista1.add(pa1);
							objPrato.setLista1(lista1);
							
							System.out.println(pa1+" é ______ mas "+p+" não.");
							Scanner scanpa2 = new Scanner(System.in);
							String pa2  = scanpa2.nextLine();
							//scan2.close();
							lista2.add(pa2);
							objPrato.setLista2(lista2);
							//vai pro inicio
						}
					}
					//System.out.println("Acertei de novo!"); so depois da lasanha
					//vai pro inicio
				} else if (tipoPrato.toUpperCase().equals("N")){
					
					System.out.println("O prato que você pensou é Lasanha? (S=sim / N=não)");
					Scanner scanlasanha0 = new Scanner(System.in);
					String plasanha = scanlasanha0.nextLine();
					//scan0.close();
					if (plasanha.toUpperCase().equals("S")) {
						System.out.println("Acertei de novo!");
						//vai pro inicio
					} else if (plasanha.toUpperCase().equals("N")){
						List<String> lista1 = new ArrayList<String>();
						if (objPrato.getLista1()!=null) {lista1 = objPrato.getLista1();}
						List<String> lista2 = new ArrayList<String>();
						if (objPrato.getLista2()!=null) {lista2 = objPrato.getLista2();}
						
						System.out.println("Qual prato você pensou?");
						Scanner scan1 = new Scanner(System.in);
						String p1  = scan1.nextLine();
						//scan1.close();
						lista1.add(p1);
						objPrato.setLista1(lista1);
						
						System.out.println(p1+" é ______ mas Lasanha não.");
						Scanner scan2 = new Scanner(System.in);
						String p2  = scan2.nextLine();
						//scan2.close();
						lista2.add(p2);
						objPrato.setLista2(lista2);
						//vai pro inicio
					}
				} else {
					System.out.println("Digite apenas 's' ou 'n'!");
				}
				indice++;
			}//for
			
			//teste
			System.out.println("lista1:"+objPrato.getLista1().toString());
			System.out.println("lista2:"+objPrato.getLista2().toString());
		}
	}
	
	private static void escolheuDoce(Prato objPrato) {
		if ( objPrato.getLista2()==null ) {
			System.out.println("O prato que você pensou é Bolo de Chocolate? (S=sim / N=não)");
			Scanner scan0 = new Scanner(System.in);
			String tipoPrato = scan0.nextLine();
			//scan0.close();
			if (tipoPrato.toUpperCase().equals("S")) {
				System.out.println("Acertei de novo!");
				//vai pro inicio
			} else if (tipoPrato.toUpperCase().equals("N")){
				List<String> lista1 = new ArrayList<String>();
				if (objPrato.getLista1()!=null) {lista1 = objPrato.getLista1();}
				List<String> lista2 = new ArrayList<String>();
				if (objPrato.getLista2()!=null) {lista2 = objPrato.getLista2();}
				
				System.out.println("Qual prato você pensou?");
				Scanner scan1 = new Scanner(System.in);
				String p1  = scan1.nextLine();
				//scan1.close();
				lista1.add(p1);
				objPrato.setLista1(lista1);
				
				System.out.println(p1+" é ______ mas Bolo de Chocolate não.");
				Scanner scan2 = new Scanner(System.in);
				String p2  = scan2.nextLine();
				//scan2.close();
				lista2.add(p2);
				objPrato.setLista2(lista2);
				//vai pro inicio
			} else {
				System.out.println("Digite apenas 's' ou 'n'!");
			}
			
		} else {
			int indice = 0;
			for( String p : objPrato.getLista2()) {
				System.out.println("O prato que você pensou é "+p+"? (S=sim / N=não)");
				Scanner scan0 = new Scanner(System.in);
				String tipoPrato = scan0.nextLine();
				//scan0.close();
				if (tipoPrato.toUpperCase().equals("S")) {
					for( int i = indice; i<objPrato.getLista1().size(); ++i) {
						System.out.println("O prato que você pensou é "+objPrato.getLista1().get(i)+"? (S=sim / N=não)");
						Scanner scanP1 = new Scanner(System.in);
						String sp1 = scanP1.nextLine();
						if (sp1.toUpperCase().equals("S")){
							continue;
						}else {
							List<String> lista1 = new ArrayList<String>();
							if (objPrato.getLista1()!=null) {lista1 = objPrato.getLista1();}
							List<String> lista2 = new ArrayList<String>();
							if (objPrato.getLista2()!=null) {lista2 = objPrato.getLista2();}
							
							System.out.println("Qual prato você pensou?");
							Scanner scanpa1 = new Scanner(System.in);
							String pa1  = scanpa1.nextLine();
							//scan1.close();
							lista1.add(pa1);
							objPrato.setLista1(lista1);
							
							System.out.println(pa1+" é ______ mas "+p+" não.");
							Scanner scanpa2 = new Scanner(System.in);
							String pa2  = scanpa2.nextLine();
							//scan2.close();
							lista2.add(pa2);
							objPrato.setLista2(lista2);
							//vai pro inicio
						}
					}
					//System.out.println("Acertei de novo!"); so depois da lasanha
					//vai pro inicio
				} else if (tipoPrato.toUpperCase().equals("N")){
					
					System.out.println("O prato que você pensou é Bolo de Chocolate? (S=sim / N=não)");
					Scanner scanlasanha0 = new Scanner(System.in);
					String plasanha = scanlasanha0.nextLine();
					//scan0.close();
					if (plasanha.toUpperCase().equals("S")) {
						System.out.println("Acertei de novo!");
						//vai pro inicio
					} else if (plasanha.toUpperCase().equals("N")){
						List<String> lista1 = new ArrayList<String>();
						if (objPrato.getLista1()!=null) {lista1 = objPrato.getLista1();}
						List<String> lista2 = new ArrayList<String>();
						if (objPrato.getLista2()!=null) {lista2 = objPrato.getLista2();}
						
						System.out.println("Qual prato você pensou?");
						Scanner scan1 = new Scanner(System.in);
						String p1  = scan1.nextLine();
						//scan1.close();
						lista1.add(p1);
						objPrato.setLista1(lista1);
						
						System.out.println(p1+" é ______ mas Bolo de Chocolate não.");
						Scanner scan2 = new Scanner(System.in);
						String p2  = scan2.nextLine();
						//scan2.close();
						lista2.add(p2);
						objPrato.setLista2(lista2);
						//vai pro inicio
					}
				} else {
					System.out.println("Digite apenas 's' ou 'n'!");
				}
				indice++;
			}//for
			
		}
	}

}
