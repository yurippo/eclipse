package com.yurippo.git;

public class TestaGetESet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		Conta conta = new Conta(1337 , 24226);
	
		
		//conta.numero = 1337; não compila conta é atributo private
		
		conta.setNumero(1337);
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		// conta.titular = paulo; não compila titular é privado
		
		
		conta.setTitular(paulo);
		
		// paulo.nome = "paulo silveira"; não compila tenho que usar setter

		paulo.setNome("paulo silveira");
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		//agora em duas linhas
		
		Cliente titularDaConta = conta.getTitular();
		
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		
		System.out.println(paulo);
		
		System.out.println(conta.getTitular());
		
		

	}

}
