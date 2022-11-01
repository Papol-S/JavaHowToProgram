package Lesson8.Exercise8_5;

import Lesson8.Example8_5.Time2;

public class Time2Modify {
    private int secondsFromMidnight;

    private final int secondInMinute = 60;
    private final int secondInHour = 3600;
    private final int minuteInHour = 60;

    public Time2Modify (int h, int m, int s) {
        setTime(h,m,s);
    }

    public Time2Modify () {
        this(0,0,0);
    }

    public Time2Modify (int h){
        this(h,0,0);
    }

    public Time2Modify (int h, int m) {
        this(h,m,0);
    }

    public Time2Modify (Time2Modify time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    public void setTime (int h,int m,int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public void setHour (int h) {
        if (h > 0 && h < 24)
             secondsFromMidnight += h * secondInHour;
        else
            throw new IllegalArgumentException("must be greater than 0 and less than 24");
    }

    public void setMinute (int m){
        if (m > 0 && m < 60)
             secondsFromMidnight += m * secondInMinute;
        else
            throw new IllegalArgumentException("must be greater than 0 and less than 60");
    }

    public void setSecond (int s) {
        if (s > 0 && s < 60)
             secondsFromMidnight += s;
        else
            throw new IllegalArgumentException("must be greater than 0 and less than 60");
    }

    public int getHour () {
        return secondsFromMidnight/secondInHour;
    }

    public int getMinute () {
        return (secondsFromMidnight%secondInHour)/secondInMinute;
    }

    public int getSecond () {
        return secondsFromMidnight%secondInHour;
    }

    public String toString () {
        return String.format("%d:%02d:%02d %s",getHour()==0||getHour()==12?12:getHour()%12,getMinute(),getSecond(),getHour()<12?"AM":"PM");
    }
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
    }
}
