package controller;

public class CalcThread extends Thread {
	
	int a;
	int b;
	int op;
	
	public CalcThread(int a, int b, int op){
		
		this.a =a;
		this.b = b;
		this.op =op;
	}

	
	public void run() {
		
		calc();
	}


	private void calc() {
		int tempo = 1000;
		
		try {
			sleep(op*tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int res=0;
		String opera ="";
		
		switch (op) {
		case 0:
			res= a+b;
			opera = " + ";
			break;
		case 1:
			res = a-b;
			opera =" - ";
			break;
		case 2:
			res = a*b;
			opera =" *  ";
			break;
		case 3:
			res = a/b;
			opera =" /  ";
			break;
		default:
			System.err.println(" Deu ruim ");
			break;
		}
		
		System.out.println("#"+ getId() + " ==> "+ a +""+ opera + ""  + b + " = " + res);
	}
	
	
}
