import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add("a");
		l.add("b");
		l.add("c");
		
		for(int i=l.size()-1;i>=0;i--) {
			System.out.println(l.get(i));
		}
		
		
		
	}

}
