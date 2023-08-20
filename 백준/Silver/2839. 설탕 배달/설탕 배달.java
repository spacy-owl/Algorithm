import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        int max5 = N/5;


        while (max5 >= 0) {
            int remainingWeight = N - (max5 * 5);
            if (remainingWeight % 3 == 0) {
                int max3 = remainingWeight / 3;
                System.out.print(max5+max3);
                break;
            }
            max5--;
        }

        if (max5 < 0) {
            System.out.print(-1);
        }

    }
}