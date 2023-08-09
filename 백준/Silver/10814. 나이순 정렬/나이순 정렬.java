import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine());

        String[] user = new String[T];
        for (int i=0; i<T; i++){
            user[i] = bufferedReader.readLine();
        }

        Arrays.sort(user,(a,b)->{
            return Integer.compare(Integer.parseInt(a.toString().split(" ")[0]),Integer.parseInt(b.toString().split(" ")[0]));
        });

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<T; i++){
            sb.append(user[i]).append("\n");
        }

        System.out.print(sb);
    }
}