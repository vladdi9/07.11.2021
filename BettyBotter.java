package date;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.SortedSet;
import java.util.TreeSet;

public class BettyBotter {
    public static void main(String[] args) throws IOException {
        SortedSet<String> set = new TreeSet<>();
       StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader("src/date/bettybotter.txt"));
        String line = br.readLine();
        //System.out.println(line);
        while (line != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
            line= br.readLine();
        }
        //System.out.println(sb);
        String content = sb.toString().replaceAll("[^A-Za-z0-9]", " ");
        String[]arr=content.split(" ");
        for (String s:arr){
            if (s.length()!=0 && ((s.charAt(0)=='b') || (s.charAt(0)=='B')))
            set.add(s);
        }
        System.out.println(set.toString());
    }
}
