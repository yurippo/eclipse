package com.yurippo.git;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//n�o consigo nunca instanciar um enum o construtor � privado
		//usado para constantes no codigo exemplo botao ligado ou desligado
		//status de um botao poderia ser uma enumeracao
		//estacoes do ano primavera, verao, outono, inverno
		//status de um pedido processado
		
		
		
		Prioridade pMin = Prioridade.MIN;
		
		Prioridade pMax = Prioridade.MAX;
		
		
		System.out.println(pMin.name());
		
		System.out.println(pMax.name());
		
		System.out.println(pMin.ordinal());
		System.out.println(pMax.ordinal());
		
		System.out.println(pMin.getValor());
		
		System.out.println(pMax.getValor());
		
		
		
		
		
		
//		System.out.println(Thread.MAX_PRIORITY);
//		
//		//o que s�o enums a thread � uma linha de execu��o e tem prioridades
//		//enums existem para definir constantes valores fixos
//		
//		
//		Thread t = new Thread(() -> System.out.println("rodando ..."));
//
//		t.setPriority(Thread.MAX_PRIORITY);
//		
//		t.start();
	}

}
