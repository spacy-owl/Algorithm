import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            int H = Integer.parseInt(st.nextToken());
            st.nextToken();
            int N = Integer.parseInt(st.nextToken());

            int floor = (N - 1) % H + 1;
            int room = (N - 1) / H + 1;

            sb.append(floor);

            if (room < 10) {
                sb.append("0");
            }
            sb.append(room).append("\n");
        }
        bufferedReader.close();
        System.out.print(sb);
    }
}