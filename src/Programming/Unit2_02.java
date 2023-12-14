package Programming;

import java.util.Scanner;

public class Unit2_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("마일을 입력하시오 : ");
        double mile = sc.nextDouble();

        double km = mile * 1.609;

        System.out.println(mile + "마일은 " + km + "킬로미터 입니다.");
    }
}