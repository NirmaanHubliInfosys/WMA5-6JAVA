package oops;

public class PolymorphismRunner {
	
	public void method1(int number,String name) {
		  System.out.println("method1 :" +number);
	  }

	public static void main(String[] args) {
		
		Polymorphism1 polymorphism1=new Polymorphism1();
		polymorphism1.method1(100);
		
		

	}

}
