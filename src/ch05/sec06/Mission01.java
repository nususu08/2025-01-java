package ch05.sec06;

import java.util.Arrays;

public class Mission01 {
    public static void main(String[] args) {
        int k = 0;
        int[] arr = new int[10];
        //int[] arr2 = new float[10];
        for(int i = 0; i < arr.length; i++){
            k += 100;
            arr[i] = k;
        }
        System.out.println(Arrays.toString(arr));
        //[100, 200, 300, 400, 500]
    }
}
