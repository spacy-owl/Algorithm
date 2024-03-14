import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int min = 100;

        for (int i=0; i<7; i++) {
            int k = Integer.parseInt(br.readLine());
            if (k%2 == 1) {
                sum += k;
                if (min > k) {
                    min = k;
                }
            }
        }

        if (sum == 0) {
            bw.append("-1");
        } else {
            bw.append(String.valueOf(sum));
            bw.newLine();
            bw.append(String.valueOf(min));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}