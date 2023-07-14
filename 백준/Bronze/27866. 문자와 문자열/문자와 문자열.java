import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String word = bufferedReader.readLine();
        int n = Integer.parseInt(bufferedReader.readLine());

        System.out.print(word.charAt(n-1));
    }
}