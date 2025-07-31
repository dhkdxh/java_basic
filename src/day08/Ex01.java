package day08;

public class Ex01 {
    public static void main(String[] args) {
        int[][] scores = new int[3][3];
        int[] sum = new int[3];

        scores[0][0] = 90;
        scores[0][1] = 50;
        scores[0][2] = 80;

        for(int i=0; i<3; i++){
            System.out.print(scores[0][i]+" ");
            sum[0] += scores[0][i];
        }
        System.out.println();

        scores[1][0] = 80;
        scores[1][1] = 100;
        scores[1][2] = 90;

        for(int i=0; i<3; i++){
            System.out.print(scores[1][i]+" ");
            sum[1] += scores[1][i];
        }
        System.out.println();

        scores[2][0] = 100;
        scores[2][1] = 90;
        scores[2][2] = 100;

        for(int i=0; i<3; i++){
            System.out.print(scores[2][i]+" ");
            sum[2] += scores[2][i];
        }
        System.out.println();

        for(int i=0; i<3; i++){
            System.out.printf("학생 %d의 총점: %d 평균: %d\n", i+1, sum[i], sum[i]/3);
        }

        //출력할 때 한번에 하는 방법
//        for(int i=0; i<3; i++){
//            for(int j=0; j<3; j++){
//                System.out.print(scores[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
