package ch04.sec07;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        /*
        (프린트 반복 실행)
---------------------------------
1.예금 | 2.출금 | 3.잔고 | 4.종료
---------------------------------
선택 >


(실행 예시)
선택 > 1 (엔터)
예금액 > 10000 (엔터)

[[ 프린트 ]]

선택 > 2 (엔터)
출금액 > 2000 (엔터)

[[ 프린트 ]]

선택 > 3 (엔터)
잔고 > 8,000원

[[ 프린트 ]]

선택 > 4 (엔터)

프로그램 종료
         */
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int result = 0;
        while(run) {
            System.out.println("-------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------");
            System.out.print("선택 > ");
            int cash = scanner.nextInt();
            switch (cash){
                case 1 :
                    System.out.print("예금액 > ");
                    int deposit = scanner.nextInt();
                    result += deposit;
                    break;
                case 2 :
                    System.out.print("출금액 > ");
                    int withdraw = scanner.nextInt();
                    if(result >= withdraw){
                        result -= withdraw;
                    } else {
                        System.out.println("잔액이 부족합니다.");
                    }
                    break;
                case 3 :
                    System.out.printf("잔고 > %,d\n", result);
                    break;
                case 4 :
                    System.out.println("프로그램 종료");
                    run = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
