import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] temp;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        temp = new int[N + 1][K + 1];

        System.out.print(Calculate(N,K));
    }
    static int Calculate(int n, int k) {
        if (temp[n][k] > 0) {
            return temp[n][k];
        }

        if (k == 0 || n == k) {
            return temp[n][k] = 1;
        }

        return temp[n][k] = Calculate(n - 1, k - 1) + Calculate(n - 1, k);
    }
}