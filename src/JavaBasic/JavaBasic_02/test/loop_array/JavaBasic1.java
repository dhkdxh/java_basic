package JavaBasic.JavaBasic_02.test.loop_array;

public class JavaBasic1 {
    public static void main(String[] args) {
        String grade = "B";

        int score = switch(grade){
            case "A" -> 100;
            case "B" -> {
                int result = 100-20;
                yield result;
            }
            default -> 60;
        };
    }
}
