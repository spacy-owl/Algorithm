import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str = bufferedReader.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<str.length(); i++) {
            int n = str.charAt(i);
            if (n < 91) {
                n += 32;
            } else {
                n -= 32;
            }
            sb.append((char)n);
        }
        System.out.print(sb);
    }
}