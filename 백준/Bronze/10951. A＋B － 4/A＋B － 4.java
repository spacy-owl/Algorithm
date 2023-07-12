import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String num;

        while ((num = bufferedReader.readLine()) != null && !num.isEmpty()) {
            int a = num.charAt(0) - '0';
            int b = num.charAt(2) - '0';

            bufferedWriter.write(String.valueOf(a + b));
            bufferedWriter.newLine();
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}