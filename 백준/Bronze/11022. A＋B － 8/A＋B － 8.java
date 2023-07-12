import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= a; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            sb.append("Case #").append(i).append(": ")
                    .append(first).append(" + ").append(second)
                    .append(" = ").append(first + second);
            if (i != a) {
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}