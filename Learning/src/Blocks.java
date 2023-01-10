
public class Blocks {
	
	{
		System.out.println("Exuting from Instance initialization block");
	}
	
	static {
		System.out.println("Excuting from static intitialization block");
		
	}
	
	final int Add(int a, int b, int c) {
		System.out.println(a+b+c);
		return a+b+c;
		
	}

}
