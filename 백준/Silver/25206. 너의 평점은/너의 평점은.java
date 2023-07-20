import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String subject;
        float grade_sum = 0;
        float sum = 0;

        while ((subject = bufferedReader.readLine()) != null && !subject.isEmpty()) {
            float n = Float.parseFloat(subject.split(" ")[1]);
            String m = subject.split(" ")[2];
            float grade = 0;

            if (m.charAt(0) == 'P') {
                continue;
            }

            switch (m.charAt(0)) {
                case 'A' :
                    grade = 4;
                    break;
                case 'B' :
                    grade = 3;
                    break;
                case 'C' :
                    grade = 2;
                    break;
                case 'D' :
                    grade = 1;
                    break;
            }

            if (m.length() > 1&&m.charAt(1) == '+') {
                grade +=0.5;
            }

            grade_sum += n;
            sum += (grade * n);
        }
        System.out.print(sum/grade_sum);
    }
}