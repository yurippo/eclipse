package com.yurippo.git;

//abstract significa que n�o podemos instanciar objetos dessa classe, pq � abstrata
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario; 
	
	// protected esse modificador esta entre private e public, esta no meio
	//protected quer dizer publico para os filhos so para os filhos para o resto privado, classes filhas mas outras classes n�o
	
	
	//metodo sem corpo esse m�todo � um m�todo abstrato n�o tem uma regra especifica mas precisa existir para o codigo funcionar
    //n�o ha implementa��o desse metodo aqui mas ha nos filhos
	//e isso tbm obriga os filhos a implementar esse m�todo
	public abstract double getBonificacao(); 
	  
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}	
	
	

}
