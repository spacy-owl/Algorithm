import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(bufferedReader.readLine());

        int h = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());

        if (m < 45) {
            m += 15;
            h--;
            if (h < 0) {
                h = 23;
            }
            System.out.print(h + " " +m);
        } else {
            System.out.print(h + " " + (m - 45));
        }
    }
}