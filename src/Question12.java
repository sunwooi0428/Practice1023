import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25, 30};
        Scanner scanner = new Scanner(System.in);

        System.out.print("찾을 값: ");
        int searchValue = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchValue) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("해당 값의 인덱스: " + index);
        } else {
            System.out.println("해당 값이 배열에 존재하지 않습니다.");
        }
    }
}