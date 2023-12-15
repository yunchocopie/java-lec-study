package ex03;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int com = (int) (Math.random() * 100) + 1;

        int user = 0, count = 0;
        while (com != user) {
            System.out.print("정답을 추측하여 보시오 : ");
            user = sc.nextInt();
            count++;
            if (com > user) {
                System.out.println("제시한 정수가 낮습니다.");
            }
            if (com < user){
                System.out.println("제시한 정수가 높습니다.");
            }
        }

        System.out.println("축하합니다! 정답입니다~ 시도횟수 : " + (count));
        System.out.println("guess number : " + com);
    }
}
