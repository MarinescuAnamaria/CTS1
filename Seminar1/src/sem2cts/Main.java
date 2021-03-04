package sem2cts;
public class Main{
	

   public static void main (String[] args) {
CalendarUtil cu=new CalendarUtil();
try {
	System.out.println(cu.weekdDay(3));
	System.out.println(cu.weekDay2(3));
	System.out.println(cu.weekDay3(3));
	System.out.println(cu.weekDay4(3));
} catch (IncorectDayException e) {
	// TODO Auto-generated catch block
	System.out.println(e.getMessage());

}


}
}
