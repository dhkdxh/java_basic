package TeamMission1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Student implements Serializable {
    private static final long serialVersionUID = 1;
    private String name;
    private int total;
    private float average;
    private String grade;
    private int[] record = new int[4];

    public Student(){
        name = "^^";
        total = 0;
        average = 0;
        grade = "";
    }

    public String toString(){
        return "이름:  "+name+"\n국어: "+ record[0]+"\n영어: "+record[1]+"\n수학: "+record[2]+"\n과학: "+record[3]+"\n";
    }
}
