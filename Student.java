class Student{
 String name;
String vTUno;
String dOB;
String branch;
String clgname;

void studying(){
 System.out.println(name+" "+"from"+" "+branch+" "+"with"+" "+vTUno+" "+"is studying in"+" "+clgname);
}
public static void main(String args[]){
   Student aishwarya = new Student();
    aishwarya.name = "Aishwarya";
    aishwarya.vTUno = "3PD18IP002";
    aishwarya.dOB = "18/11/2000";
    aishwarya.branch = "IPE";
    aishwarya.clgname = "PDA";

    aishwarya.studying();

    Student smita = new Student();
    
     smita.name="Smita";
     smita.vTUno="3PD18IP016";
     smita.dOB="4/02/2000";
     smita.branch="IPE";
     smita.clgname="PDA";

    smita.studying();
  
   Student someshwari=new Student();
   
     someshwari.name="Someshwari";
    someshwari.vTUno="3PD18IP017";
    someshwari.dOB="20/11/2000";
    someshwari.branch="IPE";
    someshwari.clgname="PDA"; 
   
  someshwari.studying();

  Student sampatti=new Student();
   
    sampatti.name="Sampatti";
    sampatti.vTUno="3PD18IP020";
   sampatti.dOB="14/7/2000";
    sampatti.branch="IPE";
   sampatti.clgname="PDA"; 
   
  sampatti.studying();

Student kajal=new Student();
   
    kajal.name="Kajal";
    kajal.vTUno="3PD18IP007";
  kajal.dOB="17/1/2000";
    kajal.branch="IPE";
   kajal.clgname="PDA"; 
   
 kajal.studying();

  
     
}
} 