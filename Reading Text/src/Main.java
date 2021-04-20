import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static Object check(String word, ArrayList<String> arrayList, ArrayList<Integer> certainLine){
        for (int i = 0; i < arrayList.size(); i++){
            if (arrayList.get(i).contains(word)){
                certainLine.add(i);
            }
        }
        for (int i = 0; i < certainLine.size(); i++){
            return certainLine.get(i);
        }
        return null;
    }
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<String> sentences = new ArrayList<>();
        ArrayList<Integer> certainLine = new ArrayList<>();
        String sentence = " ";
        String line;
        while ((line = br.readLine()) !=null){
            lines.add(line);
        }
        br.close();
        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i));

        }
        System.out.println("*********************************************");
        System.out.println("\n");
        System.out.println(check("the", lines, certainLine))
        System.out.println("\n");
        System.out.println("*********************************************");

    }
}
