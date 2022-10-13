package inheritance;

public class multilevelinheritancedemo {
public static void main(String[] args) {
	Animal animal=new Animal();
	Cow cow=new Cow();
	Calf calf = new Calf();
	
	calf.wagging();
	calf.producemilk();
	calf.play();
	
	
	
}
}
