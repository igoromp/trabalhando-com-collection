package br.com.alura.threads;

public class CopiadorDeArquivos implements Runnable {

	public void executa() {
		double porcent = 0.0;
		for(int i = 1; i <= 1000;i++){
			porcent =(double)(i*0.10);
			System.out.println("status:"+porcent+"%");
		}
		
	}

	@Override
	public void run() {
		this.executa();
		
	}
	
	

}
