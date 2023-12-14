package ex03;

public class ArrayEx01 {
    public static void main(String[] args) {
        int[] arr = new int[3]; //시작 번지 주소만 알면 됨

        arr [0] = 1;
        arr [1] = 1;
        arr [2] = 1;

        for (int i = 0; i <3; i++) {
            System.out.println(arr[i]);
        }
    }
}
