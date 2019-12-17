package osasdsa;

import java.util.Random;

public class Device extends Thread {
	private String name;
	private String type;
	Router r;

	public Device() {
		name="";
		type="";
	}
	public Device(Router r) {
		this.r = r;
	}
	public void setname(String name) {
		this.name=name;
	}
    public void settype(String type) {
		this.type=type;
	}
    public String getname() {
		return this.name;
	}
    public String gettype() {
		return this.type;
	}
    public void connect(int n) throws Exception{
    	n=n+1;
		System.out.println("Connection "+n+": "+this.name + " occupied");
		Random rand = new Random();
		int rand1 = rand.nextInt(5000);
		Thread.sleep(rand1);
	}
	public void activity(int n) throws Exception{
		n=n+1;
		System.out.println("Connection "+n+": "+this.name + " perform online activity");
		Random rand = new Random();
		int rand1 = rand.nextInt(5000);
		Thread.sleep(rand1);
	}
	public void logout(int n) throws Exception{
		n=n+1;
		System.out.println("Connection "+n+": "+this.name + " logged out");
	}
	public void run()
	{
		try {
			this.r.occupy(this);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
