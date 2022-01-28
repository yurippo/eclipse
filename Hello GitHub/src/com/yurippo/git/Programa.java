package com.yurippo.git;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p = new Pessoa();
		
		 
		Endereco endereco = new Endereco();
		
        p.nome = "Paulo";
        
        p.endereco = endereco;
        
        endereco.logradouro = "Avenida XYZ";
        
        System.out.println(endereco.logradouro);
        
        System.out.println(p.endereco.logradouro);

	}

}
