import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder(bufferedReader.readLine());

        if (sb.toString().equals(sb.reverse().toString())) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}