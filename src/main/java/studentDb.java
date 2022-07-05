public class studentDb {

    private Student[] allstudents;

    public studentDb(Student[] allstudents) {
        this.allstudents = allstudents;


    }

    public Student[] getAllStudents() {


        return new Student[0];
    }

    public Student randomStudent(){
        int randomIndex=(int) (Math.random() * allstudents.length);
        return allstudents[randomIndex];
    }
}
