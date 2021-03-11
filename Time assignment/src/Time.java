public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        setSecond(this.second);
        setMinute(this.minute);
        setHour(this.hour);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 24){
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
        setSecond(this.second);
        setMinute(this.minute);
        setHour(this.hour);
    }
    public String toString(){
        String second = "0" + this.second;
        String minute = "0" + this.minute;
        String hour = "0" + this.hour;
        if (this.hour < 10 && this.minute < 10 && this.second< 10){
            return hour + ":" + minute + ":" + second;
        }
        else if (this.hour < 10 && this.minute < 10){
            return hour + ":" + minute + ":" + this.second;
        }
        else if (this.minute < 10 && this.second< 10){
            return this.hour + ":" + minute + ":" + second;
        }
        else if (this.hour < 10 && this.second < 10){
            return hour + ":" + this.minute + ":" + second;
        }
        else if (this.minute < 10){
            return this.hour + ":" + minute + ":" + this.second;
        }
        else if (this.second < 10){
            return this.hour + ":" + this.minute + ":" + second;
        }
        else if (this.hour < 10 ){
            return hour + ":" + this.minute + ":" + this.second;
        }
        else{
            return this.hour + ":" + this.minute + ":" + this.second;
        }
    }
    public Time nextSecond(){
        Time time = new Time(hour, minute, second);
        time.second += 1;
        time.setSecond(time.second);
        time.setMinute(this.minute);
        time.setHour(this.hour);
        return time;
    }
    public Time previousSecond(){
        Time time = new Time(hour, minute, second);
        this.second -= 1;
        return time;
    }
}