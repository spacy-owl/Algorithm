import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = read();

        for (int i=0; i<N; i++) {

            int X = read();
            int sum = X + reverse(X);

            if (sum == reverse(sum)) {
                bw.append("YES").append("\n");
            } else {
                bw.append("NO").append("\n");
            }
        }


        bw.flush();
        bw.close();
    }
    static int read() throws IOException{
        int c,n = System.in.read() & 15;
        while ((c=System.in.read()) > 47 && c < 58) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    static int reverse(int n) {
        int a = 0;
        while (n != 0) {
            int digit = n % 10;
            a = (a << 3) + (a << 1) + digit;
            n /= 10;
        }
        return a;
    }
}