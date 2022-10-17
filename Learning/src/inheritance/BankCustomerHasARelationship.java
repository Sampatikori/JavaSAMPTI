package inheritance;

public class BankCustomerHasARelationship {
public static void main(String[] args) {
	Bank bank= new Bank();
	bank.name="Canara bank";
	bank.branch="PDA clg";
	bank.customer=new Customer();
	
	System.out.println(bank.customer.name + " has an account in " + bank.name);
	System.out.println("Account number of Sam is : "+ bank.customer.accnum);
	System.out.println(bank.customer.name + " has canara account in " + bank.branch);
	
	
			
			
	
	
}
}
