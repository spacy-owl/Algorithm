import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int factor = A;
        int multiple = B;

        while (multiple != 0) {
            int temp = multiple;
            multiple = factor % multiple;
            factor = temp;
        }

        multiple = (A * B)/factor;

        System.out.println(factor);
        System.out.print(multiple);
    }
}