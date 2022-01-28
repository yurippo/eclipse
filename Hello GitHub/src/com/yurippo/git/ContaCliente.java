package com.yurippo.git;

public class ContaCliente {
	
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente titular;
	private static int total = 0;
	
	
	public ContaCliente(int agencia, int numero) {
		
		ContaCliente.total ++;
		
		System.out.println("O total de contas é " + ContaCliente.total);
		
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100; //iniciando conta com 100 de saldo.
		
		System.out.println("Estou criando uma conta" + this.numero);
	}

public void deposita(double valor) {
		
		this.saldo = this.saldo + valor;
		
	}
	
public boolean saca (double valor) {
		
		if(this.saldo >= valor) {
			
			this.saldo -= valor;
			return true;
		}else {
			
			System.out.println("Operação não efetuada");
			
			return false;
		}
	}
	
public boolean transfere(double valor, ContaCliente destino) {
	if(this.saldo >= valor) {
		
		this.saldo -= valor;
		
		destino.deposita(valor);
		
		return true;		
	}else {
		return false;
	}
	
	
}

public double getSaldo() {
	
	return this.saldo;
}

	public int getAgencia() {
		return this.agencia;
	}


	public void setAgencia(int agencia) {
		
		if(agencia <= 0) {
			
			System.out.println("Não pode valor menor igual a 0");
			return;
		} else {
			
			this.agencia = agencia;
		}
		
	}


	public int getNumero() {
		return this.numero;
	}


	public void setNumero(int numero) {
		
		if (numero <= 0) {
			System.out.println("Não pode valor menor igual a 0");
			return;
		}else {
			this.numero = numero;
		}
		
	}
	
	public static int getTotal() {
		
		return ContaCliente.total;
	}


	public Cliente getTitular() {
		return this.titular;
	}


	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
	


}
