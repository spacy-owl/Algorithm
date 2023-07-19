import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(bufferedReader.readLine(), " ");

        int a = Integer.parseInt(str.nextToken());
        int b = Integer.parseInt(str.nextToken());

        System.out.print(a+" + "+b+" = "+(a+b));
    }
}