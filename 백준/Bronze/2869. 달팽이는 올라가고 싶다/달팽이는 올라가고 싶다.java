import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int A = Integer.parseInt(st.nextToken());
        double B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        System.out.print((int)Math.ceil((V - B)/(A-B)));
    }
}