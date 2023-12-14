package ex03;

import java.util.Scanner;

/**
 * 1. 2 ~ 9 단까지 출력되는 프로그램을 만드시오
 * 2. 스캐너를 이용하여 입력받은 단만 출력하시오
 */
public class GugudanEx01 {
    public static void main(String[] args) {

        for (int i = 2; i <= 9; i++){
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + i*j + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 1; i <= 9; i++){
            for (int j = 2; j <= 9; j++) {
                System.out.print(j + "*" + i + "=" + i*j + "\t");
            }
            System.out.println();
        }

    }
}
