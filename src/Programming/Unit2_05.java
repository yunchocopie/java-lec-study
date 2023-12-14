package Programming;

import java.util.Scanner;

public class Unit2_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("시간 간격을 입력하세요 : ");
        int time = sc.nextInt();

        System.out.println("번개가 발생한 곳까지의 거리 : " + time * 340 + "m");

    }
}
