import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int arr[] = new int[N];
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        for (int i=0; i<N;i++) {
            arr[i] =Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(bufferedReader.readLine());
        st = new StringTokenizer(bufferedReader.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<M;i++) {
            if (Arrays.binarySearch(arr,Integer.parseInt(st.nextToken()))>=0) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.print(sb);
    }
}