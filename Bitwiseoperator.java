class Bitwiseoperator{
 
public static void main(String [] args){
int x = 10;
int y = 20;
boolean orResult = (x!=y) | (++x>y);
System.out.println(orResult);
System.out.println("x : "+x);
boolean andResult = (x==y) & (x!=y++);
System.out.println(andResult);
System.out.println("y: "+y);
}
}