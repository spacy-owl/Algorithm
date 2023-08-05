import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        int[] countArray = new int[10001]; // 입력값 범위 (0 ~ 10000)

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(bufferedReader.readLine());
            countArray[num]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10000; i++) {
            for (int j = 0; j < countArray[i]; j++) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}