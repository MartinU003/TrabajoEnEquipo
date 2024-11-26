import java.util.ArrayList;

public class College {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Deparment> departments = new ArrayList<>();


    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(Student student) {
        students.remove(student);
    }

    public Student getStudent(int index) {
        return students.get(index);
    }

    public void addDepartment(Deparment department) {
        departments.add(department);
    }

    public void deleteDepartment(Deparment department) {
        departments.remove(department);
    }

    public Deparment getDepartment(int index) {
        return departments.get(index);
    }
}