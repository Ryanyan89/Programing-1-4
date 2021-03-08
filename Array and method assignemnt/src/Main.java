public class Main {
    public static int[] addNumberToArray(int[] inputArray, int number) {
        int[] outputArray = new int[inputArray.length + 1];
        for(int i = 0; i < inputArray.length; i++){
            outputArray[i] = inputArray[i];
            outputArray[outputArray.length - 1] = number;
        }
        return outputArray;
    }

    public static int[] deleteNumber(int[] inputArray){
        int[] outputArray = new int[inputArray.length - 1];
        for(int i = 0; i < outputArray.length; i++){
            outputArray[i] = inputArray[i];
        }
        return  outputArray;
    }
    public static int[] insertNumber(int[] inputArray, int number, int indexPosition){
        int[] outputArray = new int[inputArray.length + 1];
        for (int i = 0; i < outputArray.length; i++) {
            //check if i is equal to indexPosition - 1
            if(i == indexPosition - 1){
                outputArray[indexPosition - 1] = number;
            }
            //check if number is inserted
            else if(outputArray[indexPosition - 1] == number){
                outputArray[i] = inputArray[i - 1];
            }
            //adding values to the array until number is inserted
            else{
                outputArray[i] = inputArray[i];
            }

        }

        return outputArray;
    }
    public static void main(String[] args) {
        //adding of a index position to the end of an array
        int[] newArray = new int[5];
        System.out.println("*****Old Array*****");
        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = i + 1;
            System.out.println(newArray[i]);
        }
        int[] newLine = addNumberToArray(newArray, 727);
        System.out.println("*****New Array*****");
        for(int value : newLine){
            System.out.println(value);
        }

        System.out.println();
        //getting rid of an index position at the end of an array
        int[] newArray2 = new int[5];
        System.out.println("*****Old Array*****");
        for(int i = 0; i < newArray2.length; i++) {
            newArray2[i] = i + 1;
            System.out.println(newArray2[i]);
        }
        int[] goneLine = deleteNumber(newArray2);
        System.out.println("*****New Array*****");
        for(int value : goneLine){
            System.out.println(value);
        }

        System.out.println("\n");

        //inserting a index position in an point of the array
        int[] newArray3 = new int[5];
        System.out.println("*****Old Array*****");
        for(int i = 0; i < newArray3.length; i++){
            newArray3[i] = i + 1;
            System.out.println(newArray3[i]);
        }

        int[] insertNumber =insertNumber(newArray3, 420, 3);
        System.out.println("*****New Array*****");
        for(int value : insertNumber){
            System.out.println(value);
        }




    }
}
