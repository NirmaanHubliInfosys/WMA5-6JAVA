package Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		Vector al=new Vector<>();
//		al.add("ashok");//index of 0
//		al.add("java");
//		al.add("training");
		al.add(10);//index of 0
		al.add(25);
		al.add(50);
		al.add(20);
		al.add(25);
		al.add(23);
		al.add(25);
//		Iterator<String>iterator=al.iterator();
//		while(iterator.hasNext()) {
//			String next=iterator.next();
//			System.out.println(next);
//		}
//		ListIterator<String>listIterator=al.listIterator();
//		while(listIterator.hasNext()) {
//			String next=listIterator.next();
//			System.out.println(next);
//		}
		
		Enumeration e=al.elements();
		while(e.hasMoreElements()) {
			
			System.out.println(e.nextElement()+" ");
			
		}
		
	}

}
