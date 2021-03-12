public class Main {
    public static void main(String[] args) {
        Time time = new Time((int) (Math.random()*50)+1, (int) (Math.random()*200)+1, (int) (Math.random()*200)+1);
        System.out.println("Current time: " + time);
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " +time.getSecond());
        time.setSecond((int) (Math.random()*200)+1);
        time.setMinute((int) (Math.random()*200)+1);
        time.setHour((int) (Math.random()*50)+1);
        System.out.println("New Time : " + time);
        System.out.println("New Hour: " + time.getHour());
        System.out.println("New Minute: " + time.getMinute());
        System.out.println("New Second: " +time.getSecond());
        time.setTime(23,59,59);
        System.out.println("Next Second:" + time.nextSecond());
        time.setTime(0,1,0);
        System.out.println("Previous second: " + time.previousSecond());
    }
}
