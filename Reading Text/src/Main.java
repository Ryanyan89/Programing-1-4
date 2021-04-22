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
        String fullSentence;
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
            period = sentence.indexOf(".");
            bracket = sentence.indexOf("]");
            if (period + 1 == sentence.length()){
                sentences.add(sentence);
            }
            else if (bracket + 1 == sentence.length()){
                sentences.add(sentence);
            }
            else {
                if (bracket > period){
                    fullSentence = sentence.substring(firstIndex, bracket + 1);
                    firstIndex = bracket + 2;
                }
                else {
                    fullSentence = sentence.substring(firstIndex, period + 1);
                    firstIndex = period + 2;
                }
                sentences.add(fullSentence);
                while (period + 1 <= fullSentence.length()){
                    fullSentence = sentence.substring(firstIndex);
                    period = fullSentence.indexOf(".");
                    firstIndex = 0;
                    fullSentence = fullSentence.substring(firstIndex, period + 1);
                    firstIndex = period + 2;
                    sentences.add(fullSentence);
                }
                firstIndex = 0;
            }
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
