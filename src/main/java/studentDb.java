import java.util.ArrayList;
import java.util.Arrays;

public class studentDb {

     ArrayList allstudents;

    public  studentDb (ArrayList allstudents) {
        this.allstudents = allstudents;


    }

    public Student[] getAllStudents() {


        return new Student[0];
    }

    public ArrayList randomStudent(){
        int randomIndex=(int) (Math.random() * allstudents.size());
        return allstudents;
    }
}
