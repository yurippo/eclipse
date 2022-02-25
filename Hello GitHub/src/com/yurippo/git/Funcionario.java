package com.yurippo.git;

//abstract significa que não podemos instanciar objetos dessa classe, pq é abstrata
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario; 
	
	// protected esse modificador esta entre private e public, esta no meio
	//protected quer dizer publico para os filhos so para os filhos para o resto privado, classes filhas mas outras classes não
	
	
	//metodo sem corpo esse método é um método abstrato não tem uma regra especifica mas precisa existir para o codigo funcionar
    //não ha implementação desse metodo aqui mas ha nos filhos
	//e isso tbm obriga os filhos a implementar esse método
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
