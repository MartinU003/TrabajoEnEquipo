import java.util.ArrayList;

public class Deparment {
    private String name;
    private ArrayList<Professor> professors = new ArrayList<>();

    public void addProfessor(Professor professor){
        professors.add(professor);

    }

    public void deleteProfessor(Professor professor){
        professors.remove(professor);

    }

    public Professor getProfessor(int index) {
        return professors.get(index);
    }



}
