package day16.exception;

public class Ex01 {
    public static void main(String[] args) {
        try {
            String[] array = {"100", "l00"};
            for (String s : array) {
                int num = Integer.parseInt(s);
                System.out.println(num);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("프로그램 종료");
        }
    }
}
