public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour > 24){
            int hour1;
            hour1 = hour % 24;
            this.hour = hour1;
        }
        else{
            this.hour = hour;
        }

    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 60){
            int minute1, increaseHour;
            minute1 = minute % 60;
            increaseHour = minute/60;
            this.hour += increaseHour;
            this.minute = minute1;
        }
        else {
            this.minute = minute;
        }


    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 60){
            int second1, increaseMinute;
            second1 = second % 60;
            increaseMinute = second/60;
            this.minute += increaseMinute;
            this.second = second1;
        }
        else{
            this.second = second;
        }

    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toString(){
        return hour + ":" + minute + ":" + second;
    }


}
