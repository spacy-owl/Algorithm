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

        int result = facto(N)/(facto(K)*facto(N-K));
        System.out.print(result);
    }

    static int facto(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return facto(n-1) * n;
        }
    }
}