package application;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {

		

		ContaCorrente contaCorrente1 = new ContaCorrente(new Cliente("Ana",20), "senha1");
		ContaPoupanca contaPoupança1 = new ContaPoupanca(contaCorrente1);
		ContaPoupanca contaPoupança2 = new ContaPoupanca(new Conta(new Cliente("João",20),"senha2"));
		ContaCorrente contaCorrente2 = new ContaCorrente(new Cliente("Caio",33), "senha3");
		
		contaCorrente1.deposito(100);
		System.out.println(contaCorrente1.toString());
		contaCorrente1.saque(25);
		System.out.println(contaCorrente1.toString());
		System.out.println(contaPoupança1.toString());
		System.out.println(contaPoupança2.toString());
		contaCorrente1.transferencia(30, contaPoupança2.getConta());
		System.out.println(contaPoupança2.toString());
		System.out.println(contaCorrente2.toString());
	}

}
