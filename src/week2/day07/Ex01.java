package week2.day07;

public class Ex01 {
    public static void main(String[] args) {
        // =, != 연산자는 변수의 값이 같은지, 아닌지 조사
        int[] arr1;
        int[] arr2;
        int[] arr3;
        //선언만 하면 값이 들어가있지 않음
        arr1 = new int[3];
        arr2 = new int[3];
        arr3 = new int[3];

        System.out.println(arr1.length);
        System.out.println(arr2.length);
        System.out.println(arr3.length);

        arr1[0] = 1;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);// int의 default 값인 0으로 초기화

        //arr3에 1,2,3 할당
        System.out.println("======================");
        for(int i=1; i<=3; i++){
            arr3[i-1] = i; // index는 0부터 시작하므로
            System.out.println(arr3[i-1]);
        }
        System.out.println("======================");

        //향상된 for
        for(int i:arr3) {//여기서 i는 index가 아닌 값 그자체
            System.out.println(i);
        }

        System.out.println("===================");
        //arr3에 값을 차례로 5,6,7 할당
        for(int i=0; i<arr3.length; i++){
            arr3[i] = i+5;
            System.out.println(arr3[i]);
        }
        System.out.println("===================");

        for(int i : arr3){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("=====================");

        //주소값 복사
        arr2 = arr3;//arr2와 arr3가 같은 object를 가리키게 됨
        System.out.println(arr1==arr2);
        System.out.println(arr2==arr3);
        System.out.println(arr3==arr1);

        for(int i : arr2){
            System.out.println(i);
        }
        System.out.println("==========================");
        for(int i: arr3){
            System.out.println(i);
        }
    }
}
