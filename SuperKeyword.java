package mintu;

public class SuperKeyword {
int f=6;

	public SuperKeyword() {
	
		System.out.println(f);
		System.out.println("first");
	}
	
	
	public static void main(String[] args) {
		
		Second obj1=new Second();
		SuperKeyword obj=new SuperKeyword();
	}
}

class Second extends  SuperKeyword{
	
	public Second() {
		super();
			
		System.out.println("Second");
	}
	
}