package Collection;

import java.util.Stack;

public class ExampleStack {
public static void main(String[] args) {
	Stack<Double>s=new Stack<Double>();
	s.push(10.2);
	s.push(50.2);
	s.push(30.2);
	System.out.println(s);//[10.2, 50.2, 30.2]
	s.pop();//always it removes end of the array element
	System.out.println(s);//[10.2, 50.2]
	s.remove(0);
	System.out.println(s);//[50.2]

	s.peek();
	System.out.println(s);//[50.2]

}
}
