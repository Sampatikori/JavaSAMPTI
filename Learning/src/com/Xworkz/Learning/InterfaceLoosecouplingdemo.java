package com.Xworkz.Learning;

public class InterfaceLoosecouplingdemo {
	public static void main(String[] args) {
		
	
	
	Sony sony=new Sony();
	Epson epson=new Epson();
	Computer cmp=new Computer();
cmp.slot(sony);
cmp.slot(epson);
	

}
}