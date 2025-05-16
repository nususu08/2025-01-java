package ch04.sec03;

public class Mission02 {
    public static void main(String [] args) {
        int score = (int)(Math.random() * 101.0) + 5; // 5 ~ 120 랜덤값
        System.out.println(score);
        int a = score / 10;
        System.out.println(a);

        switch (a) {
            case 10, 9 :
                System.out.println("A학점");
                break;
            case 8 :
                System.out.println("B학점");
                break;
            case 7 :
                System.out.println("C학점");
                break;
            default:
                System.out.println("D학점");
        }

    }
}
