package com.yurippo.git;
//Gerente eh um Funcionario, Gerente herda da Class Funcionario

public class Designer extends Funcionario {	
	
	public double getBonificacao() {
		
		System.out.println("Chamando o m�todo de bonifica��o do DESIGNER");
		
		return 200;
	}

}
