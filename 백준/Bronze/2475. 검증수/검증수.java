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

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        bufferedReader.close();
        int result = 0;

        for (int i=0; i<5; i++) {
            int m = Integer.parseInt(st.nextToken());
            result += (m*m);
        }
        bufferedWriter.write(String.valueOf(result%10));
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}