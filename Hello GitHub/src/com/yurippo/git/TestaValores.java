package com.yurippo.git;

public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337 , 24226);
		
		// conta está inconssistente 
		
		//conta.setAgencia(-50);
		
		//conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());
		
		System.out.println(conta.getNumero());
		
		Conta conta2 = new Conta(1337, 16549);
		
		Conta conta3 = new Conta(2112, 14660);
		
		System.out.println(Conta.getTotal());
		
		//usando o static eu digo que esse metodo é da classe
		//quando vou chamar ele eu uso o nome da classe não do objeto
			 
		
		
	}

}
