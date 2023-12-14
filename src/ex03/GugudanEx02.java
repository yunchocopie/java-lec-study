package ex03;

import java.util.Scanner;

public class GugudanEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 (2단 ~ 9단) : ");
        int dan = sc.nextInt();

        for (int i = 1; i < 9; i++) {
            System.out.println(dan + "*" + i + "=" + dan*i);
        }
    }
}
