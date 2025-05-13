package ch04;

public class Mission04 {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 201.0); // 0 ~ 200 사이의 랜덤값
        if (score < 0 || score > 100) {
            System.out.println("측정 불가");
        } else if (score >= 90) {
            System.out.println("A학점");
        } else if (score >= 80) {
            System.out.println("B학점");
        } else if (score >= 70) {
            System.out.println("C학점");
        } else {
            System.out.println("D학점");
        }
        System.out.println(score);


        //만약 score 값이 100 ~ 90점 사이면 A학점
        //만약 score 값이 80 ~ 89점 사이면 B학점
        //만약 score 값이 70 ~ 79점 사이면 C학점
        //만약 score 값이 70점 미만이면 D학점
        //만약 score 값이 100점을 넘기면 "측정 불가"출력

        System.out.println("-- 끝 --");
    }

    public static class Mission05 {
        public static void main(String [] args) {
            int starCount = (int)(Math.random() * 6) + 2; //(1) 2~7 사이 랜덤값
            System.out.printf("starCount: %d\n", starCount);

            //starCount = 3;
            //***

            //starCount = 7;
            //*******

            //starCount = 2;
            //**
            for (int i = 0; i < starCount; i++)
                System.out.print("*");
        }
    }
}