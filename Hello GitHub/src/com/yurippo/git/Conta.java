package com.yurippo.git;
/**
 * 
 * @author yurippo
 * @version 1.0
 */

//uma anotacao eh uma configura��o no seu codigo Java


public abstract class Conta {
	
	//criei a anota��o agora falta a biblioteca
	//para interpretar a anota��o e verificar se e valido ou nao
	//anotacoes servem para fugir dos xmls complexos
	//para simplificar as configura��es no nosso codigo
	//para dar uma dica para o nosso compilador
	//e ate facil escrever a anota��o falta interpretar
	//veremos isso mais a fundo no curso de reflexion
	
	
	@DoublePositivo
	protected double saldo;
	private String titular;
	private String banco;
	private String agencia;
	private String numero;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	 public double getSaldo() {
		return this.saldo;
	}
	 
	
	 public String getTitular() {
		return this.titular;
	}
	 
	 public String getBanco() {
		return this.banco;
	}
	 
	 
	
	
}