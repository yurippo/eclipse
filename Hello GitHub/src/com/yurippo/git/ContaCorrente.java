package com.yurippo.git;

public class ContaCorrente extends Conta {
	
	//anota��o eh uma configura��o uma dica a mais nocodigo
	//existem anota��es para o compilador como esta
	//e anota��es para a maquina virtual como as do
	//hybernate por exemplo
	
	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		this.saldo += valor -1;
	}
	

}
