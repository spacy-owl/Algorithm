import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());

        StringBuilder mt = new StringBuilder();

        for (int i = 1; i <= 9; i++) {
            mt.append(a).append(" * ").append(i).append(" = ").append(a*i).append("\n");
        }
        System.out.print(mt);
    }
}