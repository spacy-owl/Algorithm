import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(bufferedReader.readLine());

        for (int i=1; i<=a; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            bufferedWriter.write(String.valueOf(sum));
            if (i != a) {
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}