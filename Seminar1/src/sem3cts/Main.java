package sem3cts;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Main{
	

//   public static void main (String[] args) {
//CalendarUtil cu=new CalendarUtil();
//  double d1=1.03;
//  double d2=0.43;
//  BigDecimal bg1=new BigDecimal("1.02");
//  BigDecimal bg2=new BigDecimal("0.43");
//  System.out.println(bg1.subtract(bg2));
  
//try {
//	System.out.println(cu.weekdDay(3));
//	System.out.println(cu.weekDay2(3));
//	System.out.println(cu.weekDay3(3));
//	System.out.println(cu.weekDay4(3));
//} catch (IncorectDayException e) {
//	// TODO Auto-generated catch block
//	System.out.println(e.getMessage());
//
//}

public static void main(String[] args)
{
	Persoana p=new Persoana("Petru");
	BankAccount account = new BankAccount("INGB123242342", p);
	
	account.deposit(100);
	try {
		account.withdraw(30);
		account.withdraw(40);
		account.withdraw(70);

	} catch (InsuficientFundsException e) {
		System.out.println(e.getMessage());
	}
		
	System.out.println(account.getBalance());
	
	
	account = new FeeBankAccount("INGB123123234234", p);
	
	account.deposit(500);
	
	try {
		account.withdraw(100);
	} catch (InsuficientFundsException e) {
		System.out.println(e.getMessage());
	}
	Map<Persoana, BankAccount>  employees= new HashMap<>();
	Persoana p1=new Persoana("Chuck Norris");
	BankAccount b1= new BankAccount("RFZ4648734684", p1);
	
	Persoana p2=new Persoana("Arnold");
	BankAccount b2= new BankAccount("ING64734674474", p2);
	
	Persoana p3=new Persoana("Van Damme");
	BankAccount b3= new BankAccount("BT464647644484", p3);
	
	employees.put(p1, b1);
	employees.put(p2, b2);
	employees.put(p3, b3);
	for(Account a: employees.values()) {
		a.deposit(1000);
	}
	
	for(Account a: employees.values()) {
		try {
		a.withdraw(10);
		}
		catch(InsuficientFundsException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	}
	
	
	

}

