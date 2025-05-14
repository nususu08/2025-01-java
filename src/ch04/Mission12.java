package ch04;

public class Mission12 {
    public static void main(String[] args){
        /*
        2 x 1 = 2 /t  3 x 1 = 3 /t  4 x 1 =4 .....
        2 x 2 = 4 /t ...
        ...
        2 x 9 = 18 /t 3 x 9 = 27 ...
         */
        for(int i = 1; i < 10; i++) {
            for(int k = 2; k < 10; k++) {
                System.out.printf("%d x %d = %d\t", k, i, i * k);
            } System.out.println();
        }

    }
}
