package ch04;

public class Mission13 {
    public static void main(String [] args) {
        int star = (int)(Math.random() * 6.0) + 3; // 3 ~ 8 까지 랜덤값
        System.out.println("star: " + star);
        for(int i = 0; i < star; i++){
            for(int k = 0; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*


         */

    }
}
