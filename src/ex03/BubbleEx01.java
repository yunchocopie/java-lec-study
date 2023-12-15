package ex03;

/**
 * 5, 8, 2, 4, 3 (N=5)
 * 회전수 : N-1
 * 1회전 비교 횟수 : N-1
 * 2회전 비교 횟수 : N-1
 * 3회전 비교 횟수 : N-1
 * 4회전 비교 횟수 : N-1
 */

public class BubbleEx01 {

    // 매서드
    // static으로 메모리에 띄우기
    static void bubble(int[] arr){
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
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        // 클래스 명으로 bubble 매서드 호출
        //BubbleEx01.bubble(arr); // 같은 클래스 안에 있으면 생략 가능
        bubble(arr);

        System.out.println();

        int[] arr2 = {7, 3, 9, 10, 6, 5, 11};
        bubble(arr2);
    }
}
