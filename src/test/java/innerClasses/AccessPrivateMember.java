package innerClasses;

public class AccessPrivateMember {

	private int num = 29;
	
	//public class InnerClass {
			
		int getNum() {
			System.out.println("Returning Private num from outerclass");
			return num;
		//}
	}
}