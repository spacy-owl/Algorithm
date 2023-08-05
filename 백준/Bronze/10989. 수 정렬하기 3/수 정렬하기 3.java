import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        int[] result = new int[N];

        for (int i=0; i<N; i++) {
            result[i] = Integer.parseInt(bufferedReader.readLine());
        }

        Arrays.sort(result);

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<N; i++) {
            sb.append(result[i]).append("\n");
        }
        System.out.println(sb);
    }
}