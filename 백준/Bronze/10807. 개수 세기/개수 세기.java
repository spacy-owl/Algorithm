import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bufferedReader.readLine());
        String[] arr = bufferedReader.readLine().split(" ");
        String v = bufferedReader.readLine();
        int count = 0;

        for (int i = 0; i < num; i++) {
            if (arr[i].equals(v)) {
                count++;
            }
        }
        System.out.print(count);
    }
}