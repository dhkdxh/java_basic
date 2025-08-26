package week5.day24.jsonEx;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.nio.charset.Charset;

//.json 파일을 parsing
public class ParseJsonEx {
    public static void main(String[] args) {
        //파일로부터 JSON 읽어오기
        //bufferedReader는 한줄씩 처리 가능, 뒤에 CharSet으로 깨지지 않게 처리하기
        try(BufferedReader br = new BufferedReader(new FileReader("sym.json", Charset.forName("UTF-8")))) {
            String json = br.readLine();

            JSONObject root = new JSONObject(json);

            System.out.println("아이디: "+ root.getString("name"));
            JSONObject obj = root.getJSONObject("tel");
            System.out.println("tel" + obj.getString("phone1"));
            System.out.println("tel" + obj.getString("phone2"));

            JSONArray skill = obj.getJSONArray("skill");
            for (int i = 0; i < skill.length(); i++) {
                System.out.println(skill.getString(i) + " ");

            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
