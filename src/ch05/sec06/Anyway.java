package ch05.sec06;

import java.util.Arrays;

public class Anyway {
    public static void main(String[] args) {
        int [] arr = new int[3];
        for(int i = 0; i < arr.length; i++) {
            while(true) {
                arr[i] = (int)(Math.random() * 10) + 1;
                int run = 0;
                for(int k = 0; k < i; k++) {
                    if(arr[i] == arr[k]) {
                        run = 1;
                        break;
                    }
                }if(run == 0) {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
