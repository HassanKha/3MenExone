package osasdsa;

public class Semaphore {
	protected int value = 0 ;
	protected Semaphore() { value = 0 ; }
	protected Semaphore(int initial) { value = initial ; }
	public synchronized void P(Device d) {
		value--;
		if (value < 0) {
		try {
			System.out.println("("+d.getname()+")"+"("+d.gettype()+")"+ " : arrived and Waited");	
			wait();
		} catch( InterruptedException e ) {
		     }
		}else {System.out.println("("+d.getname()+")"+"("+d.gettype()+")"+ " : arrived");}
		}
	public synchronized void V(Device d,int n) throws Exception {
		value++ ; 
		if (value <= 0) {
		notify() ;
		d.logout(n);
		}else {d.logout(n);}
		}
}

/*
public class Semaphore {
	protected int value = 0 ;
	protected Semaphore() { value = 0 ; }
	protected Semaphore(int initial) { value = initial ; }
	public synchronized void P() {
		value-- ;
		System.out.println(Thread.currentThread().getName() + " arrived");
		if (value < 0)
		try {
			System.out.println(Thread.currentThread().getName() + " waited");
			wait() ; 
		} catch( InterruptedException e ) {
			
		     }
		}
	public synchronized void V() throws InterruptedException {
		value++ ; 
		if (value <= 0)
		Thread.sleep(500);	
		notify() ;
		}
}
*/