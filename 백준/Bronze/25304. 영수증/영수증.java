import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        long total = Long.parseLong(bufferedReader.readLine());
        int ea = Integer.parseInt(bufferedReader.readLine());
        long sum = 0;

        for (int i = 1; i <= ea; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
            if(sum > total) {
                sum = -1;
                break;
            }
        }
        
        if (sum == total) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}