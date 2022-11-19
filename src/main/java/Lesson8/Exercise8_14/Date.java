package Lesson8.Exercise8_14;

import java.util.Arrays;

public class Date {
    private int[] date = new int[4];

    private static final int[] daysPerMonth =
            {0,31,28,31,30,31,30,31,31,30,31,30,31};
    private static final String[] nameOfMonth = {" ","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

    public Date(int theMonth, int theDay, int theYear) {
        setDayOfYear();
        setMonth(theMonth);
        setDay(theDay);
        setYear(theYear);
//        System.out.printf("Date object constructor for date %s\n",this);
    }

    public Date (String m,int d,int y) {
        setYear(y);
        setMonth(Arrays.binarySearch(nameOfMonth,m));
        setDay(d);
        setDayOfYear();

    }

    public Date (int dateOfYear, int y) {
        setYear(y);
        setDayOfYearToMonth(dateOfYear);
    }

    public void setMonth (int m) {
        date[0] = checkMonth(m);
    }

    public void setDay (int d) {
        date[1] = checkDay(d);
    }
    public void setYear (int y) {
        date[2] = checkYear(y);
    }

    public void setDayOfYear () {
        if (isLeapYear(date[2])) {
            for (int i = 1; i < date[0]; i++) {
                date[3] += daysPerMonth[i];
                if (i == 2) {
                    date[3]++;
                }
            }
        }
        else {
            for (int i = 1; i < date[0]; i++) {
                date[3] += daysPerMonth[i];
            }
        }
        date[3] += date[1];
    }

    public void setDayOfYearToMonth (int d) {
        int count = 1;
        if (isLeapYear(date[2])) {
            if (d < 367) {
                date[3] = d;
                while (d > daysPerMonth[count]) {
                    d -= daysPerMonth[count];
                    if (count == 2)
                        d--;
                    count++;
                }
            } else
                throw new IllegalArgumentException("Invalid date");
        } else {
            if (d < 366) {
                date[3] = d;
                while (d > daysPerMonth[count]) {
                    d -= daysPerMonth[count];
                    count++;
                }
            } else
                throw new IllegalArgumentException("Invalid date");
        }
        date[0] = count;
        date[1] = d;
    }


    private boolean isLeapYear (int y){
        if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0 )) {
            return true;
        }
        else
            return false;
        //return (getYear() % 400 == 0 || (getYear() % 4 == 0 && getYear() % 100 != 0));
    }

    private int checkMonth (int testMonth) {
        if (testMonth > 0 && testMonth <= 12)
            return testMonth;
        else
            throw new IllegalArgumentException("Month must be in 1-12");
    }

    private int checkDay (int testDay) {
        if (testDay > 0 && testDay <= daysPerMonth[date[0]])
            return testDay;
        if (date[0] == 2 && testDay == 29 && isLeapYear(date [2]))
            return testDay;
        throw new IllegalArgumentException("day out-of-range for the specified month and year");
    }
    private int checkYear (int testYear) {
        if (testYear > 0 && testYear < 9999) {
            return testYear;
        }
        else
            throw new IllegalArgumentException("year out-of-range");
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d",date[0],date[1],date[2]);
    }

    public String toString2 () {
        return String.format("%s %02d, %04d",nameOfMonth[date[0]],date[1],date[2]);
    }

    public String toString3 () {
        return String.format("%03d %04d",date[3],date[2]);
    }

    public int getYear() {
        return date[2];
    }
}
