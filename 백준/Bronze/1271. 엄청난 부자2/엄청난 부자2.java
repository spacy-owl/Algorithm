import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        BigInteger m = new BigInteger(st.nextToken());
        BigInteger n = new BigInteger(st.nextToken());

        System.out.println(m.divide(n));
        System.out.print(m.remainder(n));
    }
}