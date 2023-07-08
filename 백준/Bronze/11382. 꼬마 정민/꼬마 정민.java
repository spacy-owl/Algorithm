import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(bufferedReader.readLine());

        long a = Long.parseLong(str.nextToken());
        long b = Long.parseLong(str.nextToken());
        long c = Long.parseLong(str.nextToken());

        System.out.print(a+b+c);
    }
}