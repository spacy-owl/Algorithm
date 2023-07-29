import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] num = bufferedReader.readLine().split(" ");
        int pre = Integer.parseInt(num[0]);
        String result = "";

        boolean desc = pre > Integer.parseInt(num[1]);

        for (int i=1; i<8; i++) {
            int curr = Integer.parseInt(num[i]);

            if (desc && pre < curr || !desc && pre > curr) {
                result = "mixed";
                break;
            }

            pre = curr;
        }

        if (result.isEmpty()) {
            result = desc ? "descending": "ascending";
        }

        System.out.print(result);
    }
}