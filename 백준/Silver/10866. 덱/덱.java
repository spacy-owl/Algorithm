import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String[] command = bufferedReader.readLine().split(" ");

            switch (command[0]) {
                case "push_front":
                    int x = Integer.parseInt(command[1]);
                    deque.offerFirst(x);
                    break;
                case "push_back":
                    int y = Integer.parseInt(command[1]);
                    deque.offerLast(y);
                    break;
                case "pop_front":
                    sb.append(deque.isEmpty() ? "-1" : deque.pollFirst()).append("\n");
                    break;
                case "pop_back":
                    sb.append(deque.isEmpty() ? "-1" : deque.pollLast()).append("\n");
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    sb.append(deque.isEmpty()?"1":"0").append("\n");
                    break;
                case "front":
                    if (deque.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(deque.getFirst()).append("\n");
                    }
                    break;
                case "back":
                    if (deque.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(deque.getLast()).append("\n");
                    }
                    break;
            }
        }

        System.out.print(sb);
    }
}