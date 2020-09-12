package org.trishinfotech.javaenums.example3;

enum WeekDays {
	   SUNDAY("Sunday Funday", true), 
	   MONDAY("MarketingMonday"),
	   TUESDAY("Trendy Tuesday"), 
	   WEDNESDAY("Wellness Wednesday"),
	   THURSDAY("Thankful Thursday"),
	   FRIDAY("Foodie Friday"),
	   SATURDAY("Social Saturday", true);
	private String daysGreeting;
	private boolean isWeekend;
	WeekDays(final String daysGreeting) {
		this.daysGreeting = daysGreeting;
	}
	WeekDays(final String daysGreeting, final boolean isWeekend) {
		this(daysGreeting);
		this.isWeekend = isWeekend;
	}
	public String getDaysGreeting() {
		return daysGreeting;
	}
	public boolean isWeekend() {
		return isWeekend;
	}
}
public class EnumWithValues {

	public static void main(String[] args) {
		WeekDays weekdays = WeekDays.THURSDAY;
		System.out.println(weekdays.getDaysGreeting());
		if (weekdays.isWeekend()) {
			doYourTaskForWeekEnds();
		} else {
			doYourTaskForWeekDays(weekdays);
		}
	}

	private static void doYourTaskForWeekEnds() {
		System.out.println("Relax and Enjoy! its Weekend :)");
	}

	private static void doYourTaskForWeekDays(WeekDays weekdays) {
		System.out.println("Ohh! Its a weekday. Have to work!");
	}
}
