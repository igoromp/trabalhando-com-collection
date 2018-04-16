package br.com.alura.threads;

public class Conta{
	
	private double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public synchronized void deposita(double d) {		
		if(d <=0)
			throw new IllegalArgumentException("Valor de deposito inválido");

		this.saldo += d;
		
	}
	
	
}
