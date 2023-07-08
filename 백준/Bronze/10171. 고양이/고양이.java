import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        bufferedWriter.write("\\    /\\");
        bufferedWriter.newLine();
        bufferedWriter.write(" )  ( ')");
        bufferedWriter.newLine();
        bufferedWriter.write("(  /  )");
        bufferedWriter.newLine();
        bufferedWriter.write(" \\(__)|");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}