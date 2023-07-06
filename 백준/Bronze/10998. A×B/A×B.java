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

        int a = Integer.parseInt(str.nextToken());
        int b = Integer.parseInt(str.nextToken());

        bufferedWriter.write(Integer.toString(a*b));
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}