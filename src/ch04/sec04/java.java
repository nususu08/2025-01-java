package ch04.sec04;

import java.util.Arrays;

public class java {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            System.out.printf("%d ", (int)(Math.random() * 10));
        }

        // 10개의 난수를 저장 받을 변수를 생성
        int[] arr = new int[10];

        // 1 ~ 5 까지의 난수 10개를 0 부터 9 인덱스에 저장 받고
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 5) + 1;
        }

        // 값이 잘 들어갔나 확인
        System.out.println(Arrays.toString(arr));
    }
}
