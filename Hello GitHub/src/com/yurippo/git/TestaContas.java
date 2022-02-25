package com.yurippo.git;

 
  public class TestaContas {
  
  public static void main(String[] args) {
	  
	  // TODO Auto-generated method stub
  
  Conta conta = new Conta(1337,2334);
  
  conta.deposita(200.0);
  
  System.out.println(conta.getSaldo());
  
  conta.setAgencia(570);
  
  System.out.println(conta.getAgencia());
  
  System.out.println("O total de contas é: "+ Conta.getTotal() );
  
  
  }
  
  }
 