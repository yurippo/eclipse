package com.yurippo.git;

public class TestaGetESet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		Conta conta = new Conta(1337 , 24226);
	
		
		//conta.numero = 1337; n�o compila conta � atributo private
		
		conta.setNumero(1337);
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		// conta.titular = paulo; n�o compila titular � privado
		
		
		conta.setTitular(paulo);
		
		// paulo.nome = "paulo silveira"; n�o compila tenho que usar setter

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
