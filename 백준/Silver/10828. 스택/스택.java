import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String[] command = bufferedReader.readLine().split(" ");

            switch (command[0]) {
                case "push":
                    int x = Integer.parseInt(command[1]);
                    stack.push(x);
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(stack.pop()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    sb.append(stack.isEmpty() ? "1" : "0").append("\n");
                    break;
                case "top":
                    sb.append(stack.isEmpty() ? "-1" : stack.peek()).append("\n");
                    break;
            }
        }

        System.out.print(sb);
    }
}