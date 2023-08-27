import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            String input = bufferedReader.readLine();
            if (input.equals("0")) {
                break;
            }

            int length = input.length();

            int totalWidth = 0;
            for (char c : input.toCharArray()) {
                if (c == '1') {
                    totalWidth += 2;
                } else if (c == '0') {
                    totalWidth += 4;
                } else {
                    totalWidth += 3;
                }
            }

            totalWidth += length - 1;
            totalWidth += 2;

            sb.append(totalWidth).append("\n");
        }
        System.out.print(sb);
    }
}