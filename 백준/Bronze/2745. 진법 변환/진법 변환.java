import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        String str = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        long sum = 0;
        int len = str.length();

        for (int i=1; i<=len; i++) {
            int num = 0;
            if (str.charAt(len-i) < 65) {
                 num = str.charAt(len-i) - '0';
            } else {
                 num = str.charAt(len-i) - 55;
            }
            sum += num * square(n,i);
        }
        System.out.print(sum);
    }

    public static long square(int n,int i) {
        int result = 1;
        i = i-1;
        if (i == 0 ) {
            return 1;
        }

        for (int j = 0; j<i; j++) {
            result *= n;
        }
        return result;
    }
}