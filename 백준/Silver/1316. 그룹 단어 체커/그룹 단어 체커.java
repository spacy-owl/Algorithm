import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int count = 0;

        for (int i=0; i<n; i++) {
            String str = bufferedReader.readLine();

            if (check(str)) {
                count++;
            }
        }
        System.out.print(count);
    }

    private static boolean check(String str) {
        boolean[] ch = new boolean[26];
        int len = str.length();
        int pre = 0;

        for (int i= 0; i<len; i++) {
            int now = str.charAt(i);

            if (pre != now) {
                if (!ch[now -'a']) {
                    ch[now -'a'] = true;
                    pre = now;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}