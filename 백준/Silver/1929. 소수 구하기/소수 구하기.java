import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();


        for (int i=M; i<=N; i++) {
            boolean check = true;

            if (i==1) {
                continue;
            }

            for (int j=2; j<=Math.sqrt(i); j++) {
                if (i%j == 0 ) {
                    check = false;
                    break;
                }
            }
            if (check) {
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
    }
}