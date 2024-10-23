public class Practice4 {
    public static void main(String[] args) {
        int []arr = {12, 3, 19, 7, 5};
        int umax = arr[0];

        for (int num : arr){
            if (num < umax){
                umax = num;
            }


        }
        System.out.print(umax+" 는 배열의 가장 작은 값입니다.");
    }
}
