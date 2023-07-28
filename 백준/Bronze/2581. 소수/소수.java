import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());
        int m = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        boolean[] isPrime = new boolean[m + 1];

        isPrime[0] = true;
        isPrime[1] = true;

        for (int i = 2; i * i <= m; i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j <= m; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = n; i <= m; i++) {
            if (!isPrime[i]) {
                sum += i;
                if (min > i) {
                    min = i;
                }
            }
        }
        if (sum == 0) {
            bufferedWriter.write("-1");
        } else {
            bufferedWriter.write(String.valueOf(sum));
            bufferedWriter.newLine();
            bufferedWriter.write(String.valueOf(min));
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}