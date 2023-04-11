package br.com.fiap.bicicleta;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Fabricante caloi = new Fabricante();
		
		caloi.setCnpj("93274857");
		caloi.setNome("caloi");
		
		
		
		
		
		Bicicleta andes = new Bicicleta();
		
		andes.retornarDetalhes();
		andes.setAro(23);
		andes.setFabricante(null);
		
		System.out.println(andes.retornarDetalhes());
		
	}

}
