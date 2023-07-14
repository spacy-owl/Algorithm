import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            String word = bufferedReader.readLine();
            sb.append(word.charAt(0)).append(word.charAt(word.length()-1)).append("\n");
        }
        System.out.print(sb);
    }
}