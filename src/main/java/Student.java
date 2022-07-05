import java.util.Objects;

public abstract class Student {

    String iD;
    String firstname;
    String lastname;
    int age;
    String course;


    public Student(String iD, String firstname, String lastname, int age, String course) {
        this.iD = iD;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return iD == student.iD && age == student.age && firstname.equals(student.firstname) && lastname.equals(student.lastname) && course.equals(student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iD, firstname, lastname, age, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "iD=" + iD +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }

public abstract String getiD2();

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


}


//_______


