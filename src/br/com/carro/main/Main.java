package br.com.carro.main;

import java.util.Scanner;

import br.com.carro.modelo.Carro;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Carro c = new Carro(); 
		int opcao = 0, i = 0;
		Carro carros[] = new Carro[10]; 
		
		do {
	        System.out.print("================== CADASTRO DE VEICULOS =====================\n");
	        System.out.print("[ 1 ] - Listar os veiculos cadastrados \n");
	        System.out.print("[ 2 ] - Inserir um novo veiculo\n");
	        System.out.print("[ 3 ] - Listar os veiculos filtrando-se por ano de fabricação\n");
	        System.out.print("[ 4 ] - Listar veiculos acima do ano especificado\n");
	        System.out.print("[ 5 ] - Listar os veiculos filtrando-se pelo modelo\n");
	        System.out.print("[ 6 ] - Sair\n");
	        System.out.print("Informe a opção: ");
	        opcao = sc.nextInt();
	        System.out.print("================== CADASTRO DE VEICULOS =====================\n");
	        switch(opcao){
	            case 1:
	            	c.listarCarro(carros);
	            	break;
	            case 2:
	            	sc.nextLine();
	            	do {
	            		System.out.print("Marca do Carro: ");
	            		String marca = sc.nextLine(); 
	            		System.out.print("Modelo: ");
	            		String modelo = sc.nextLine();
	            		System.out.print("Ano de Fabricação: ");
	            		int anoFabricacao = sc.nextInt(); 
	            		sc.nextLine();
	            		System.out.print("Placa do Carro: ");
	            		String placa = sc.nextLine(); 
	            		carros[i] = new Carro(marca, modelo, anoFabricacao, placa);
	            		i++;
	            	}while(i < 5);
	            	break; 
	            case 3: 
	            	System.out.print("Informe o ano de fabricação para filtrar: ");
	            	int ano = sc.nextInt(); 
	            	c.listarCarroPorAno(carros, ano);
	            	break;
	            case 4: 
	            	System.out.print("Informe o ano de fabricação para filtrar: ");
	            	ano = sc.nextInt(); 
	            	c.listarCarroAcimaAno(carros, ano);
	            	break;
	            case 5:
	            	sc.nextLine();
	            	System.out.print("Informe o modelo para pesquisar: ");
	            	String m = sc.nextLine(); 
	            	c.listarCarroModelo(carros, m);
	            	break;
	        }
	        System.out.print("=============================================================\n");
	    }while(opcao != 6);
		System.out.println("*** Fim do Programa ***");
		sc.close();
	}

}
