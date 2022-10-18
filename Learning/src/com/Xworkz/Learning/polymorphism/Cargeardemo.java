package com.Xworkz.Learning.polymorphism;

public class Cargeardemo {
public static void main(String[] args){
 Cargear cargear=new Cargear();
 
 GearLevelD1 gearleveld1=new GearLevelD1();
 GearLevelD2 gearleveld2=new GearLevelD2();
 GearLevelD3 gearleveld3=new GearLevelD3();
 
 cargear.speed(gearleveld1);
 cargear.speed(gearleveld2);
 cargear.speed(gearleveld3);
 
	
}
}
