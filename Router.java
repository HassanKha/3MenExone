package osasdsa;

public class Router {

	private int size;
	private boolean arr[];
	Semaphore spaces;
	public Router(int n)
	{
		size=n;
		arr=new boolean[size];
		spaces= new Semaphore(size);
        for(int x=0;x<size;x++) {
        	arr[x]=false;
        }
		
	}
	public void occupy(Device d) throws Exception
	{
		int indx=0;
		spaces.P(d);	
		while(arr[indx]!=false){
        		indx++;
        }
		arr[indx]=true;
		d.connect(indx);
		d.activity(indx);
		spaces.V(d,indx);
		arr[indx]=false;
		
	}
}
