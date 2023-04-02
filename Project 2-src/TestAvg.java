import java.util.Scanner;

public class TestAvg {

    public static double calcAverage(int score1, int score2, int score3, int score4, int score5) {
        double average = (double)(score1 + score2 + score3 + score4 + score5) / 5.0;
        return average;
    }
    public static String determineGrade(int score) {
        String letter_grade = "";
        if (score >= 90 && score <= 100) {
            letter_grade = "A";
        }
        else if (score >= 80 && score <= 89) {
            letter_grade = "B";
        }
        else if (score >= 70 && score <= 79) {
            letter_grade = "C";
        }
        else if (score >= 60 && score <= 69) {
            letter_grade = "D";
        }
        else {
            letter_grade = "F";
        }
        return letter_grade;
    }
    //To find the avg
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scores[] = new int[5];
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter score " +i+ ": ");
            scores[i-1] = sc.nextInt();
            System.out.println("Letter Grade: " + determineGrade(scores[i-1]));
        }
        double average = calcAverage(scores[0], scores[1], scores[2], scores[3], scores[4]);
        System.out.println("Test Average: " +average);
    }
}