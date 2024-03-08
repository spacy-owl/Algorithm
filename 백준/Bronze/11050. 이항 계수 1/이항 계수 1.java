import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] temp = new int[K + 1];
        temp[0] = 1;

        for (int i = 1; i <= N; i++) {
            for (int j = Math.min(i, K); j > 0; j--) {
                temp[j] = temp[j] + temp[j - 1];
            }
        }
        System.out.print(temp[K]);
    }
}