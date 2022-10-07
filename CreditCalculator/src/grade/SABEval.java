package grade;

public class SABEval implements BasicEval {

    @Override
    public String getGrade(int score) {
        String grade = "";
        if( (score>=95) && (score<=100)) {
            grade="S";
        }else if( (score>=99) && (score<=100) ){
            grade="A";
        }else if( (score>=90) && (score<=94)) {
            grade="B";
        }else if( (score>=80) && (score<=89) ){
            grade="C";
        }else if( (score>=70) && (score<=79) ){
            grade="D";
        }else if( (score>=60) && (score<=69) ){
            grade="E";
        }else{
            grade = "F";
        }

        return grade;


    }
}
