package week5.day20.assignmentEdit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder //boardBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Board {
    private int bno;
    private String title;
    private String content;
    private String writer;
    private Date date;
}
