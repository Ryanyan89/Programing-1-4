public class Main {
    public static void main(String[] args) {
        int[] smallNumbers = new int[20];
        for(int i = 0 ; i < smallNumbers.length; i++){
            int random = (int) (Math.random()*6 + 1);
            smallNumbers[i] = random;
            System.out.println("Index: " + i + " Value: " + random);
        }
        int [] bigNumbers = new int[10];
        for(int i = 0; i < bigNumbers.length; i++){
            int rngNumber = (int) (Math.random()*100 + 1);
            bigNumbers[i] = rngNumber;
            System.out.println("Index: " + i + " Value: " + rngNumber);
        }
        int total = 0;
        for(int bigNumber : bigNumbers) {
            total = total + bigNumber;
        }
        int average  = total / bigNumbers.length;
        System.out.println(average);
    }
}
