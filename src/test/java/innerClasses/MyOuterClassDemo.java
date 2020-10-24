package innerClasses;

public class MyOuterClassDemo {
   private int x= 1;
   
   class MyInnerClassDemo {
       public void seeOuter () {
          System.out.println("Outer Value of x is :" + x);
       }
   } // close inner class definition	
   
   public void innerInstance()
   {
       MyInnerClassDemo inner = new MyInnerClassDemo();
       inner. seeOuter();
   }
   
   public static void main(String args[]){
       MyOuterClassDemo obj = new MyOuterClassDemo();
       obj.innerInstance();
   }
   // inner class definition
      
} // close Top level class definition
