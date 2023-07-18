import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        bufferedWriter.write("  ___  ___  ___");
        bufferedWriter.newLine();
        bufferedWriter.write("  | |__| |__| |");
        bufferedWriter.newLine();
        bufferedWriter.write("  |           |");
        bufferedWriter.newLine();
        bufferedWriter.write("   \\_________/");
        bufferedWriter.newLine();
        bufferedWriter.write("    \\_______/");
        bufferedWriter.newLine();
        bufferedWriter.write("     |     |");
        bufferedWriter.newLine();
        bufferedWriter.write("     |     |");
        bufferedWriter.newLine();
        bufferedWriter.write("     |     |");
        bufferedWriter.newLine();
        bufferedWriter.write("     |     |");
        bufferedWriter.newLine();
        bufferedWriter.write("     |_____|");
        bufferedWriter.newLine();
        bufferedWriter.write("  __/       \\__");
        bufferedWriter.newLine();
        bufferedWriter.write(" /             \\");
        bufferedWriter.newLine();
        bufferedWriter.write("/_______________\\");

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}