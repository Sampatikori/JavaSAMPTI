class Logicaloperator{
 
public static void main(String [] args){
int a = 10;
int b = 20;
boolean result = (a<b) || (a>(--b));
System.out.println(result);
System.out.println("b : "+b);
}
}