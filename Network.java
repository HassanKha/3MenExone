package osasdsa;

import java.util.Scanner;

public class Network extends Thread{
	private Scanner scan;
	private Scanner scan1;
	private Scanner scan2;

	public void run()
	{
		scan = new Scanner(System.in);
		System.out.println("What is number of WI-FI Connections?"); 
	    int size = scan.nextInt();
	    
	    Router r = new Router(size);
	    
	    scan1 = new Scanner(System.in);
		System.out.println("What is number of devices Clients want to connect?"); 
	    int n = scan1.nextInt();
	    
	    Device d[] = new Device[n]; 
	    
	    for(int x=0;x<n;x++) {
	       scan2 = new Scanner(System.in);
		   String str = scan2.nextLine();
		   String list[]=str.split(" ");
		   String name=list[0];
		   String type=list[1];
	       d[x] = new Device(r);
	       d[x].setname(name);
		   d[x].settype(type);
	    }
	    
	    for(int x=0;x<n;x++) {
	    	d[x].start();
		}
		
	}
}
