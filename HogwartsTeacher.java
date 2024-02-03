import java.util.Date;

public class HogwartsTeacher extends Teacher implements HogwartsPerson {
    private House house;
    private boolean headOfHouse;

    public String toString(){
        return super.toString() + ", " + house + " is head of house=" + headOfHouse;
    }

    public HogwartsTeacher(String firstName, String middleName, String lastName, String employment, Date employmentStart, Date employmentEnd, House house, boolean headOfHouse) {
        super(firstName, middleName, lastName, employment, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }
    public HogwartsTeacher(String fullName, String employment, Date employmentStart, Date employmentEnd, House house, boolean headOfHouse) {
        super(fullName, employment, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }

    public House getHouse(){
        return house;
    }

    public void setHouse(House house){
        this.house = house;
    }

    public boolean isHeadOfHouse(){
        return headOfHouse;
    }

    public void setHeadofHouse(){
        this.headOfHouse = headOfHouse;
    }
}