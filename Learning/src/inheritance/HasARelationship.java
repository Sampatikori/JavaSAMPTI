package inheritance;

public class HasARelationship {
public static void main (String[] args) {
	Library sharada= new Library();
	sharada.name="Sharada";
	sharada.noofbooks=100;
	sharada.location="Bengalore";
	
	sharada.student=new Student();
	
	System.out.println("Library name= "+ sharada.name);
	System.out.println("Student name= "+ sharada.student.name);
	System.out.println("Student id= "+ sharada.student.id);
	System.out.println("Student college= "+ sharada.student.college);
	
}
}
