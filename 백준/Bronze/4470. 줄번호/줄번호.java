import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i=1; i<=N; i++) {
            sb.append(i).append(". ").append(bufferedReader.readLine()).append("\n");
        }
        System.out.print(sb);
    }
}