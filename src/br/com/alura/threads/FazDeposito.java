package br.com.alura.threads;

public class FazDeposito implements Runnable {

	private final Conta conta;
	
	public FazDeposito(Conta conta) {
		this.conta = conta;
	}

	public void run() {
		conta.deposita(500.00);	
		System.out.println("Fez deposito "+500);
	}

}
