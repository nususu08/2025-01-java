package ch05.sec06;

public class Mission04 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 ,50 };
        int a = 0;

        //arr 배열이 가지고 있는 숫자 모두 더한 값 출력
        for(int i = 0; i < arr.length; i++) {
            a += arr[i]; // a = a + arr[i];
        }
        System.out.printf("값 : %d\n", a);
    }
}
