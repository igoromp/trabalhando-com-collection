package br.com.alura.threads;

public class TesteThreads {

	public static void main(String[] args) throws InterruptedException {		
	/*	
		BarraDeProgresso barra = new BarraDeProgresso();
		Thread t1 = new Thread(barra);		
		
		CopiadorDeArquivos copiador = new CopiadorDeArquivos();
		Thread t2 = new Thread(copiador);
				*/
		Conta c1 = new Conta(500.0);
		FazDeposito acao = new FazDeposito(c1);
		Thread t3 = new Thread(acao);
		Thread t4 = new Thread(acao);
		
		
		/*t1.start();
		t2.start();*/
		t3.start();
		t4.start();
		
		t3.join();
		t4.join();
		
		System.out.println(c1.getSaldo());

	}

}
