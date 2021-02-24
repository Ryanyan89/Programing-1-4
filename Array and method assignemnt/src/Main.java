public class Main {
    public static int[] addNumberToArray(int[] inputArray, int number) {
        int[] outputArray = new int[inputArray.length + 1];
        for (int i = 0; i < inputArray.length; i++){
            inputArray[i] = inputArray[i] + 1;
        }
        // in a for loop copy the inputArray to the output array
        // return the array
        return outputArray;
    }
    public static int[] deleteNumber(int[] inputArray){

    }
    public static int[] insertNumber(int[] inputArray, int number){

    }
    public static void main(String[] args) {

    }
}
