package application;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {

		

		ContaCorrente contaCorrente = new ContaCorrente(new Cliente("Ana",20), "senha1");
		ContaPoupanca contaPoupan�a1 = new ContaPoupanca(contaCorrente);
		ContaPoupanca contaPoupan�a2 = new ContaPoupanca(new Conta(new Cliente("Jo�o",20),"senha2"));
		ContaCorrente contaCorrente2 = new ContaCorrente(new Cliente("Caio",33), "senha3");
		
		contaCorrente.deposito(100);
		System.out.println(contaCorrente.toString());
		contaCorrente.saque(25);
		System.out.println(contaCorrente.toString());
		System.out.println(contaPoupan�a1.toString());
		System.out.println(contaPoupan�a2.toString());
		contaCorrente.transferencia(30, contaPoupan�a2.getConta());
		System.out.println(contaPoupan�a2.toString());
		System.out.println(contaCorrente2.toString());
	}

}
