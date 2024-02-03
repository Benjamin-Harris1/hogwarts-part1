import java.util.Date;


public class Application {
    public static void main(String[] args){
        initApp();
    }

    private static void initApp(){

        DynamicArray students = new DynamicArray();
        
        House gryffindor = new House("Gryffindor", "Godric Gryffindor", new String[]{"red", "gold"});
        House ravenclaw = new House("Ravenclaw", "Rowena Ravenclaw", new String[]{"blue", "silver"});
        House slytherin = new House("Slytherin", "Salazar Slytherin", new String[]{"green", "silver"});
        House hufflepuff = new House("Hufflepuff", "Helga Hufflepuff", new String[]{"yellow", "black"});

        students.add(new HogwartsStudent("Harry Potter", 1991, 1997, false, gryffindor, true, new String[]{"Quidditch"}));
        students.add(new HogwartsStudent("Ron Weasley", 1991, 1997, false, gryffindor, false, new String[]{"Quidditch"}));
        students.add(new HogwartsStudent("Hermione Granger", 1991, 1997, false, gryffindor, false, new String[]{}));
        students.add(new HogwartsStudent("Draco Malfoy", 1991, 1997, false, slytherin, false, new String[]{"Quidditch"}));
        students.add(new HogwartsStudent("Neville Longbottom", 1991, 1997, false, gryffindor, false, new String[]{}));
        students.add(new HogwartsStudent("Luna Lovegood", 1991, 1997, false, ravenclaw, false, new String[]{}));
        students.add(new HogwartsStudent("Ginny Weasley", 1992, 1998, false, gryffindor, false, new String[]{"Quidditch"})); // Yngre, men for variation
        students.add(new HogwartsStudent("Cedric Diggory", 1989, 1995, false, hufflepuff, true, new String[]{"Quidditch"})); // Ældre, men vigtig karakter
        students.add(new HogwartsStudent("Cho Chang", 1990, 1996, false, ravenclaw, false, new String[]{"Quidditch"}));
        students.add(new HogwartsStudent("Pansy Parkinson", 1991, 1997, false, slytherin, false, new String[]{}));
        students.add(new HogwartsStudent("Seamus Finnigan", 1991, 1997, false, gryffindor, false, new String[]{}));
        students.add(new HogwartsStudent("Dean Thomas", 1991, 1997, false, gryffindor, false, new String[]{}));
        students.add(new HogwartsStudent("Padma Patil", 1991, 1997, false, ravenclaw, false, new String[]{})); // Tvilling til Parvati, men i Ravenclaw
        students.add(new HogwartsStudent("Parvati Patil", 1991, 1997, false, gryffindor, false, new String[]{}));
        students.add(new HogwartsStudent("Lavender Brown", 1991, 1997, false, gryffindor, false, new String[]{}));
        students.add(new HogwartsStudent("Gregory Goyle", 1991, 1997, false, slytherin, false, new String[]{}));
        students.add(new HogwartsStudent("Vincent Crabbe", 1991, 1997, false, slytherin, false, new String[]{}));


        for (int i = 0; i < students.size(); i++){
            HogwartsStudent student = (HogwartsStudent) students.get(i);
            System.out.println(student.getFullName() + " from " + student.getHouse().getName() + " which has the colors " + String.join(" and ", student.getHouse().getColors()));
            //System.out.println(student);
        }
        System.out.println("Antal studerende: " + students.size());
        System.out.println("Array størrelse: " + students.getCapacity());

        // Test yearGroup

        YearGroup yearGroup1991 = new YearGroup(1991, new Date());
        yearGroup1991.addStudent((HogwartsStudent) students.get(0));
        yearGroup1991.addStudent((HogwartsStudent) students.get(1));
        yearGroup1991.addStudent((HogwartsStudent) students.get(2));

        System.out.println("Year Group: " + yearGroup1991.getSchoolYear());
        System.out.println("Start of school year: " + yearGroup1991.getBeginningOfSchoolYear());
        System.out.println("Number of students: " + yearGroup1991.getNumberOfStudents());
        for (int i = 0; i < yearGroup1991.getNumberOfStudents(); i++){
            HogwartsStudent student = yearGroup1991.getStudent(i);
            System.out.println("- " + student.getFullName() + " from " + student.getHouse().getName());
        }

        DynamicArray teachers = new DynamicArray();

        teachers.add(new HogwartsTeacher("Horace E. Slughorn", "Full-time", new Date(), null, slytherin, true));
        teachers.add(new HogwartsTeacher("Severus Snape", "Full-time", new Date(), null, slytherin, true));

        for (int i = 0; i < teachers.size(); i++){
            HogwartsTeacher teacher = (HogwartsTeacher) teachers.get(i);
            System.out.println(teacher.getFullName() + ", employment type: " + teacher.getEmployment());
            //System.out.println(teacher);
        }

        // Opretter potions fag
        Subject potions = new Subject("Potions", 6, false);

        // Opretter potions kursus med Horace Slughorn som teacher
        HogwartsTeacher slughorn = (HogwartsTeacher) teachers.get(0);
        Course potionsSixthYear = new Course(potions, slughorn);

        // Tilføj students til course
        for (int i = 0; i < students.size(); i++){
            HogwartsStudent student = (HogwartsStudent) students.get(i);
            potionsSixthYear.addStudent(student);
        }

        for (int i = 0; i < potionsSixthYear.getStudents().size(); i++){
            HogwartsStudent student = (HogwartsStudent) potionsSixthYear.getStudents().get(i);
            System.out.println("Potions 6 student: " + student.getFullName() + " from " + student.getHouse().getName());
        }

        //System.out.println(potionsSixthYear);


        TeachingMaterial textbook = new TextBook("Potions Textbook", false, true, true, "Advanced Potion Making", "Libatius Borage", "Self-Publish", "Magic Books", 1977);
        TeachingMaterial wand = new Wand("Wooden Wand", true, true, false, "Oak", 11, "Holly", "Phoenix feather");

        potionsSixthYear.addTeachingMaterial(textbook);
        potionsSixthYear.addTeachingMaterial(wand);

        System.out.println("Course: " + potionsSixthYear.getSubject().getName());
        System.out.println("Teacher: " + potionsSixthYear.getTeacher().getFullName());
        System.out.println("Students:");
        for (int i = 0; i < potionsSixthYear.getStudents().size(); i++){
            HogwartsStudent student = (HogwartsStudent) potionsSixthYear.getStudents().get(i);
            System.out.println("- " + student.getFullName() +  " from " + student.getHouse().getName());
        }

        System.out.println("Teaching materials:");
        for (TeachingMaterial teachingMaterial : potionsSixthYear.getTeachingMaterials()){
            System.out.println("- " + teachingMaterial.getName());
        }

        
    }
}