import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BigInteger factorial = BigInteger.ONE;
        int N = Integer.parseInt(bufferedReader.readLine());
        int result = 0;

        for (int i = 1; i <= N; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        String factrial_result = factorial.toString();

        for (int i=factrial_result.length(); i>0; i--) {
            if (factrial_result.charAt(i - 1) == '0') {
                result++;
            } else {
                break;
            }
        }

        System.out.print(result);
    }
}