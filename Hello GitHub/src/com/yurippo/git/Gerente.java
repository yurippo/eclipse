package com.yurippo.git;
//Gerente eh um Funcionario, Gerente herda da classe Funcionario, assina o contrato Autenticavel, eh um autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	               // eh um funcionario como falo no Java
	               // extends
	
	
	 private AutenticacaoUtil autenticador;
	
	
      public Gerente() {
		
		this.autenticador = new AutenticacaoUtil();
	}
	
	
	
	  public double getBonificacao() {
		  
		  System.out.println("Chamando o m�todo de bonifica��o do GERENTE");
	 
	  return super.getSalario(); //esse metodo retorna 100% do salario do gerente 
	        //super quer dizer que esse atributo vem da classe m�e da super class 
	  
	  }

		
		@Override
		public void setSenha(int senha) {
			// TODO Auto-generated method stub
			
			this.autenticador.setSenha(senha);
		}

		@Override
		public boolean autentica(int senha) {
			// TODO Auto-generated method stub
			
		    return this.autenticador.autentica(senha);	
		
		
		}
		 
	}
