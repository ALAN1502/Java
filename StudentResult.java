import java.util.Scanner;

interface Student {
    void getAcademicScore(int score);
}

interface Sports {
    void getSportsScore(int score);
}

class Result implements Student, Sports {
    int academicScore;
    int sportsScore;

    public void getAcademicScore(int score) {
        academicScore = score;
    }

    public void getSportsScore(int score) {
        sportsScore = score;
    }

    void display() {
        System.out.println("Academic Score: " + academicScore);
        System.out.println("Sports Score  : " + sportsScore);
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result r = new Result();

        System.out.print("Enter Academic Score: ");
        int a = sc.nextInt();

        System.out.print("Enter Sports Score: ");
        int s = sc.nextInt();

        r.getAcademicScore(a);
        r.getSportsScore(s);

        System.out.println("\nStudent Result");
        r.display();

        sc.close();
    }
}