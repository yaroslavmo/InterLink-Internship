package institution;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class University extends MassKnowledgeSource implements KnowledgeSource {
    private String name;

    public University(String name) {
        super(name);
        this.studentsList = new ArrayList<>();
        super.practicalKnowledge = 5;
        super.theoryKnowledge = 10;
    }

    public University(String name, double practicalKnowledge, double theoryKnowledge ) {
        super(name);
        this.studentsList = new ArrayList<>();
        super.practicalKnowledge = practicalKnowledge;
        super.theoryKnowledge = theoryKnowledge;
    }



    public void addStudent(Student student) {
        studentsList.add(student);
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

}
