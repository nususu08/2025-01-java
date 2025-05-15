package ch04;

public class Mission14 {
    public static void main(String [] args) {
        int star = (int)(Math.random() * 6.0) + 4; // 4~9 랜덤값
        System.out.println("star : " + star);
        for(int i = 0; i < star; i++){
            for(int k = star - 1; k > i; k--){
                System.out.print("_");
            }for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
