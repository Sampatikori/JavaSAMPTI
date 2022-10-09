class IfElseIfLadder{
public static void main (String[] args){
double marks = 88.64;
if(marks>=85){
System.out.println("Students are passed in distinction");
}
else if(marks>=65 && marks<85){
System.out.println("Students are passed in First class");
}
else if(marks>=35 && marks<60){
System.out.println ("Students are passed in Second class");
}
else{
System.out.println ("Students are Failed");
}
}
}