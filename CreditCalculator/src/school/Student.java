package school;

import java.util.ArrayList;
import java.util.List;

public class Student{
    private int Studentid;  //id의 활용성, 존재유무 체크... 학번이니까 필요!
    private List<Score> scoreArr;

    private Subject major;
    private String studentName;

    public Student(int Studentid, String studentName, Subject major){
        this.Studentid = Studentid; //체크
        this.studentName = studentName;
        this.major = major;

        scoreArr = new ArrayList<>();
        //생성자에 사용될 array값 초기화해주는 습관 !!!
    }
    public void addSubjectScore(Score score){
        scoreArr.add(score);
    }

    //public int getStudentId(int studentId){ return studentId; }
    public Subject getMajorSubject(){
        return major;
    }

    public List<Score> getScoreArr() {
        return scoreArr;
    }

    public int getStudentId() { return Studentid; }

    public Subject getMajor() { return major; }

    public String getStudentName() { return studentName; }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + Studentid +
                ", scoreArr=" + scoreArr +
                ", major=" + major +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
