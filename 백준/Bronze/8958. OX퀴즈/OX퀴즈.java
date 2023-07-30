import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(bufferedReader.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<T; i++) {
            String ox = bufferedReader.readLine();
            int count = 0;
            int sum = 0;
            for (int j = 0; j< ox.length(); j++) {
                if (ox.charAt(j) == 'O') {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}