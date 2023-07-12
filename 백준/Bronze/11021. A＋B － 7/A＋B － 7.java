import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i=1; i<=a; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            sb.append("Case #").append(i).append(": ").append(sum);
            if (i != a) {
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}