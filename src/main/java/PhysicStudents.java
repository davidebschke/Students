

public class PhysicStudents extends Student {

    public PhysicStudents(String iD, String firstname, String lastname, int age, String course, String areaOfExpertise) {
        super(iD, firstname, lastname, age, course);
        this.areaOfExpertise = areaOfExpertise;
    }

    @Override
    public String getiD2() {
        return iD;
    }

    String areaOfExpertise;

    public String getAreaOfExpertise() {
        return areaOfExpertise;
    }

    public void setAreaOfExpertise(String areaOfExpertise) {
        this.areaOfExpertise = areaOfExpertise;
    }


}

