package com.yurippo.git;

public class TestaSomatoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador = 0;
		int total = 0;
		
		while(contador <= 10) {
			
			//total = total + contador; ou mais comum
			
			total += contador;
		
			contador++;
		}
			System.out.println(total);
	}

}
