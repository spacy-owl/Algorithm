import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            int[] num = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

            if (num[0] == 0 && num[1] ==0 && num[2]==0) {
                break;
            }
            Arrays.sort(num);

            if ((num[2] * num[2]) == (num[0]*num[0])+(num[1]*num[1])) {
                bufferedWriter.write("right");
            } else {
                bufferedWriter.write("wrong");
            }
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}