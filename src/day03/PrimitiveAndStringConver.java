package day03;

public class PrimitiveAndStringConver {
    public static void main(String[] args) {
        String v1 = "10";
        //string -> int convert using wrapper class
        int d1 = Integer.parseInt(v1);
        System.out.println(d1+10);

        v1 = "3.14";
        double d2 = Double.parseDouble(v1);
        System.out.println(v1 + 0.01);

        v1 = "true";
        boolean b1 = Boolean.parseBoolean(v1);
        System.out.println(b1);

        if(!b1){
            System.out.println("false");
        }else{
            System.out.println("true");
        }

        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
    }
}
