package school;

public class Score {
    private Subject subject;    //외부 get,
    private int point;          //set 필요할것!을 어떻게 알지..
    private int studentId;

    public Score(Subject subject, int point){
        //this.studentId = studentId;
        this.subject = subject;
        this.point = point;

    }

    public Subject getSubject() {
        return subject;
    }

    public int getPoint() {
        return point;
    }

    @Override
    public String toString() {
        return "Score{" +
                "point=" + point +
                '}';
    }

    /*public int getStudentId() {
        return studentId;
    } 삭제됐...
    */

}
