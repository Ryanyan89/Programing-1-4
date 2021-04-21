import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static String check(String word, ArrayList<String> arrayList, ArrayList<Integer> answers) {
        int lineNumber = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            lineNumber++;
            if (arrayList.get(i).contains(word)){
                answers.add(lineNumber);
            }
        }
        if (answers.size() == 0) {
            return "Your word " + word + " was not found.";
        }
        else {
            return String.valueOf(answers);
        }
    }
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<Integer> answers = new ArrayList<>();
        ArrayList<String> sentences = new ArrayList<>();

        int period;
        int bracket;
        int firstIndex = 0;
        int periods = 0;
        String fullSentence = " ";
        String sentence;
        String line;
        String word = "once";
        while ((line = br.readLine()) !=null){
            lines.add(line);
        }
        br.close();
        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i));
            sentence = lines.get(i);
            char[] letters = new char[sentence.length()];
            letters = sentence.toCharArray();
            period = sentence.indexOf(".");
            bracket = sentence.indexOf("]");
            for (int i2 = 0; i2 < letters.length; i2++){
                if (letters[i2] == '.'){
                    periods++;
                    if (periods > 1){
                        assert false;
                        period = fullSentence.indexOf(".");
                        bracket = fullSentence.indexOf("]");
                        if (period + 1 == fullSentence.length()){
                            periods = 1;
                        }
                        else{
                            if (letters[i2] == '.' && letters[i2 + 1] == '['){
                                fullSentence = sentence.substring(firstIndex, bracket + 1);
                                sentences.add(fullSentence);
                                firstIndex = bracket;
                            }
                            else if (letters[i2] == '.' && letters[i2 + 1] != '['){
                                fullSentence = sentence.substring(firstIndex, period + 1);
                                sentences.add(fullSentence);
                                firstIndex = period;
                            }
                        }
                    }
                }
            }
            if (periods == 1){
                sentences.add(sentence);
            }

            periods = 0;
            firstIndex= 0;

        }

        System.out.println("***************************************************");
        System.out.println("Your is word: " + word + ". Find your word in lines: " );
        System.out.println(check(word, lines, answers));
        System.out.println("***************************************************");
        for (int i = 0; i <sentences.size(); i++) {
            System.out.println(sentences.get(i));
        }
    }
}
