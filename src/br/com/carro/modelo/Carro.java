package br.com.carro.modelo;

public class Carro {
	
	private String marca; 
	private String modelo; 
	private int anoFabricacao; 
	private String placa; 
	
	public Carro() { 
		
	}
	
	public Carro(String marca, String modelo, int anoFabricacao, String placa) { 
		this.marca = marca;
		this.modelo = modelo; 
		this.anoFabricacao = anoFabricacao; 
		this.placa = placa; 
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
		
	public void listarCarro(Carro [] carros) {
		System.out.println("*** LISTA DE CARROS ***");
		if(carros == null) {
			System.out.println("Não possui carros cadastrados");
		}
		for(int i = 0; i < carros.length;i++) {
			if (carros[i] != null) {
				System.out.println("Marca: "+carros[i].getMarca() + " - Modelo: "+carros[i].getModelo() + " - Ano: " +carros[i].getAnoFabricacao() + " - Placa: " + carros[i].getPlaca());
			}
		}
	}
	
	public void listarCarroPorAno(Carro [] carros, int a) { 
		System.out.println("Carros igual do ano de " +a);
		if(carros == null) {
			System.out.println("Não possui carros cadastrados");
		}
		for(int i = 0; i < carros.length;i++) {
			if ((carros[i] != null) && (carros[i].getAnoFabricacao() == a)) {
				System.out.println("Marca: "+carros[i].getMarca() + " - Modelo: "+carros[i].getModelo() + " - Ano: " +carros[i].getAnoFabricacao() + " - Placa: " + carros[i].getPlaca());
			}
		}
	} 
	
	public void listarCarroAcimaAno(Carro [] carros, int a) {
		System.out.println("Carros acima do ano de " +a);
		if(carros == null) {
			System.out.println("Não possui carros cadastrados");
		}
		for(int i = 0; i < carros.length;i++) {
			if ((carros[i] != null) && (carros[i].getAnoFabricacao() > a)) {
				System.out.println("Marca: "+carros[i].getMarca() + " - Modelo: "+carros[i].getModelo() + " - Ano: " +carros[i].getAnoFabricacao() + " - Placa: " + carros[i].getPlaca());
			}
		}
	} 
	
	public void listarCarroModelo(Carro [] carros, String m) {
		System.out.println("Carros com modelo de " +m);
		if(carros == null) {
			System.out.println("Não possui carros cadastrados");
		}
		for(int i = 0; i < carros.length;i++) {
			if ((carros[i] != null) && (carros[i].getModelo().equalsIgnoreCase(m))) {
				System.out.println("Marca: "+carros[i].getMarca() + " - Modelo: "+carros[i].getModelo() + " - Ano: " +carros[i].getAnoFabricacao() + " - Placa: " + carros[i].getPlaca());
			}
		}
	} 
}
