import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int count = 0;

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        for (int i=0; i<n; i++) {
            int m = Integer.parseInt(st.nextToken());
            boolean check = true;

            if (m==1) {
                continue;
            }

            for (int j=2; j<=Math.sqrt(m); j++) {
                if (m%j == 0 ) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
            }
        }
        System.out.print(count);
    }
}