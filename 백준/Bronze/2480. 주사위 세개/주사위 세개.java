import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(bufferedReader.readLine());

        int a = Integer.parseInt(str.nextToken());
        int b = Integer.parseInt(str.nextToken());
        int c = Integer.parseInt(str.nextToken());

        if (a != b && b != c && a != c) {
            System.out.print(Math.max(a, Math.max(b, c)) * 100);
        } else if (a == b && b == c) {
            System.out.print(10000 + a * 1000);
        } else if (a == b || a == c) {
            System.out.print(1000 + a * 100);
        } else {
            System.out.print(1000 + b * 100);
        }
    }
}