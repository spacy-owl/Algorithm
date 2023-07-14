import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int max = 0;
        float sum = 0;

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
           int a = Integer.parseInt(st.nextToken());
           sum += a;
            if (max < a) {
                max = a;
            }
        }

        System.out.print(sum/n/max*100);
    }
}