import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(bufferedReader.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if (A == 0 && B == 0) {
                break;
            }

            if (A%B == 0){
                bufferedWriter.write("multiple");
            } else if (B%A==0) {
                bufferedWriter.write("factor");
            } else {
                bufferedWriter.write("neither");
            }
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}