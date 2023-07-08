import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        bufferedWriter.write("|\\_/|");
        bufferedWriter.newLine();
        bufferedWriter.write("|q p|   /}");
        bufferedWriter.newLine();
        bufferedWriter.write("( 0 )\"\"\"\\");
        bufferedWriter.newLine();
        bufferedWriter.write("|\"^\"`    |");
        bufferedWriter.newLine();
        bufferedWriter.write("||_/=\\\\__|");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}