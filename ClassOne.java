package constructeroverload;

public class ClassOne {

	public static void main(String[] args) {
		
		ClassTwo c1 = new ClassTwo();
		System.out.println(c1.a);
		
		ClassTwo c2= new ClassTwo();
		System.out.println(c2.x);
		
		 ClassTwo c3 = new ClassTwo("one","two");
		 System.out.println(c3.a);

	}

}
