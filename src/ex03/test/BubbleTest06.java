package ex03.test;

public class BubbleTest06 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};

        final int N = arr.length; // 상수

        int temp;

        for (int loop = 0; loop < N-1; loop++) {
            for (int i = 0; i < N-loop-1; i++) {
                if (arr[i] > arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        // 출력코드
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
