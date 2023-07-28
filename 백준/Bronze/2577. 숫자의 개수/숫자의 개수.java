import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10];
        String num = String.valueOf(Integer.parseInt(bufferedReader.readLine())*Integer.parseInt(bufferedReader.readLine())*Integer.parseInt(bufferedReader.readLine()));
        bufferedReader.close();

        for (int i=0; i<num.length(); i++) {
            arr[num.charAt(i) - '0']++;
        }
        for (int i = 0; i<10; i++) {
            bufferedWriter.write(String.valueOf(arr[i]));
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}