import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i =0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            int j = Integer.parseInt(st.nextToken());
            String word = st.nextToken();
            for (int k =0; k<word.length();k++) {
                for (int l = 0; l<j; l++) {
                    sb.append(word.charAt(k));
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}