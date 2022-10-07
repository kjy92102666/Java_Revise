package school;

import constant.DefineConstant;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class GoodSchool {
    //생성자 안에 초기화시켜주자. 생성자 불러옴과 동시에 메모리할당되게
    private List<Student> studentArr;   // 코드상으로 활용하는곳이 없다...검토필요.
    private List<Subject> subjectArr;
    private static GoodSchool instance = new GoodSchool();

    private GoodSchool(){
        studentArr =  new ArrayList<>();
        subjectArr = new ArrayList<>();
    }

    //이거 접.제 바꿔야되는거 아닌감.이 아니라 getInstance로 접근하기 때문에 public맞다.
    public static GoodSchool getInstance(){
        if(instance == null){
            instance = new GoodSchool();
        }
        return instance;
    }//여기까지 싱글톤패턴.


    public void addStudent(Student student){
        studentArr.add(student);

    }

    public void addSubject(Subject subject){
        subjectArr.add(subject);
    }

    public List<Subject> getSubjectList(){

        return subjectArr;
    }

    //Main화면에서 출력문을 찍기위해 객체의 정보를 찾기위해 과목코드를 찾아서 보내주는 코드
    public Subject getFindSubject(int majorId){
        Subject result = null;

        for(Subject subject:subjectArr){
            if (subject.getId() == majorId){
                result = subject;
            }
        }
        return result;
    }

    public void showInfo(){
        for (Student s : studentArr) {
            System.out.println(s.toString());
            System.out.print("Major Subject: "+s.getMajorSubject().toString());
            s.getScoreArr().forEach(s1-> System.out.println(
                    "수강과목 : "+s1.getSubject().toString()
            +s1.toString()));

        }
    }


}
