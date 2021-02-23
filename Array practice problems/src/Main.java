public class Main {
    public static void main(String[] args) {
        //problem 1
        int[] smallNumbers = new int[20];
        int numberOne = 0;
        for(int i = 0 ; i < smallNumbers.length; i++){
            smallNumbers[i] = (int) (Math.random()*6 + 1);
            System.out.println("Index: " + i + "\tValue: " + smallNumbers[i]);
            if(smallNumbers[i] == 1){
                numberOne++;
            }
        }
        System.out.println("amount of ONES: " + numberOne + "\n");
        //problem 2
        int [] bigNumbers = new int[10];
        int total = 0;
        for(int i = 0; i < bigNumbers.length; i++){
            bigNumbers[i] = (int) (Math.random()*100 + 1);
            System.out.println("Index: " + i + "\tValue: " + bigNumbers[i]);
            total = total + bigNumbers[i];
        }
       
        int average  = total / bigNumbers.length;
        System.out.println("average number: " + average + "\n");

        //problem 3
        int firstNumber = bigNumbers[0];
        int lastNumber = bigNumbers[9];
        bigNumbers[0] = lastNumber;
        bigNumbers[9] = firstNumber;
        System.out.println("index: 0 \tValue: " + bigNumbers[0]);
        System.out.println("index: 9 \tValue: " + bigNumbers[9] + "\n");

        //problem 4
        for(int i = 0; i < bigNumbers.length; i++) {
            System.out.println("Index: " + i + "\tValue: " + bigNumbers[i]);
        }
        System.out.println();
        int [] backwards = new int[10];
        for(int i = 0; i < backwards.length; i++){
            backwards[i] = bigNumbers[9 - i];
            System.out.println("Index: " + i + "\tReversed Value: " + backwards[i]);
        }
    }
}
