package week5.day19.assignment;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.*;

@Data
public class Board {
    private int bno;
    private String bTitle;
    private String bContent;

    private String bwriter;
    private Date bDate;

    public Board(int no, String title, String content, String writer){
        this.bno = no;
        this.bTitle = title;
        this.bContent = content;
        this.bwriter = writer;
        bDate = new Date();
    }

    public void printBoard(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        String date = sdf.format(this.bDate);
        System.out.println(this.bno + "\t" + this.bwriter + "\t"+date + "\t"+this.bTitle);
    }

    public void readBoard(){
        System.out.println("################");
        System.out.println("번호: "+ this.bno);
        System.out.println("제목: "+ this.bTitle);
        System.out.println("내용: "+ this.bContent);
        System.out.println("작성자: "+this.bwriter);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        String date = sdf.format(this.bDate);
        System.out.println("날짜: "+date);
        System.out.println("################");
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getbTitle() {
        return bTitle;
    }

    public void setbTitle(String bTitle) {
        this.bTitle = bTitle;
    }

    public String getbContent() {
        return bContent;
    }

    public void setbContent(String bContent) {
        this.bContent = bContent;
    }

    public String getBwriter() {
        return bwriter;
    }

    public void setBwriter(String bwriter) {
        this.bwriter = bwriter;
    }

    public void setbDate(Date bDate) {
        this.bDate = bDate;
    }
}
