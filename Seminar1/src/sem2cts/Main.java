package sem2cts;

import java.math.BigDecimal;

import sem2cts.solid.BankAccount;
import sem2cts.solid.Persoana;

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
	BankAccount account= new BankAccount("ING1233455", p);
	account.deposit(100);
	account.withdraw(50);
	account.withdraw(70);
	
	System.out.println(account.getBalance());
}
}
