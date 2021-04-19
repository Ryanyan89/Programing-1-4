import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public String check(String word) throws IOException {
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<String> sentences = new ArrayList<>();
        while ((line = br.readLine()) !=null){
            lines.add(line);
        }
        for (int i = 0; i < )
        return
    }
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<String> sentences = new ArrayList<>();
        String line;
        int firstIndex = 0;
        int lastIndex = 1;
        while ((line = br.readLine()) !=null){
            lines.add(line);
        }
        br.close();
        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i));
            lastIndex++;
            if ( lines.get(i).equals(".") && lines.get(i + 1).equals(" ")){
                String sentence = line.substring(firstIndex, lastIndex);
                sentences.add(sentence);
                firstIndex = Integer.parseInt(lines.get(i + 2));
            }
            else if (i == lines.size()-1){
                String sentence = line.substring(firstIndex, lastIndex);
                sentences.add(sentence);
            }
        }
    }
}
