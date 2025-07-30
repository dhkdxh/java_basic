package day06.jungol;

public class 연습문제2 {
    public static void main(String[] args) {
        char[] arr = new char[27];

        for(int i=0; i<26; i++){
            int index = i+65;
            arr[i] = (char)index;
        }

        for(int i = 25; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
