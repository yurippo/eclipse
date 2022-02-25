package com.yurippo.git;
//uma interface é uma classe abstrata com todos os métodos abstratos
//contrato autenticavel
//quem assinar esse conrato, precisa implementar
       //método setSenha
       //método autentica
public abstract interface Autenticavel {

			
	   public abstract void setSenha(int senha);
		
	   public abstract boolean autentica(int senha);

}
