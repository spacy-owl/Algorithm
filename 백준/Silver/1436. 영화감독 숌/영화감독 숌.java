import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        int result = 666;
        int count = 1;

        while (count < N) {
            result++;

            String end_num = String.valueOf(result);
            if (end_num.contains("666")) {
                count++;
            }
        }

        System.out.print(result);
    }
}