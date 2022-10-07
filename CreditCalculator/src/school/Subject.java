package school;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Student> studentArr;
    private int id;
    private String name;
    //private int gradeType;

    public Subject(int id, String name){
        this.name = name;
        this.id = id;

        studentArr = new ArrayList<>();//생성자에 list 초기화...
    }

    public void registerStudent(Student student){
        studentArr.add(student);
    }

    /*
    public int getGradeType() { return gradeType; }
    public void setGradeType(int gradeType) { this.gradeType = gradeType; }
    얘네 삭제.
    */
    public List<Student> getStudentList(){
        return studentArr;
    }

    //Override하는 이유, student id랑 subject id가 서로 같냐 확인하기 위한 함수!
    @Override
    public int hashCode() { //hashCode는 왜 썼을까....??
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Subject){
            Subject tmp = (Subject) obj;
            if(this.id == tmp.id){
                return true;
            }
        }
        return super.equals(obj);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }



    public String getName(){
        return name;
    }

}