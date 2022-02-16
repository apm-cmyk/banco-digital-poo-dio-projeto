package entities;

public class ContaPoupanca {

	private Conta contaCorrente;
	private Conta conta;
	private static int NUMEROPOUPANCA = 0;
	
	
	//criar apenas a conta poupaça
	public ContaPoupanca(Conta conta) {	
		this.setConta(conta);
		ContaPoupanca.NUMEROPOUPANCA += 1;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public void setContaCorrente(ContaCorrente contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	
	public static int getNUMEROPOUPANCA() {
		return NUMEROPOUPANCA;
	}

	@Override
	public String toString() {
		return "Numero poupança: "+NUMEROPOUPANCA+" "+conta;
	}	
	
		
	
	
	
	
}
