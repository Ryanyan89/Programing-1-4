import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void check(String word, ArrayList<String> arrayList, ArrayList<Integer> answers) {
        int lineNumber = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            lineNumber++;
            if (arrayList.get(i).contains(word)){
                answers.add(lineNumber);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> lines = new ArrayList<>();

        ArrayList<Integer> answers = new ArrayList<>();
        ArrayList<String> possibleSentence = new ArrayList<>();
        String line;
        String word = "the";
        while ((line = br.readLine()) !=null){
            lines.add(line);
        }
        br.close();
        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i));
        }
        check("the", lines, answers);System.out.println("Your word: " + word + ". Find your word in lines: " );
        for (int i = 0; i < answers.size(); i++) {
            System.out.println(answers.get(i));
        }

    }
}
