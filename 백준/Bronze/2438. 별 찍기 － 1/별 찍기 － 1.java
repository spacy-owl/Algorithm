import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            if (i < a) {
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}