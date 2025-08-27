package week6.day24.jsonEx;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

public class CreateJSON {
    public static void main(String[] args) {
        //1. JSON 객체 생성
        JSONObject root = new JSONObject();

        //2. 속성 추가
        root.put("id", "dhkdxh");
        root.put("name", "yewon");
        root.put("pwd", "myPassword");

        //3. 복합 속성 추가
        JSONObject tel = new JSONObject();
        tel.put("phone1", "010-1111-2222");
        tel.put("phone2", "010-2222-3333");
        root.put("tel", tel);

        JSONArray skill = new JSONArray();
        skill.put("java");
        skill.put("HTML");
        skill.put("JPA");
        root.put("skill", skill);

        //4. JSON 얻기
        String json =root.toString();//String type으로

        //5. 콘솔에 출력
        System.out.println(json);

        //6. 파일에 출력
        try (Writer writer = new FileWriter("sym.json", Charset.forName("UTF-8"));){
            writer.write(json);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
