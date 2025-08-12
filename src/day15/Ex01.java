package day15;

public class Ex01 {
    public static void main(String[] args) {

        try {
            int[] arr = {10, 20, 30};
            System.out.println(arr[3]);
            String s = null;
            System.out.println(s.length());

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e1) {
            System.out.println(e1.getMessage());
        } catch (RuntimeException e2) {
            System.out.println(e2.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }catch(Throwable t){
            System.out.println(t.getMessage());;
        }
    }
}
