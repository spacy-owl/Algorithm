import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        int sum = 1;

        for (int i=0; i<n; i++) {
            sum *= 2;
        }
        System.out.print((sum+1)*(sum+1));
    }
}