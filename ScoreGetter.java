import java.util.Scanner;

public class ScoreGetter {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );

        int score;

        System.out.print("ENTER SCORE: ");
        score = scan.nextInt();

        if ( score <= 25 ) {
            System.out.println("F");
        } else if ( score >= 26 && score <= 45 ) {
            System.out.println("E");
        } else if ( score >= 46 && score <= 60 ) { //murag C ang 51 to 60. D ang naka butang sa papel
            System.out.println("D");
        } else if ( score >= 61 && score <= 80 ) {
            System.out.println("B");
        } else if ( score >= 81 && score <= 100 ) {
            System.out.println("A");
        }
    }
}