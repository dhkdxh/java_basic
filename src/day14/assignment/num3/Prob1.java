package day14.assignment.num3;

public class Prob1 {
    public static void main(String args[]) {

        Prob1 prob1 = new Prob1();

        System.out.println( prob1.leftPad("SDS", 6, '#') );
        System.out.println( prob1.leftPad("SDS", 5, '$') );
        System.out.println( prob1.leftPad("SDS", 2, '&') );

    }

    public String leftPad(String str, int size, char padChar) {

        int currentLength = size - str.length();

        String temp = "";
        for(int i=0; i<currentLength; i++){
            temp += String.valueOf(padChar);
        }
        return temp+str;
    }
}
