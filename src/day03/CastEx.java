package day03;

public class CastEx {
    public static void main(String[] args) {
        long longvalue  = 300;
        int invalue = (int) longvalue;

//        int value2 = 65;
//        char c1 = (char) value2;
//
//        System.out.println(c1);

        double dvalue2 = 3.14;
        int intValue3 = (int)dvalue2;

        System.out.println(intValue3);

        double result2= 1.2f + 2.4f;

        String str1 = "3" + 7;

        String str = "";

        str = 1+2+"3";
        System.out.println(str);

        str = 1 + "2" + 3;
    }
}
