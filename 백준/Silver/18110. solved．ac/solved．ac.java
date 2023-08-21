import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        Arrays.sort(arr);

        int trim = Math.round(0.15f*N);

        float sum = 0;

        for (int i=trim; i<N-trim; i++) {
            sum += arr[i];
        }


        System.out.print(Math.round(sum/(N-(trim*2))));
    }
}