public class Course {
    private Subject subject;
    private Teacher teacher;
    private DynamicArray students;
    //private TeachingMaterial[] materials;

    public String toString(){
        return subject + ", teacher: " + teacher + ", students: " + students;
    }

    public Course(Subject subject, Teacher teacher){
        this.subject = subject;
        this.teacher = teacher;
        this.students = new DynamicArray();
    }

    public boolean addStudent(Student student){
        if (students.size() < 12) {
            students.add(student);
            return true;
        }
        return false;
    }

    public Subject getSubject(){
        return subject;
    }

    public void setSubject(Subject subject){
        this.subject = subject;
    }

    public Teacher getTeacher(){
        return teacher;
    }

    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    public DynamicArray getStudents(){
        return students;
    }
}
