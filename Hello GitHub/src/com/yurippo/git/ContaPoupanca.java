package com.yurippo.git;

public class ContaPoupanca extends Conta {
	
	//dessa forma consigo reaproveitar o construtor
	//da classe mãe mesmo não herdando automaticamente
	
	public ContaPoupanca(int agencia, int numero) {
		
		super(agencia, numero);
		
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		
		super.saldo += valor;
		
	}

}
