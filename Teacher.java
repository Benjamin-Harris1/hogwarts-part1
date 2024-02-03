import java.util.Date;

public class Teacher extends Person {
    private String employment;
    private Date employmentStart;
    private Date employmentEnd;

    public String toString(){
        return super.toString() + ", employment: " + employment;
    }

    public Teacher(String firstName, String middleName, String lastName, String employment, Date employmentStart, Date employmentEnd){
        super(firstName, middleName, lastName);
        this.employment = employment;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }

    public Teacher(String fullName, String employment, Date employmentStart, Date employmentEnd){
        super(fullName);
        this.employment = employment;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }

    public Teacher(){

    }

    public String getEmployment(){
        return employment;
    }

    public void setEmployment(String employment){
        this.employment = employment;
    }

    public Date getEmploymentStart(){
        return employmentStart;
    }

    public void setEmploymentStart(Date employmentStart){
        this.employmentStart = employmentStart;
    }
    public Date getEmploymentEnd(){
        return employmentEnd;
    }

    public void setEmploymentEnd(Date employmentEnd){
        this.employmentEnd = employmentEnd;
    }
}