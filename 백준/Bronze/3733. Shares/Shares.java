import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String num;

        while ((num = bufferedReader.readLine()) != null && !num.isEmpty()) {
            int n = Integer.parseInt(num.split(" ")[0]);
            long m = Long.parseLong(num.split(" ")[1]);

            bufferedWriter.write(String.valueOf(m/(n+1)));
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}