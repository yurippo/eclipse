package com.yurippo.git;


public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; 
	//esse static quer dizer que esse
	//total � da classe n�o de cada objeto como os outros atributos
	
	//esse � o exemplo de um construtor padr�o
	// rotina de inicializa��o diferente de um metodo 
	// que tem retorno void, return
	//ele s� � executado uma unica vez quando agente constroe 
	//o objeto so executa com um new e o new cria um novo objeto
	
	
	public Conta(int agencia, int numero) {
		Conta.total++; //aqui usamos Conta ao inv�s do this 
		//pq � da calsse conta n�o do objeto
		// a partir do moemnto que uso static � atributo global da classe n�o
		// de cada objeto instanciado como o this se refere
		
		System.out.println("o total de contas � " + Conta.total);
		
		this.agencia = agencia;
		this.numero = numero;
		
		System.out.println("estou criando conta"+ this.numero);
	}
	
	
	public void setTitular(Cliente titular) {
		
		this.titular = titular;
		
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	//esse m�todo tbm � chamado getter
	public double getSaldo() {
		
		return this.saldo;
		
	}		
	
	public int getNumero() {
		
		return this.numero;
	}
	
	public void setNumero(int numero) {
		
		if(numero <= 0) {
			
			System.out.println("nao pode valor menor igual a 0");
			return;			
		}
		
		this.numero = numero;
		
	}
	
	public int getAgencia() {
	
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		
		if(agencia <= 0) {
			
			System.out.println("nao pode valor menor igual a 0");
			return;			
		}
		this.agencia = agencia;
	}
	
	
	
	public void deposita(double valor) {
		
		this.saldo += valor; //ou this.saldo + valor;
		 
	}
	
	public boolean saca(double valor) {
	
		if (this.saldo >= valor) {
			
			this.saldo -= valor; // ou this.saldo - valor;
			
			return true;
			
		} else {
			
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino ) {
		
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
		
	public boolean transfereComSaca (double valor, Conta destino ) {
		
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}	
				
	}
	
	 public static int getTotal() { 
	//usando o static eu digo que esse metodo � da classe
    //quando vou chamar ele eu uso o nome da classe n�o do objeto
		 				 
		 return Conta.total;		 
		
	}

}


