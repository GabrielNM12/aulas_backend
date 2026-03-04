import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o GradeBook: ");
        String courseNameString = scanner.nextLine();
        scanner.close();
        
        GradeBook.DisplayMessage(courseNameString);
    }
}
