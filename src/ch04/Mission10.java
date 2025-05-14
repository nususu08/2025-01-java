package ch04;

public class Mission10 {
    public static void main(String [] args) {
        int star = (int)(Math.random() * 4.0) + 3; // 3~6 사이 랜덤값
            System.out.println("star: " + star);
        for(int k = 0; k < star; ++k) {
            for (int i = 0; i < star; ++i) {
                System.out.print("*");
            }System.out.println("");
        }
    }
}
