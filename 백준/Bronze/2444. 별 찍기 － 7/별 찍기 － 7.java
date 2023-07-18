import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        for (int i = 0; i<n-1; i++) {
            for (int j = i; j< n-1;j++) {
                bufferedWriter.write(" ");
            }
            for (int j=0; j<2*i+1; j++) {
                bufferedWriter.write("*");
            }
            bufferedWriter.newLine();
        }

        for (int i=0; i<n; i++) {
            for (int j = 0; j < i; j++) {
                bufferedWriter.write(" ");
            }
            for (int j = i; j < 2 * n - i - 1; j++) {
                bufferedWriter.write("*");
            }
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}