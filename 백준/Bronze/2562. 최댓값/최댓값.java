import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int count = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            int a = Integer.parseInt(bufferedReader.readLine());
            count++;
            if(max < a) {
                max = a;
                index = count;
            }
        }
        System.out.println(max);
        System.out.print(index);
    }
}