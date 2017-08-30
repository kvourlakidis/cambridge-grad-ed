// 1 Jan 1900 was a Monday
// September, April, June and November
// all have 30 days.
// January, March, May, July, August,
// October and December have 31 days.
// February has 28 days, 29 on leap years,
// which occur on years divisible by 4, but not
// by 100, unless is also divisible by 400.
// How many Sundays fell on the first of the month
// during the twentieth century (1 Jan 1901 to 31 Dec 2000) ?

public class Problem019 {
	public static void main(String[] args) {
		Day day = Day.MONDAY;
		day = Day.TUESDAY;
		System.out.println(day);
		System.out.println(day.next());
	}
}

enum Day {
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

	Day next() {
		switch (this) {
			case MONDAY: return TUESDAY;
			case TUESDAY: return WEDNESDAY;
			case WEDNESDAY: return THURSDAY;
			case THURSDAY: return FRIDAY;
			case FRIDAY: return SATURDAY;
			case SATURDAY: return SUNDAY;
			default: return MONDAY;
		}
	}
}
