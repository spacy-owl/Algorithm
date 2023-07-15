import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String word = bufferedReader.readLine();
        int[] first = new int[26];

        Arrays.fill(first,-1);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            int num = word.charAt(i) - 97;
            if (first[num] == -1) {
                first[num] = i;
            }
        }

        for (int i:first) {
            sb.append(i).append(" ");
        }

        System.out.print(sb);
    }
}