import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String[] command = bufferedReader.readLine().split(" ");

            switch (command[0]) {
                case "push":
                    int x = Integer.parseInt(command[1]);
                    queue.offer(x);
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(queue.poll()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? "1" : "0").append("\n");
                    break;
                case "front":
                    sb.append(queue.isEmpty() ? "-1" : queue.peek()).append("\n");
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        Queue<Integer> tempQueue = new LinkedList<>(queue);
                        while (tempQueue.size() > 1) {
                            tempQueue.poll();
                        }
                        sb.append(tempQueue.peek()).append("\n");
                    }
                    break;
            }
        }

        System.out.println(sb);
    }
}