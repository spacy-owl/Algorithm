import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        int count = 0;
        int m = 1;
        int plus = 6;

        while (true) {
            count++;
            if (n <= m) {
                break;
            }
            m += plus;
            plus += 6;
        }
        System.out.print(count);
    }
}