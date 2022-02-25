package com.yurippo.git;
//import java.util.Arrays;

public class TesteGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Autenticavel referencia = new Cliente();
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Marco");
		
		g1.setCpf("235568413");
		
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		
		System.out.println(g1.getCpf());
		
		System.out.println(g1.getSalario());
		
		g1.setSenha(2222);
		
		boolean autenticou = g1.autentica(2222);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
		
		//g1.setLogin("MarcoLogin");		
		
		//boolean autenticouLoginSenha = g1.autenticaLoginSenha("MarcoLogin2",2221);
		
		//System.out.println(autenticouLoginSenha);
		


	//String[] keyWords = new String[] 

	//{"Coverage", "debugging", "defect", "error", "failure", "quality","quality assurance", "root cause", "test analysis", "test basis", "test case", "test completion", "test condition", "test control", "test data", "test design",	"test execution", "test implementation", "test monitoring", "test object", "test objective", "test oracle", "test planning", "test procedure", "test process", "test suite", "testing", "testware","traceability", "validation", "verification"};
	
	//System.out.println(Arrays.toString(keyWords));


		

	}

}
