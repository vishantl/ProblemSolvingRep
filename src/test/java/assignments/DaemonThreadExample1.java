package assignments;

public class DaemonThreadExample1 extends Thread{
	
	 public void run(){  
			
		  // Checking whether the thread is Daemon or not
		  if(Thread.currentThread().isDaemon()){ 
		      System.out.println("Daemon thread executing");  
		  }  
		  else{  
		      System.out.println("user(normal) thread executing");  
	          }  
	   }  
	   public static void main(String[] args){  
		 /* Creating two threads: by default they are 
		  * user threads (non-daemon threads)
		  */
		 DaemonThreadExample1 t1=new DaemonThreadExample1();
		 DaemonThreadExample1 t2=new DaemonThreadExample1();   
				 
		 //Making user thread t1 to Daemon
	        t1.setDaemon(true);
			     
	        //starting both the threads 
	        t1.start(); 
	        System.out.println("Checking if this is executed before 2nd thread"); //When this print 
	        //message gets added at this position, daemon thread gets executed first before user thread.
	        t2.start();
	        
	        //System.out.println("Checking if this is executed before 2nd thread");
	        //When this print message gets added at this position, user thread gets executed first 
	        //before daemon thread.
	   } 

}