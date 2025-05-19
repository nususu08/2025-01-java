package ch04.sec07;

public class BreakOutExample {
    public static void main(String[] args) {
        loop1:
        for(int i=2; i<=9; i++) {
            for(int k=1; k<=9; k++) {
                if(k==5) {
                    break loop1;
                }
                System.out.printf("%d x %d = %d\n", i, k, i * k);
            }
        }
        System.out.println("--끝--");
    }
}
