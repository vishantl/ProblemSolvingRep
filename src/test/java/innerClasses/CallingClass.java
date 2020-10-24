package innerClasses;

public class CallingClass {

	public static void main(String[] args) {
		
		AccessPrivateMember outer = new AccessPrivateMember();
		//AccessPrivateMember.InnerClass inner = outer.new InnerClass();
		
		//inner.getNum();
		System.out.println(outer.getNum());

	}

}
