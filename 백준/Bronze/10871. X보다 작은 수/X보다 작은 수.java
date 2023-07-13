import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        String[] num = bufferedReader.readLine().split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i=0; i < n; i++) {
            if(Integer.parseInt(num[i])<x) {
                sb.append(num[i]).append(" ");
            }
        }
        System.out.print(sb);
    }
}