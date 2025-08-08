package day14.assignment.num5;

public class FindCharacters {
    public static void main(String[] args) {
        FindCharacters fc=new FindCharacters();
        int count=fc.countChar("Boys, be ambitious", 'b');
        System.out.println(count);

    }
    public int countChar(String str, char c) {
        // Method를 완성하세요...
        int count = 0;
        for(char temp: str.toCharArray()){
            if(temp == c){
                count++;
            }
        }
        return count;
    }
}
