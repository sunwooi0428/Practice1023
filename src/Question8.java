import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        Scanner scanner = new Scanner(System.in);

        System.out.print("검색할 값: ");
        int Value = scanner.nextInt();

        boolean found = false;
        for (int num : numbers) {
            if (num == Value) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("존재합니다.");
        } else {
            System.out.println("존재하지 않습니다.");
        }
    }
}