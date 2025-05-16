package ch04.sec03;

import java.util.Scanner;

public class Mission03 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요 > ");
        int score = scanner.nextInt(); // -10, 0, 120
        System.out.println("score: " + score);

        if(score % 10 == 9){
            System.out.println("1");
        }

    }
}
