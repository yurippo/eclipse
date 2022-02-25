package com.yurippo.git;
public class Fluxo {

	//existe um negocio chamado de pilha de execução ou stack
	//para organizar o que ja foi executado
	//e o que ainda tem que ser executado
	//abaixo temos um
	//fluxo de execução
	//uma pilha em Java começa no metodo main
	
	
    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("Fim do metodo2");
    }
}	