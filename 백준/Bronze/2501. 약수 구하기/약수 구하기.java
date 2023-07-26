import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int i = 1;
        bufferedReader.close();

        while (true) {
            if (i>n) {
                i=0;
                break;
            }
            if (n%i==0) {
                k--;
            }
            if (k==0) {
                break;
            }
            i++;
        }
        System.out.print(i);
    }
}