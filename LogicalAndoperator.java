class LogicalAndoperator{
 
public static void main(String [] args){
int a = 50;
int b = 60;
boolean result = (a<b) && (a<(b++));
System.out.println(result);
System.out.println("b : "+b);
}
}