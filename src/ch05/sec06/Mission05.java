package ch05.sec06;

public class Mission05 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int k = 0; k < arr.length; k++) {
            arr[k] = 10 + k;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"] : " + arr[i]);
        }




        //for 쓰기용 (10, 11, 12, 13 ..... 19)


        //for 출력용(읽기 후 출력)
        //arr[0] : 10
        //arr[1] : 11
        //arr[2] : 12

    }
}
