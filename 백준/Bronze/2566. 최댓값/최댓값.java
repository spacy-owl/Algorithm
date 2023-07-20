import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int max = -1;
        int maxRow = -1;
        int maxCol = -1;

        for (int i = 0; i < 9; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(input[j]);
                if (num > max) {
                    max = num;
                    maxRow = i +1;
                    maxCol = j + 1;
                }
            }
        }
        bufferedReader.close();

        System.out.println(max);
        System.out.print(maxRow +" "+maxCol);
    }
}