package sem2cts;

import java.text.DateFormatSymbols;

public class CalendarUtil
{
	public String weekdDay(int day) throws IncorectDayException {
	if(day==1)
		return "Sunday";
	else if (day==2)
		return "Monday";
	else if (day==3)
	    return "Tuesday";
	else if (day==4)
	    return "Wednesday";
	else if (day==5)
	    return "Thursday";
	else if (day==6)
		return "Friday";
	else if (day==7)
		return "Saturday";
	throw new IncorectDayException("Only 7 days");
	}

	public String weekDay2(int day)
	{
		switch(day) {
			case 1:
				return "Sunday";
			case 2:
				return "Monday";
			case 3:
				return "Tuesday";
			case 4:
				return "Wednesday";
			case 5:
				return "Thursday";
			case 6:
				return "Friday";
			case 7:
				return "Saturday";
			default:
				return null;
	}
		
   }
	public String weekDay3(int day) throws IncorectDayException {
		if(day<1 || day>7)
			throw new IncorectDayException("Only 7 days");
			
		String[] weekDays= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Sturday"};
		return weekDays[day-1];
		
	}
	public String weekDay4(int day) throws IncorectDayException
	{
		if(day<1 || day>7)
			throw new IncorectDayException("Only 7 days");
		String days[]=new DateFormatSymbols().getWeekdays();
		return days[day-1];
	}
}
