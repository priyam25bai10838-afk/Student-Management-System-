import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Student findStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id)
                return s;
        }
        return null;
    }

    public void deleteStudent(int id) {
        Student s = findStudent(id);

        if (s != null) {
            students.remove(s);
        }
    }
}