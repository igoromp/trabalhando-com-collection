package br.com.alura.threads;

public class BarraDeProgresso implements Runnable{

	public void executa() {
		for(int i = 0; i < 1000;i++){
			System.out.print("|");
		}
		
	}

	@Override
	public void run() {
		this.executa();		
	}
	
	
}
