import java.util.ArrayList;
import java.util.Iterator;

public class Example {
	
	public static void main(String[] args) {
		
//		  ArrayList arrayList = new ArrayList();
		ArrayList<String> a = new ArrayList();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		
		
		
		for(String c:a) {
			System.out.println(c);
		}
		
		System.out.println("---------");
		
		Iterator<String> iterator = a.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			if(next.equals("c")) {
				System.out.println(next);
			}
			
			
		}
		
	}

}
