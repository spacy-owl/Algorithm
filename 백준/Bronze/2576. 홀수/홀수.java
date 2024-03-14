import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        int sum = 0;
        int min = 100;

        for (int i=0; i<7; i++) {
            int k = read();
            if (k%2 != 0) {
                sum += k;
                min = Math.min(min,k);
            }
        }
        System.out.print(min == 100? "-1" : sum + "\n" + min);
    }
    static int read() throws IOException{
        int c,n = System.in.read() & 15;
        while ((c=System.in.read()) > 47 && c < 58) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
}