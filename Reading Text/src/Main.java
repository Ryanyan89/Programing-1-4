import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> findWord(ArrayList<String> sentences, String word) {
        ArrayList<Integer> indexPos = new ArrayList<>();
        for (int i = 0; i < sentences.size(); i++) {
            for (int j = 0 ; j < sentences.get(i).length(); j++) {
                if (sentences.get(i).startsWith(word, j)) {
                    indexPos.add(i);
                    indexPos.add(j);
                }
            }
        }
        return indexPos;
    }

    public static void main(String[] args) throws Exception {

        ArrayList<String> sentences = new ArrayList<>();
        ArrayList<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            if (!line.equals("")) {
                lines.add(line);
            }
        }
        br.close();

        for (String s : lines) {
            int counter = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '.' && !s.startsWith(".g", i) && !s.startsWith(".,", i)) {
                    if (s.length()-1 != i) {
                        if (s.charAt(i + 1) == '[') {
                            sentences.add(s.substring(counter, i+4));
                        }
                        else {
                            sentences.add(s.substring(counter, i+1));
                        }
                    }
                    else {
                        sentences.add(s.substring(counter, i+1));
                    }
                    if (s.length()-1 != i) {
                        if (s.charAt(i+1) == ' ') {
                            counter = i+2;
                        }
                        else if (s.charAt(i+1) == '[') {
                            counter = i+5;
                        }
                    }
                    else {
                        counter = i+1;
                    }
                }
            }
        }

        for (String s : sentences) {
            System.out.println(s);
        }

        String word = "the";
        ArrayList<Integer> indexPos = findWord(sentences, word);
        for (int i = 0; i < indexPos.size(); i += 2) {
            System.out.println("The word \"" + word + "\" appears in sentence: #" + indexPos.get(i) + " in Index Position: " + indexPos.get(i+1));
        }

        System.out.println("\"" + word + "\" appears " + indexPos.size()/2 + " times");

    }
}