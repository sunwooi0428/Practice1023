import java.util.HashSet;
import java.util.Set;

public class Question11 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> uniqueValues = new HashSet<>();

        for (int num : numbers) {
            uniqueValues.add(num);
        }

        System.out.print("중복 제거된 배열: ");
        for (int num : uniqueValues) {
            System.out.print(num + " ");
        }
    }
}