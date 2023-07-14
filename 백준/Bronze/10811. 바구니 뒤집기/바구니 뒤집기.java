import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int[] n = new int[Integer.parseInt(st.nextToken())];
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n.length; i++) {
            n[i] = i+1;
        }

        for (int i =0; i<m; i++) {
            st = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
            for (int j = a; j <= b; j++) {
                int tmp = n[j];
                n[j] = n[b];
                n[b--] = tmp;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n.length;i++) {
            sb.append(n[i]).append(" ");
        }
        System.out.print(sb);
    }
}