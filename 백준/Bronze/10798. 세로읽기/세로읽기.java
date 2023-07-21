import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        char[][] result = new char[5][15];
        int max_len = 0;

        for (int i=0; i < 5; i++) {
            char[] ch = bufferedReader.readLine().toCharArray();

            if (max_len < ch.length) {
                max_len = ch.length;
            }

            for (int j=0; j< ch.length; j++) {
                result[i][j] = ch[j];
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<max_len; i++) {
            for (int j=0; j<5; j++) {
                if (result[j][i] == '\u0000') {
                    continue;
                }
                sb.append(result[j][i]);
            }
        }
        System.out.print(sb);
    }
}