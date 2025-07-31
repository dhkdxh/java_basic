package JavaBasic.JavaBasic_02.test.loop_array;

public class Student {
    private int[] scores;
    private int sum; // score들의 sum을 쉽게 관리하기 위해
    private int lengthOfScores;//학생수 입력 되었을 때, score가 입력되었는지 확인하기 위해
    private int studentNum; //입력된 학생수

    public Student(){
        this.sum=0;
        this.lengthOfScores=0;
        studentNum=0;
    }
    public Student(int num){
        this.scores = new int[num];
        this.sum = 0;
        this.studentNum=num;
    }

    public void setScore(int index, int score){
        this.scores[index] = score;
        lengthOfScores++;
    }

    public int getScore(int index){
        return this.scores[index];
    }

    public int getHighScore(){
        int maxNum = -1;
        for(int i=0; i<scores.length; i++){
            if(scores[i] > maxNum) maxNum = scores[i];
            this.sum += scores[i];
        }
        return maxNum;
    }

    public double getAvg(){
        return (double)sum/scores.length;
    }

    public boolean isStudentExisted(){
        if(studentNum>0) return true;
        return false;
    }

    public boolean isScoreEntered(){
        if(lengthOfScores > 0) return true;
        return false;
    }
}
