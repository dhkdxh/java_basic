package week2.day07.jungol_배열2;

public class 연습문제7 {
    public static void main(String[] args) {
        int[][] arr= new int[5][5];

        //i-1범위, j-1
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                if(i-1<0 || j-1<0){
                    arr[i][j]=1;
                    System.out.print(arr[i][j]+" ");
                    continue;
                }
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
