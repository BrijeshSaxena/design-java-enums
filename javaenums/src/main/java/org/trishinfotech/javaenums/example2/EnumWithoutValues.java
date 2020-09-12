package org.trishinfotech.javaenums.example2;

enum WeekDays {
   SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class EnumWithoutValues {

	public static void main(String[] args) {
		WeekDays weekdays = WeekDays.THURSDAY;
		switch (weekdays) {
			case SUNDAY:
				System.out.println("Sunday Funday");
				doYourTaskForWeekEnds();
				break;
			case MONDAY:
				System.out.println("MarketingMonday");
				doYourTaskForWeekDays(weekdays);
				break;
			case TUESDAY:
				System.out.println("TrendyTuesday");
				doYourTaskForWeekDays(weekdays);
				break;
			case WEDNESDAY:
				System.out.println("Wellness Wednesday");
				doYourTaskForWeekDays(weekdays);
				break;
			case THURSDAY:
				System.out.println("Thankful Thursday");
				doYourTaskForWeekDays(weekdays);
				break;
			case FRIDAY:
				System.out.println("Foodie Friday");
				doYourTaskForWeekDays(weekdays);
				break;
			case SATURDAY:
				System.out.println("SocialSaturday");
				doYourTaskForWeekEnds();
				break;
		}
	}

	private static void doYourTaskForWeekEnds() {
		System.out.println("Relax and Enjoy! its Weekend :)");
	}

	private static void doYourTaskForWeekDays(WeekDays weekdays) {
		System.out.println("Ohh! Its a weekday. Have to work!");
	}
}
