public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        char[] letters = s.toCharArray();
        char[] vowels = "aeiou".toCharArray();
        for (int i = 0; i < s.length(); i++){
            for (char vowel:vowels){
                if (letters[i] == vowel){
                    answer++;
                }
            }
        }
        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;
        char[] letters = s.toCharArray();
        for (int i = 0; i < s.length()-2; i++){
                if (letters[i] == 'b' && letters[i + 1] == 'o' && letters[i + 2] == 'b'){
                    answer++;
                }
            }
        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        char[] letters = s.toCharArray();
        int firstIndexPosition = 0;
        int lastIndexPosition;
        int length = 0;
        String possibleAnswer = " ";
        String answer = " ";
        for (int i = 0; i < s.length() - 1; i++){
            if (letters[i] > letters[i + 1]){
                firstIndexPosition = i + 1;
                if (possibleAnswer.equals(" ")){
                    answer = s.substring(0,1);
                }
            }
            else{
                lastIndexPosition = i + 2;
                possibleAnswer = s.substring(firstIndexPosition,lastIndexPosition);
                if (possibleAnswer.length() > length){
                    length = possibleAnswer.length();
                    answer = possibleAnswer;
                }
            }
        }
        s = answer;
        return s;
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s;
    }
}
