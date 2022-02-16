package application;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {

		

		ContaCorrente contaCorrente = new ContaCorrente(new Cliente("Ana",20), "senha1");
		ContaPoupanca contaPoupanša1 = new ContaPoupanca(contaCorrente);
		ContaPoupanca contaPoupanša2 = new ContaPoupanca(new Conta(new Cliente("JoŃo",20),"senha2"));
		ContaCorrente contaCorrente2 = new ContaCorrente(new Cliente("Caio",33), "senha3");
		
		contaCorrente.deposito(100);
		System.out.println(contaCorrente.toString());
		contaCorrente.saque(25);
		System.out.println(contaCorrente.toString());
		System.out.println(contaPoupanša1.toString());
		System.out.println(contaPoupanša2.toString());
		contaCorrente.transferencia(30, contaPoupanša2.getConta());
		System.out.println(contaPoupanša2.toString());
		System.out.println(contaCorrente2.toString());
	}

}
