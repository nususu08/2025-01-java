package ch02.sec01;

public class VariableExchangeExample {
    //메인 메소드 작성
    public static void main(String[] args) {
            int x = 3, y = 5;
            System.out.println("x: " + x + ", y: " + y); //x: 3, y: 5




            int z = x;
            x = y;
            y = z;

            System.out.println("x: " + x + ", y: " + y); //x: 5, y: 3

    }
}
