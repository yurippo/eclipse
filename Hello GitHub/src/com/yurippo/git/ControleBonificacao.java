package com.yurippo.git;

public class ControleBonificacao {

	private double soma;

	
	public void registra(Funcionario f) {

		double boni = f.getBonificacao();

		this.soma = this.soma + boni;

	}
	
	
	public double getSoma() {
		return this.soma;
	}

}