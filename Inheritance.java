package mintu;

public class Inheritance  {
	
	public void mintu() {
		{
			System.out.println("mobnjnda");
		}
		System.out.println("mintu");
	}
		 	public Inheritance(){
		 		System.out.println("cunstructor Inheritance");
		 	}
	public static  void main(String args[]) {
		B obj1=new B();
	A obj =new A();
	Inheritance inheritance=new  Inheritance();
	obj.mintu();
		//A obj=new A();
		
     	//obj.aa();
		//obj1.bb();
		
		
	} 
}

  class A extends Inheritance{
	 	public A(){
	 		super();
	 		System.out.println("cunstructor A");
	 	}
public void mintu() {
	super.mintu();//call parent method mintu()
	System.out.println("AA");
	// TODO Auto-generated method stub

}
	
}
class B  extends Inheritance{
	public B(){
		super();
		
 		System.out.println("cunstructor B");
 	}
public void mintu1() {
	// TODO Auto-generated method stub
	System.out.println("B");

}
}
	
