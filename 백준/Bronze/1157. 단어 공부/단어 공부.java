import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        int[] alpha = new int[26];
        int ch = System.in.read();

        while (ch > 64 ) {
            if (ch < 91) {
                alpha[ch - 65]++;
            } else {
                alpha[ch - 97]++;
            }
            ch = System.in.read();
        }

        int max = -1;
        int print = 0;

        for (int i = 0; i < 26; i++) {

            if (alpha[i] > max) {
                max = alpha[i];
                print = i;
            } else if (alpha[i] == max) {
                print = -2;
            }
        }
        System.out.print((char) (print+65));
    }
}