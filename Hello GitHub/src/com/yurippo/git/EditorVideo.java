package com.yurippo.git;
//Gerente eh um Funcionario, Gerente herda da Class Funcionario

public class EditorVideo extends Funcionario {	
	
	public double getBonificacao() {
		
		System.out.println("Chamando o m�todo de bonifica��o do EDITOR DE VIDEO");
		
		return 150;
	}

}
