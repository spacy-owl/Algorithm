import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str = bufferedReader.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<str.length(); i++) {
            char w = str.charAt(i);
            if (Character.isUpperCase(w)) {
                sb.append(Character.toLowerCase(w));
            } else {
                sb.append(Character.toUpperCase(w));
            }
        }
        System.out.print(sb);
    }
}