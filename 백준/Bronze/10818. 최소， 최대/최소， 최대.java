import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int max = -1000001;
        int min = 1000001;
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(max < a) {
                max = a;
            }

            if(min > a) {
                min = a;
            }
        }
        System.out.print(min+" "+max);
    }
}