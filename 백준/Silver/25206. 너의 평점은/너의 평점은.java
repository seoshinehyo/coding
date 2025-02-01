import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0.0;
        double totalNum = 0.0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double num = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if (grade.equals("A+")) {
                sum += num * 4.5;
                totalNum += num;
            } else if (grade.equals("A0")) {
                sum += num * 4.0;
                totalNum += num;
            } else if (grade.equals("B+")) {
                sum += num * 3.5;
                totalNum += num;
            } else if (grade.equals("B0")) {
                sum += num * 3.0;
                totalNum += num;
            } else if (grade.equals("C+")) {
                sum += num * 2.5;
                totalNum += num;
            } else if (grade.equals("C0")) {
                sum += num * 2.0;
                totalNum += num;
            } else if (grade.equals("D+")) {
                sum += num * 1.5;
                totalNum += num;
            } else if (grade.equals("D0")) {
                sum += num * 1.0;
                totalNum += num;
            } else if (grade.equals("F")) {
                totalNum += num;
            } else {
                continue;
            }
        }
        System.out.print(sum / totalNum);
    }
}