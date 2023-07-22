import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int num = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            int remainder = num % n;
            char ch;
            if (remainder < 10) {
                ch = (char) ('0' + remainder);
            } else {
                ch = (char) ('A' + remainder - 10);
            }
            sb.append(ch);
            num /= n;
        }

        System.out.print(sb.reverse());
    }
}