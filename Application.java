public class Application {
    public static void main(String[] args){
        initApp();
    }

    private static void initApp(){
        
        House gryffindor = new House("Gryffindor", "Godric Gryffindor", new String[]{"red", "gold"});
        House ravenclaw = new House("Ravenclaw", "Rowena Ravenclaw", new String[]{"blue", "silver"});
        House slytherin = new House("Slytherin", "Salazar Slytherin", new String[]{"green", "silver"});
        House hufflepuff = new House("Hufflepuff", "Helga Hufflepuff", new String[]{"yellow", "black"});

        System.out.println(gryffindor);
        System.out.println(hufflepuff);

        Student harry = new Student("Harry James Potter", 1991, 1997, false);
        Student hermione = new Student("Hermione Granger", 1991, 1997, false);

        System.out.println(harry);
        System.out.println(hermione);
    }
}