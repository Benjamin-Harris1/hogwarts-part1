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
        }
        System.out.println("Antal studerende: " + students.size());
        System.out.println("Array størrelse: " + students.getCapacity());
        
    }
}