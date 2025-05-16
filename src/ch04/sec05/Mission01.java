package ch04.sec05;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int i = 0;

        while(run) {
            System.out.println("합계를 구할 숫자를 입력하세요. (종료:0)");
            int strNum = scanner.nextInt();
            switch (strNum){
                case 0:
                    System.out.println(i);
                    run = false;
                    break;
                default:
                    i = i + strNum;
                   // System.out.println(i);
            }

        }
        /*
        합계를 구할 숫자를 입력하세요. (종료:0)
        >>100
        >>200
        >>300
        >>0
        합계 : 1000
         */

    }
}
