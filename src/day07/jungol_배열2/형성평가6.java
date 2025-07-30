package day07.jungol_배열2;

public class 형성평가6 {
    public static void main(String[] args) {
        int[][] arr = {{1,0,1,0,1},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};

        for(int i=1; i<5; i++){
            for(int j=0; j<5; j++){
                if(j-1<0){
                    arr[i][j] = arr[i-1][j+1];
                }
                else if(j+1>4){
                    arr[i][j] = arr[i-1][j-1];
                }
                else arr[i][j] = arr[i-1][j-1]+arr[i-1][j+1];
            }
        }

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
