package ClassTest;

public class Subject {
    String subjectName;
    String subjectTime;
    String subjectWho;

    public Subject(String name, String time, String who){
        subjectName = name;
        subjectTime = time;
        subjectWho = who;
    }

    public String toString(){
        return (subjectName+", "+subjectTime+", "+subjectWho);
    }
}
