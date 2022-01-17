package com.yurippo.git;

public class TesteIR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salario = 2800.2;

        //ifs aqui
		
		if (salario >= 1900 && salario <= 2800) {
			
			System.out.println("O IR é de 7.5%");
			System.out.println("Pode deduzir na declaração o valor de R$142");
		} else {
			if(salario >=2800.01 && salario <= 3751) {
				
				System.out.println("O IR é de 15%");
				System.out.println("Pode deduzir na declaração o valor de R$350");
			} else {
				if (salario >= 3751.01 && salario <= 4664 ) {
					System.out.println("O IR é de 22.5%");
					System.out.println("Pode deduzir na declaração o valor de R$636");
				}
			}
		}

	}

}
