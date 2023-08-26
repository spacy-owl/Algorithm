import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int S = 0;
        int T = 0;

        for (int i=0; i<2; i++) {
            String[] score = bufferedReader.readLine().split(" ");
            for (int j=0; j<4; j++) {
                if (i == 0) {
                    S += Integer.parseInt(score[j]);
                } else {
                    T += Integer.parseInt(score[j]);
                }
            }
        }

        System.out.print(S < T ? T : S);
    }
}