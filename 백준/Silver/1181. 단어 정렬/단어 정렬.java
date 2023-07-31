import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bufferedReader.readLine());
        HashSet<String> uniqueStrings = new HashSet<>();

        for (int i=0; i<T; i++) {
            uniqueStrings.add(bufferedReader.readLine());
        }
        bufferedReader.close();

        String[] result = uniqueStrings.toArray(new String[uniqueStrings.size()]);


        Arrays.sort(result,(a,b)->{
            int length = Integer.compare(a.length(),b.length());
            if (length != 0) {
                return length;
            }
            return a.compareTo(b);
        });

        for (String str : result) {
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}