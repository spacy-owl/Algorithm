import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BigInteger m = new BigInteger(bufferedReader.readLine());
        BigInteger n = new BigInteger(bufferedReader.readLine());

        System.out.println(m.add(n));
        System.out.println(m.subtract(n));
        System.out.print(m.multiply(n));
    }
}