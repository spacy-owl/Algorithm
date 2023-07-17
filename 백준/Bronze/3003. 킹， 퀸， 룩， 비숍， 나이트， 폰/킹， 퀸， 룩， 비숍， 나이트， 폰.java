import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int[] right = {1,1,2,2,2,8};

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<right.length; i++) {
            int n = Integer.parseInt(st.nextToken());
            sb.append(right[i] - n).append(" ");
        }
        System.out.print(sb);
    }
}