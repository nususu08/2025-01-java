package ch05.sec06;

import java.util.Arrays;

public class ArrayStudy {
    public static void main(String[] args) {
        /*
        사용이유: 같은 타입의 여러 값을 저장하기 위함.

        정수값 10개를 저장하려고 하면 변수 선언을 10개를 해야한다.
        각 변수 선언마다 변수 이름을 할당해주어야 한다.
        모두 다른 이름을 주어야한다. 그래야 구분이 가능하기 때문.

        int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;

        배열을 사용하면 엄청 많은 변수 공간도 간단하게 할당할 수 있다.

        1. 배열 변수 선언
        타입[] 변수명;

        int n1; // 값을 저장할 수 있는 변수
        int[] arr1; // 배열의 주소값 저장할 수 있는 변수

        2. 배열 생성
        new int[5]; // int 타입의 값을 저장할 수 있는 공간이 5개 마련.
        new int[1000]; // int 타입의 값을 저장할 수 있는 공간이 1,000개 마련

         */
        int[] arr1 = new int[10]; // 인덱스(방 번호) 0 ~ 9, 리터럴이 들어갈 수 있으면 변수도 들어갈 수 있다.
        // 쓰기
        arr1[0] = 10;

        //읽기
        int num = arr1[0];
        System.out.println(num);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        arr1[5] = 100;
        System.out.println(arr1[5]);
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1.length);

        for(int i = 0; i < arr1.length; i++) {
            System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
        }
    }
}
