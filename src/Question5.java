public class Question5 {
    public static void main(String[] args) {
        int[] numbers = {3,7,2,9,4};

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }System.out.println("가장 큰 값은: "+min);
    }
}