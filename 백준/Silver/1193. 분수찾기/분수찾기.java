import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        int N = read();
        int cross = 1, prev_sum = 0;

        while (true) {
            if (N <= prev_sum + cross) {
                if (cross % 2 == 1) {
                    System.out.print((cross - (N - prev_sum - 1)) + "/" + (N - prev_sum));
                    break;
                } else {
                    System.out.print((N - prev_sum) + "/" + (cross - (N - prev_sum - 1)));
                    break;
                }
            }
             else{
                prev_sum += cross;
                cross++;
                }
            }
        }
    static int read() throws IOException{
        int c,n = System.in.read() & 15;
        while ((c=System.in.read()) > 47 && c < 58) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
}