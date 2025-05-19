package ch04.sec07;

import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = (int)(Math.random() * 100.0) + 1; // 1 ~ 100
        int a = 0;

        while(true){
            System.out.println("1-100사이 숫자를 입력해주세요");
            int strNum = scanner.nextInt();
            if(strNum < answer){
                System.out.println("UP!");
            } else if(strNum > answer){
                System.out.println("DONW!");
            } else
                break;
        }
        System.out.println("정답!");

    }
}
