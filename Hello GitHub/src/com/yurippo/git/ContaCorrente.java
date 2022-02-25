package com.yurippo.git;

public class ContaCorrente extends Conta {
	
	//anotação eh uma configuração uma dica a mais nocodigo
	//existem anotações para o compilador como esta
	//e anotações para a maquina virtual como as do
	//hybernate por exemplo
	
	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		this.saldo += valor -1;
	}
	

}
