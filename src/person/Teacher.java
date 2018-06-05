package person;

public class Teacher extends Person {

    private String subjectName;
    private int workYears;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;

    }

    public int getWorkYears() {
        return workYears;

    }

    public void setWorkYears(int workYears) {
        this.workYears = workYears;
    }

    public Teacher(String name, String surname, String jmbg) {
        super(name, surname, jmbg);

    }
    
public Teacher(String name, String surname, String jmbg, String subjectName, int workYears) {
super(name, surname, jmbg);
this.subjectName = subjectName;
this.workYears = workYears;
}

    @Override
    public void showData() {
    System.out.println("Teaching subject :" + getSubjectName());
    System.out.println("Work expirience: " + getWorkYears());
    super.showData();
    }

}