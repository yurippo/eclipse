package com.yurippo.git;

public class TestaCaracteres {
	
	public static void main (String[] args) {
		
		char letra = 'a';
		
		System.out.println(letra);
		
		char valor = 66;
		
		System.out.print(valor);
		
		
		valor = (char) (valor + 1);
		
		System.out.println(valor);
		
		String palavra = "Alura cursos online de tecnologia";
		
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		
		System.out.println(palavra);
		
		char letra1 = 'a';
		
		 System.out.println(letra1);
	
		 char letra2 = 'a';
	        System.out.println(letra2);

	        char valor2 = 65;  // Compila!
	        System.out.println(valor2);
		
	        char letra3 = 'a';
	        System.out.println(letra3);

	        char valor3 = 65;           // Compila!
	        System.out.println(valor3);

	        valor3 = (char) (valor3 + 1);         // Não compila! // mas com cating roda
	        System.out.println(valor3);
	        
	        String palavra3 = "alura cursos online de tecnologia";
	        System.out.println(palavra3);
	        
	        palavra3 = palavra3 + 2020;
	        
	        System.out.println(palavra3);
		
	}

}
