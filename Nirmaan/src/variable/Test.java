package variable;

	public class Test {
		static int c=20;// static variable
		public void pupAge() {
		      int age=1;//local variable/
		      
		      age = age + 7;
		      System.out.println("Puppy age is : " + age);
		   }
		   public static void main(String args[]) {
		      Test test = new Test();
		      test.pupAge();
		      int b=20;//instance varable
		      
		   }
		}


