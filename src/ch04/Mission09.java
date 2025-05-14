package ch04;

public class Mission09 {
    public static void main(String [] args) {
        int dan = (int)(Math.random() * 8 ) + 2; // 2~9 사이 랜덤값 생성해주세요.
        System.out.println("dan: " + dan);
        for(int i = 0; i < 10; i++) {
            System.out.printf("%d X %d = %d\n", dan, i, dan * i);
        }

        /*
        dan : 2
        2 x 1 = 2
        2 x 2 = 4
        2 x 3 = 6
        ...
        2 x 9 = 18
         */
    }
}
