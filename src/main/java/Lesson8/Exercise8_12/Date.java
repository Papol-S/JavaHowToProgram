package Lesson8.Exercise8_12;

public class Date {
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth =
            {0,31,28,31,30,31,30,31,31,30,31,30,31};

    public Date(int theMonth, int theDay, int theYear) {
        month = checkMonth(theMonth);
        year = checkYear(theYear);
        day = checkDay(theDay);

        System.out.printf("Date object constructor for date %s\n",this);
    }
    private int checkYear (int testYear) {
        if (testYear > 0)
            return testYear;
        else
            throw new IllegalArgumentException("must greater than 0");
    }

    private int checkMonth (int testMonth) {
        if (testMonth > 0 && testMonth <= 12)
            return testMonth;
        else
            throw new IllegalArgumentException("Month must be in 1-12");
    }

    private int checkDay (int testDay) {
        if (testDay > 0 && testDay <= daysPerMonth[month])
            return testDay;
        if (month == 2 && testDay == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 )))
            return testDay;
        throw new IllegalArgumentException("day out-of-range for the specified month and year");
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d",month,day,year);
    }

    public void incrementYear () {
        year++;
    }
    public void incrementMonth () {
        if (month < 12){
            month++;
        }
        else {
            month = 1;
            incrementYear();
        }
    }
    public void incrementDay () {
        if (day < daysPerMonth[month]) {
            day++;
        }
        else {
            day = 1;
            incrementMonth();
        }
    }
}
