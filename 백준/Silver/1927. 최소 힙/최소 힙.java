import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i=0; i<N; i++) {
            int X = Integer.parseInt(br.readLine());

            if(X == 0) {
                if(pq.isEmpty()) {
                    sb.append("0").append("\n");
                } else {
                    sb.append(pq.poll()).append("\n");
                }
            } else {
             pq.add(X);
            }
        }
        System.out.print(sb);
    }
}