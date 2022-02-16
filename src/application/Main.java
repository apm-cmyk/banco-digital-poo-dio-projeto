package application;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {

		

		ContaCorrente contaCorrente1 = new ContaCorrente(new Cliente("Ana",20), "senha1");
		ContaPoupanca contaPoupan�a1 = new ContaPoupanca(contaCorrente1);
		ContaPoupanca contaPoupan�a2 = new ContaPoupanca(new Conta(new Cliente("Jo�o",20),"senha2"));
		ContaCorrente contaCorrente2 = new ContaCorrente(new Cliente("Caio",33), "senha3");
		
		contaCorrente1.deposito(100);
		System.out.println(contaCorrente1.toString());
		contaCorrente1.saque(25);
		System.out.println(contaCorrente1.toString());
		System.out.println(contaPoupan�a1.toString());
		System.out.println(contaPoupan�a2.toString());
		contaCorrente1.transferencia(30, contaPoupan�a2.getConta());
		System.out.println(contaPoupan�a2.toString());
		System.out.println(contaCorrente2.toString());
	}

}
