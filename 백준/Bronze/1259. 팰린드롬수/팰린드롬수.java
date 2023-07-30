import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            StringBuilder sb = new StringBuilder();
            int num = Integer.parseInt(bufferedReader.readLine());
            if (num == 0) {
                break;
            }
            sb.append(num);
            if (sb.toString().equals(sb.reverse().toString())) {
                bufferedWriter.write("yes");
            } else {
                bufferedWriter.write("no");
            }
            sb.setLength(0);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}