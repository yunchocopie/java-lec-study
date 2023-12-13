package ex02;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("1. 화씨 -> 섭씨");
        System.out.println("2. 섭씨 -> 화씨");
        System.out.println("=====================================");
        System.out.println();

        System.out.print("번호를 선택하세요 : ");
        int selectedNum = sc.nextInt();

        System.out.print(selectedNum == 1 ? ("화씨온도를 입력하시오 : ") : ("섭씨온도를 입력하시오 : ") );
        double temp = sc.nextDouble();

        double cTemp = 5.0 / 9 * (temp - 32); // 화씨 -> 섭씨
        double fTemp = 9.0 / 5 * temp + 32; // 섭씨 -> 화씨

        System.out.print(selectedNum == 1 ? "섭씨온도는 " + cTemp : "화씨온도는 " + fTemp);

        sc.close();



        /* if-else 문으로 구하기

        Scanner sc = new Scanner(System.in);
        double celsius = 0, fahrenheit = 0;

        System.out.println("=====================================");
        System.out.println("1. 화씨 -> 섭씨");
        System.out.println("2. 섭씨 -> 화씨");
        System.out.println("=====================================");

        System.out.print("번호를 선택하세요 : ");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.print("화씨온도를 입력하시오 : ");
            fahrenheit = sc.nextDouble(); // 화씨
            double cTemp = (5.0/9) * (fahrenheit - 32);

            System.out.println("섭씨 온도는 : " + cTemp);
        }
        else {
            System.out.print("섭씨온도를 입력하시오 : ");
            celsius = sc.nextDouble(); // 섭씨
            double fTemp = (9.0/5) * celsius + 32;

            System.out.println("화씨 온도는 : " + fTemp);
        }

        sc.close();

        */


    }
}
