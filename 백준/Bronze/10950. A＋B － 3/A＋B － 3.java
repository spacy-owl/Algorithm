import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= a; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            int sum = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
            result.append(sum);
            if(i != a) {
                result.append("\n");
            }
        }
        System.out.print(result);
    }
}