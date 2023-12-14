package ex03;

import java.util.Scanner;

public class NestedWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("정수를 입력하시오 : ");

            int number = sc.nextInt();

            if (number == 99) break; // 인터럽트
            if (number > 0)
                System.out.println("양수입니다.");
            else if (number < 0)
                System.out.println("음수입니다.");
            else
                System.out.println("0 입니다.");

        }

        /*
        int number = 0;
        while (number != 99){
            System.out.print("정수를 입력하시오 : ");

            number = sc.nextInt();

            if (number == 99) break; // 인터럽트
            if (number > 0)
                System.out.println("양수입니다.");
            else if (number < 0)
                System.out.println("음수입니다.");
            else
                System.out.println("0 입니다.");

         */

    }
}
