package ch04;

public class Mission03 {
    public static void main(String[] args) {
        int value = (int) (Math.random() * 100.0) + 1; //1~100 사이의 랜덤값 나오게 해주시고

        if (value % 2 == 0 ) {
            System.out.println(value + "는(은) 짝수입니다");
        } else {
            System.out.println(value + "는(은) 홀수입니다");
        }
    }
}




        //랜덤값이 value = 5; 라면
        //출력: 5 홀수입니다.

        //랜덤값이 value = 97; 라면
        //출력: 97;는(은) 홀수입니다.

        //랜덤값이 value = 54; 라면
        //출력: 54;는(은) 홀수입니다.
