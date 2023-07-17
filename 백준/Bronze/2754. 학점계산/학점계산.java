import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str = bufferedReader.readLine();
        float grade = 0;

        switch (str.charAt(0)) {
            case 'A':
                grade = 4;
                break;
            case 'B':
                grade = 3;
                break;
            case 'C':
                grade = 2;
                break;
            case 'D':
                grade = 1;
                break;
        }

        if (str.length() != 1) {
            switch (str.charAt(1)) {
                case '+':
                    grade+=0.3;
                    break;
                case '-':
                    grade-=0.3;
                    break;
            }
        }
        System.out.print(grade);
    }
}