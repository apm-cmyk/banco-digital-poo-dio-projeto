package application;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {

		

		ContaCorrente contaCorrente = new ContaCorrente(new Cliente("Ana",20), "senha1");
		ContaPoupanca contaPoupança1 = new ContaPoupanca(contaCorrente);
		ContaPoupanca contaPoupança2 = new ContaPoupanca(new Conta(new Cliente("João",20),"senha2"));
		ContaCorrente contaCorrente2 = new ContaCorrente(new Cliente("Caio",33), "senha3");
		
		contaCorrente.deposito(100);
		System.out.println(contaCorrente.toString());
		contaCorrente.saque(25);
		System.out.println(contaCorrente.toString());
		System.out.println(contaPoupança1.toString());
		System.out.println(contaPoupança2.toString());
		contaCorrente.transferencia(30, contaPoupança2.getConta());
		System.out.println(contaPoupança2.toString());
		System.out.println(contaCorrente2.toString());
	}

}
