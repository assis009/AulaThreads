package controller;

public class ThreadId extends Thread{
	
	private int id;
	
	public ThreadId(int id){
		
		this.id = id;
	}

	public void run() {
		System.out.println(id);
	}
	
	
}
