package printer;

import constant.DefineConstant;
import grade.ABEval;
import grade.BasicEval;
import grade.SABEval;
import school.GoodSchool;
import school.Score;
import school.Student;
import school.Subject;

import java.util.ArrayList;
import java.util.List;

//실질적으로 찍어내는 함수.
public class GeneratePrinter {

    GoodSchool school = GoodSchool.getInstance();
    StringBuffer stringBuffer = new StringBuffer();
    List<BasicEval> basicEvalArr;

    public GeneratePrinter(){
        stringBuffer = new StringBuffer();
        basicEvalArr = new ArrayList<>();
        basicEvalArr.add(new ABEval()); //basicEvalArr[0]
        basicEvalArr.add(new SABEval());    //basicEvalArr[1]

    }

    public void showInfo(){
        List<Subject> subjectList = school.getSubjectList();
        for(Subject subject : subjectList){ //첫 subject는 [KOREAN]
            stringBuffer.append("\n");
            stringBuffer.append("["+subject.getName()+"]");
            stringBuffer.append("\n");
            for(Student student : subject.getStudentList()){
                stringBuffer.append(student.getStudentName());  //이름
                stringBuffer.append("|");
                stringBuffer.append(student.getStudentId());    //학번
                stringBuffer.append("|");
                stringBuffer.append(student.getMajorSubject().getName()); //학생의과목이름
                stringBuffer.append("|");
                getGrade(student, subject); //학생 하나에 대한 국어성적을 뽑아온다.
                stringBuffer.append("\n");

            }
            stringBuffer.append("\n");
            stringBuffer.append("================================================");
            stringBuffer.append("\n");
        }

        System.out.println(stringBuffer.toString());    //
    }

    private void getGrade(Student student, Subject subject){ //학교에 등록된 subject하나(국어)를 뺴와서
        List<Score> scoreList = student.getScoreArr();  //이 학생의 정보에는 국어,수학 다 들어있다.
        //처음에 등록했을때 다 등록 해놨기때문에, 저장되어있음.

        for(Score score : scoreList){
            if(score.getSubject().equals(subject)){ //equals Overriding 했다. 같은 과목이면,
                String grade;
                //subject == score.getSubject()
                if(score.getSubject().equals(student.getMajorSubject())) {//그 학생의 메이저과목과 받아오는 점수의 과목과 같다면
                   grade = basicEvalArr.get(DefineConstant.SAB_GRADE).getGrade(score.getPoint());//s냐
                                            //DefineConstant.SAB_GRADE==1
                }else {
                    grade = basicEvalArr.get(DefineConstant.AB_GRADE).getGrade(score.getPoint());//a냐 를 리턴!
                }                           //DefineConstant.AB_GRADE==0

                stringBuffer.append(score.getPoint());
                stringBuffer.append(":");
                stringBuffer.append(grade);

            }
        }
    }

    public void makeResult(){

    }


    private void makeHeader(){

    }

    private void makeBody(Subject subject){

        //return subject;
    }

    private void makeFooter(){

    }




}
