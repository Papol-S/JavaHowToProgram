package Lesson8.Exercise8_12StaticTest_Not_suitable;

public class DateAndTime {
    private Date date;
    private Time2 time;

    public DateAndTime(Date date, Time2 time) {
        this.date = date;
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time2 getTime() {
        return time;
    }

    public void setTime(Time2 time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "DateAndTime{" +
                "date=" + date +
                ", time=" + time +
                '}';
    }

    public void incrementSecond () {
        Time2.incrementSecond();
    }
    public void incrementMinute (){
        time.incrementMinute();
    }
    public void incrementHour () {
        time.incrementHour();
    }
    public void incrementDate () {
        date.incrementDay();
    }
    public void incrementMonth (){
        date.incrementMonth();
    }
    public void incrementYear (){
        date.incrementYear();
    }
}
