package com.yurippo.git;

public class TestaSacaNegativo {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.deposita(100);
		
		System.out.println(conta.saca(101));
		
		conta.saca(101);
		
		System.out.println(conta.getSaldo());		
		
		//boolean processou = conta.saca(200); ou
		
//		System.out.println(conta.saca(200));
//		
//		System.out.println(conta.saldo);
//		
//		// proibido
//		conta.saldo = conta.saldo - 101;
//		
//		System.out.println(conta.saldo);
		
	}

}
