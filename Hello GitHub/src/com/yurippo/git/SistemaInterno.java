package com.yurippo.git;

public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel fa) {
		
	boolean autenticou = fa.autentica(this.senha);
	
	if(autenticou == true) {
		
		System.out.println("Pode entrar no sistema!");
		
	}else {
		
		System.out.println("N�o pode entar no sistema !");		
	}
		
	}
	
	

}
