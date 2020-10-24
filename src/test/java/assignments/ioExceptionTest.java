package assignments;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

public class ioExceptionTest {

	
	  public FileInputStream testMethod1(){
	
	        File file = new File("test.txt");
	
	        FileInputStream fileInputStream = null;
	
	       /* try{
	        	fileInputStream = new FileInputStream(file);
	
	            fileInputStream.read();
	
	        }catch (IOException e){         
	
	           // e.printStackTrace();
	            System.out.println("File Not Found! " );
	        }
	
	        finally{
	
	            try{
	
	                if (fileInputStream != null){
	
	                    fileInputStream.close();
	
	                }
	
	            }catch (IOException e){
	
	              e.printStackTrace();
	              System.out.println("File Not Found Finally!");
	
	           }
	
	        }*/
	        
	        try{
	        	fileInputStream = new FileInputStream(file);
	
	            fileInputStream.read();
	        }catch(ArithmeticException e) {
	        	System.out.println("Exception Block");
	        }catch(IOException ie) {
	        	System.out.println("IO Exception Block");
	        }
	        
	        	
	
	        return fileInputStream;
		    }
	
	    public static void main(String[] args){
	
	    	ioExceptionTest instance1 = new ioExceptionTest();
	
	        instance1.testMethod1();
	
	    }
	
}