import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        for (int i = 0; i<5; i++) {
            sum += Integer.parseInt(bufferedReader.readLine());
        }

        System.out.print(sum);
    }
}