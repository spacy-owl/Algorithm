import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer str = new StringTokenizer(bufferedReader.readLine(), " ");

        double a = Double.parseDouble(str.nextToken());
        double b = Double.parseDouble(str.nextToken());

        bufferedWriter.write(Double.toString(a/b));
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}