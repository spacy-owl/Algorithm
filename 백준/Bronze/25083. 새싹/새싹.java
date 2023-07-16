import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        bufferedWriter.write("         ,r'\"7");
        bufferedWriter.newLine();
        bufferedWriter.write("r`-_   ,'  ,/");
        bufferedWriter.newLine();
        bufferedWriter.write(" \\. \". L_r'");
        bufferedWriter.newLine();
        bufferedWriter.write("   `~\\/ ");
        bufferedWriter.newLine();
        bufferedWriter.write("      |");
        bufferedWriter.newLine();
        bufferedWriter.write("      |");

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}