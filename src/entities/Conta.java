package entities;

public class Conta {
	
	
	private int NUMEROCONTA = 0;
	protected Cliente cliente;
	protected static final int AGENCIA = 2565;
	private String senha;
	protected double saldo;
	
	public Conta(Cliente cliente, String senha){
		this.cliente = cliente;
		this.setSenha(senha);
		this.saldo = 0;
		this.NUMEROCONTA += 1;
	}
	
	public void saque(double valor) {
		saldo -=valor;
	}
	
	public void deposito(double valor) {
		saldo +=valor;
	}
	
	public void transferencia(double valor, Conta conta) {
		conta.deposito(valor);
	}

	public static int getAGENCIA() {
		return AGENCIA;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public static int getNUMEROCONTA() {
		return NUMEROCONTA;
	}
	
	@Override
	public String toString() {
		return   "Numero Conta: "+NUMEROCONTA+" "+cliente + " saldo=" + saldo + "]";
	}

	


	
	
}
