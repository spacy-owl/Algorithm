import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        boolean[] n = new boolean[31];
        for (int i=1; i <= 28; i++) {
            int a = Integer.parseInt(bufferedReader.readLine());
            n[a] = true;
        }

        for (int i =1; i < n.length; i++) {
            if(!n[i]) {
                System.out.println(i);
            }
        }
    }
}