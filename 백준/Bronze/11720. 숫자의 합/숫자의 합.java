import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        String num = bufferedReader.readLine();
        int sum = 0;

        for (int i=0; i<n; i++) {
            sum += num.charAt(i) - '0';
        }
        System.out.print(sum);
    }
}