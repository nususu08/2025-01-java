package ch05.sec06;

public class Mission08 {
    public static void main(String [] args) {
        int[] arr = { 77, 34, 109, 200, 21, 101, 48 };

        //arr 배열에서 가장 작은 값 찾아서 출력
        int num = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(num > arr[i]){
                num = arr[i];
            }
        }
        System.out.println(num);
    }
}
