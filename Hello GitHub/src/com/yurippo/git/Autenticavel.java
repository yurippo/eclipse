package com.yurippo.git;
//uma interface � uma classe abstrata com todos os m�todos abstratos
//contrato autenticavel
//quem assinar esse conrato, precisa implementar
       //m�todo setSenha
       //m�todo autentica
public abstract interface Autenticavel {

			
	   public abstract void setSenha(int senha);
		
	   public abstract boolean autentica(int senha);

}
