package com.Xworkz.Learning.collection.map.hash_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapBankCustomer {
	public static void main(String[] args) {
		
		Bank hdfc=new Bank();
		hdfc.setName("HDFC");
		Bank sbi=new Bank();
		sbi.setName("SBI");
		Bank karnataka=new Bank();
		karnataka.setName("Karnataka");
		
		Customer sampati=new Customer();
		sampati.setName("Sampati");
		sampati.setAcc_no(258369147);
		sampati.setLocation("OmNagar");
		
		Customer vismaya=new Customer();
		vismaya.setName("Vismaya");
		vismaya.setAcc_no(321654789);
		vismaya.setLocation("RRNagar");
		
		Customer veena=new Customer();
		veena.setName("Veena");
		veena.setAcc_no(654789123);
		veena.setLocation("PoojaColony");
		
		Customer smita=new Customer();
		smita.setName("Smita");
		smita.setAcc_no(287563419);
		smita.setLocation("NgColony");
		
		Customer shanti=new Customer();
		shanti.setName("Shanti");
		shanti.setAcc_no(563897214);
		shanti.setLocation("ShaktiNagar");
		
		Customer priya=new Customer();
		priya.setName("Priya");
		priya.setAcc_no(558746321);
		priya.setLocation("AdarshNagar");
		
		Customer sahiti=new Customer();
		sahiti.setName("Sahiti");
		sahiti.setAcc_no(873324561);
		sahiti.setLocation("GangColony");
		
		Customer sahil=new Customer();
		sahil.setName("Sahil");
		sahil.setAcc_no(925864431);
		sahil.setLocation("SundarNagar");
		
		Customer suresh=new Customer();
		suresh.setName("Suresh");
		suresh.setAcc_no(644587912);
		suresh.setLocation("DoctorColony");
		
		ArrayList<Customer> hdfcCustomerList=new ArrayList<Customer>();
		hdfcCustomerList.add(veena);
		hdfcCustomerList.add(sampati);
		hdfcCustomerList.add(sampati);
		
		ArrayList<Customer> sbiCustomerList=new ArrayList<Customer>();
		sbiCustomerList.add(smita);
		sbiCustomerList.add(priya);
		sbiCustomerList.add(shanti);
		
		ArrayList<Customer> karnatakaCustomerList=new ArrayList<Customer>();
		karnatakaCustomerList.add(sahiti);
		karnatakaCustomerList.add(suresh);
		karnatakaCustomerList.add(sahil);
		
		HashMap<Bank,ArrayList<Customer>> mapBankAndCustomers=
				new HashMap<Bank,ArrayList<Customer>>();
		mapBankAndCustomers.put(karnataka, karnatakaCustomerList);
		mapBankAndCustomers.put(sbi, sbiCustomerList);
		mapBankAndCustomers.put(hdfc, hdfcCustomerList);
		
//		System.out.println(mapBankAndCustomers);
		
//		for(Map.Entry<Bank, ArrayList<Customer>> entry:mapBankAndCustomers.entrySet()) {
//			System.out.print(entry.getKey() + " : ");
//		Iterator<Customer> itr=entry.getValue().iterator();
//		while(itr.hasNext()) {
//			System.out.print(itr.next().getName()+ ", ");
//		}
//		System.out.println();
//		}
			for(Map.Entry<Bank, ArrayList<Customer>> entry:mapBankAndCustomers.entrySet()) {
			if(entry.getKey().getName().equals("Karnataka")) {
			System.out.println("Customers of Karnataka bank are "+ " : ");
			for(Customer customer:entry.getValue()) {
				System.out.println("Customer : ");
				System.out.print("Name : "+customer.getName()+", ");
				System.out.print("Account number : "+customer.getAcc_no()+", ");
				System.out.print("Location : "+customer.getLocation()+", ");
			}
				}
			}
		}
	}

	
		
		
		
		
		
		
		
	

