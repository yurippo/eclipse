package com.yurippo.git;

public class Carro {
	
	private int ano;
	private String modelo;
	private double preco;
	
	public Carro(int ano, String modelo, double preco){
        if(ano >= 1981) {
        	this.ano = ano;
        }else {
        	System.out.println("O ano informado est� inv�lido."
        			+ "Por isso usaremos 2017!");
        	this.ano = 2017;
        }
        
        if(modelo != null) {
        	this.modelo = modelo;
        }else {
        	System.out.println("O modelo"
        			+ "n�o foi informado. Por isso"
        			+ "usaremos Gol!");
        	this.modelo = "Gol";
        }
        
        if(preco > 0) {
        	this.preco = preco;
        }else {
        	System.out.println("O pre�o n�o � v�lido."
        			+ "Por isso usaremos 40000.0");
        	this.preco = 40000.0;
        }
    }
	
	public Carro( String modelo, double preco) {
		
		this(2017,modelo,preco);
		
		/* ou usariamos todo esse codigo duplicado de novo
		 * que faria essa classe cheirar mal ou simplesmente
		 * a solu��o acima
		 * this.ano = 2017;
		 * 
		 * if (modelo != null) { this.modelo = modelo; }else {
		 * System.out.println("O modelo" + "n�o foi informado. Por isso" +
		 * "usaremos Gol!"); this.modelo = "Gol"; }
		 * 
		 * if(preco > 0) { this.preco = preco; }else {
		 * System.out.println("O pre�o n�o � v�lido. Por" + "isso usaremos 40000.0");
		 * this.preco = 40000.0; }
		 */
		
	}
	
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
