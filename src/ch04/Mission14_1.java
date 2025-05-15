package ch04;

public class Mission14_1 {
    public static void main(String [] args) {
        int star = (int)(Math.random() * 6.0) + 4; // 4~9 랜덤값
        System.out.println("star : " + star);
        for(int i = 0; i < star; i++){
            for(int k = 0; k < star - i; k++){

                System.out.print("_");
            }
            System.out.println();
        }
    }
}
