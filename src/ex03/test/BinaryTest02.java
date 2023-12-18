package ex03.test;

public class BinaryTest02 { // 시간 복잡도 O(logN)
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // 9(0~8) / 2 = 4

        int N = arr.length;

        int targetNumber = 6;
        int start = 0;
        int end = N - 1;
        int mid = (end - start) / 2;
/*
        if (targetNumber == arr[mid]) {
            System.out.println(targetNumber + "가 위치하는 자리의 index 값은 " + mid + "입니다.");
        }

        if (targetNumber > arr[mid]) {
            start = mid + 1;
            mid = (end - start) / 2;
            if (targetNumber == arr[mid]) {
                System.out.println(targetNumber + "가 위치하는 자리의 index 값은 " + mid + "입니다.");
            }
        }

        if (targetNumber < arr[mid]) {
            end = mid - 1;
            mid = (end - start) / 2;
            if (targetNumber == arr[mid]) {
                System.out.println(targetNumber + "가 위치하는 자리의 index 값은 " + mid + "입니다.");
            }
        }

 */

        while (true) {
            if (targetNumber == arr[mid]) {
                System.out.println(targetNumber + "값은 " + mid + "번지에 있습니다");
                break;
            }
            if (targetNumber > arr[mid]) {
                start = mid + 1;
                mid = (end + start) / 2;  // 5 6 7 8 // (8+5)/2 = 6
            }
            if (targetNumber < arr[mid]) {
                end = mid - 1;
                mid = (end - start) / 2; // 0 1 2 3 // (3-0)/2 = 1
            }
        }


    }
}
