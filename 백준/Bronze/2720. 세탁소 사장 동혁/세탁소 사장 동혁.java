import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int[] coins = { 25, 10, 5 };

        for (int i = 0; i < n; i++) {
            int money = Integer.parseInt(bufferedReader.readLine());
            StringBuilder sb = new StringBuilder();

            for (int coin : coins) {
                int count = money / coin;
                money %= coin;
                sb.append(count).append(" ");
            }

            System.out.print(sb.append(money).append("\n"));
        }
    }
}