class Ternaryoperator1111{
 
public static void main(String [] args){
int n1=10, n2=20, n3=15;
int largest= (n1>=n2) ? ((n1>=n3) ? n1 : n3) : ((n2>=n3) ? n2 : n3);
System.out.println("The largest number is : "+largest);
}
}