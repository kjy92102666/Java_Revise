package web;

import constant.DefineConstant;
import printer.GeneratePrinter;
import school.GoodSchool;
import school.Score;
import school.Student;
import school.Subject;

public class WebView {

    GoodSchool school = GoodSchool.getInstance();

//main은 static함수.
    public static void main(String[] args){

        WebView webView = new WebView();

        webView.createSubject();
        webView.crateStudent();

        GeneratePrinter printer = new GeneratePrinter();
        printer.showInfo();
        //webView.
        //GoodSchool.getInstance().showInfo();

    }

    public static void createScoreForStudent(Student student, Subject subject, int point){
        Score score = new Score(subject, point);
        student.addSubjectScore(score);
    }

    public static void crateStudent(){
        //print가 구현되기전에 find로 찾아서 toString()으로 출력.
        Subject korean = GoodSchool.getInstance().getFindSubject(DefineConstant.KOREAN);
        //GoodSchool에 과목코드를 찾아달라~, 과목코드는 변하지 않기때문에 상수화 시켜 가독성높여줌.
        Subject math = GoodSchool.getInstance().getFindSubject(1002);

        Student studentKim = new school.Student(211213,"kim",korean);
        Student studentPark = new school.Student(212330,"park",math);
        Student studentLee = new school.Student(201518 ,"lee",korean);
        Student studentNoa = new school.Student(202360 ,"noa",korean);
        Student studentYou = new school.Student(201290 ,"you",math);

        GoodSchool.getInstance().addStudent(studentKim);
        GoodSchool.getInstance().addStudent(studentPark);
        GoodSchool.getInstance().addStudent(studentLee);
        GoodSchool.getInstance().addStudent(studentNoa);
        GoodSchool.getInstance().addStudent(studentYou);

        createScoreForStudent(studentKim, korean,95);
        createScoreForStudent(studentPark, korean,95);
        createScoreForStudent(studentLee, korean,100);
        createScoreForStudent(studentNoa, korean,89);
        createScoreForStudent(studentYou, korean,83);

        createScoreForStudent(studentKim, math,56);
        createScoreForStudent(studentPark, math,98);
        createScoreForStudent(studentLee, math,88);
        createScoreForStudent(studentNoa, math,95);
        createScoreForStudent(studentYou, math,56);


        //국어 과목 학생 등록
        korean.registerStudent(studentKim);
        korean.registerStudent(studentPark);
        korean.registerStudent(studentLee);
        korean.registerStudent(studentNoa);
        korean.registerStudent(studentYou);


        //수학 수강생
        math.registerStudent(studentKim);
        math.registerStudent(studentPark);
        math.registerStudent(studentLee);
        math.registerStudent(studentNoa);
        math.registerStudent(studentYou);


    }

    public static void createSubject(){
        Subject korean = new Subject(DefineConstant.KOREAN,"KOREAN");
        Subject math = new Subject(DefineConstant.MATH,"MATH");
        GoodSchool.getInstance().addSubject(korean);
        GoodSchool.getInstance().addSubject(math);

    }

}
