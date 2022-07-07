import java.util.HashMap;


public class studentDb {


     HashMap<String,String[]> allStudents =new HashMap<>();

    public  studentDb (HashMap allStudents) {
        this.allStudents = allStudents;


    }

    public HashMap<String, String[]> getAllStudents() {
        return allStudents;
    }

    public HashMap<String, String[]> randomStudent(){
        int randomIndex=(int) (Math.random() * allStudents.size());
        return allStudents;
    }
}
