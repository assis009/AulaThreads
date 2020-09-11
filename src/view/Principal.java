package view;

import controller.CalcThread;

public class Principal {
	
	public static void main (String args []){
		
//		for (int id=0 ; id <5; id++){
//			//ThreadId thread = new ThreadId(id);
//			Thread thread = new ThreadId(id);
//			thread.start();
//		}
		
		int a = 2;
		int b= 3;
		
		for( int op =0; op < 4; op++){
			
			Thread thread = new CalcThread(a,b,op);
			thread.start();
		}
	}
}
