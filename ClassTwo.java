package constructeroverload;

public class ClassTwo {
	
	int x = 25;
	String a = "Hi";
	String b = "Hello";
	
	public ClassTwo() {
		
		this(10);
		System.out.println("Hey");
		
	}
	public ClassTwo(int x) {
		System.out.println(x);
	}
	public ClassTwo(String a , String b) {
		this(20);
		System.out.println(a+b);
	}
	

}
