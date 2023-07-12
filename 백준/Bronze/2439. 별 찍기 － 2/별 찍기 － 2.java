import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if(j <= a-i) {
                    bufferedWriter.write(" ");
                } else {
                    bufferedWriter.write("*");
                }
            }
            if (i < a) {
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}