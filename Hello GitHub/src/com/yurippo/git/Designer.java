package com.yurippo.git;
//Gerente eh um Funcionario, Gerente herda da Class Funcionario

public class Designer extends Funcionario {	
	
	public double getBonificacao() {
		
		System.out.println("Chamando o método de bonificação do DESIGNER");
		
		return 200;
	}

}
