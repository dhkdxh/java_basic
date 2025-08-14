package week3.day10;

public class Computer {
    private int[] arr;
    private int sum;

    public Computer(){
        arr = new int[5];
        this.sum = 0;
    }

    public int totalSum(){
        for (int i : arr) {
            sum += i;
        }
        return this.sum;
    }

    public void setNum(int index, int num){
        arr[index] = num;
    }
}
