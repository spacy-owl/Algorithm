import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(bufferedReader.readLine(), " ");

        double a = Integer.parseInt(str.nextToken());
        double b = Integer.parseInt(str.nextToken());

        System.out.print(a/b);
    }
}