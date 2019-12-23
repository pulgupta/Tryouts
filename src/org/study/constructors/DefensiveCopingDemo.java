package org.study.constructors;

class ProtectedData {

    private final Student student;

    public ProtectedData(Student student) {
        this.student = student;
    }

    public String getStudentName() {
        return student.getName();
    }
}

class ProtectedDataCorrect {

    private final Student student;

    public ProtectedDataCorrect(Student student) {
        this.student = new Student(student.getName());
    }

    public String getStudentName() {
        return student.getName();
    }
}

public class DefensiveCopingDemo {
    public static void main(String[] args) {
        Student student = new Student("Tom");
        ProtectedData protectedData = new ProtectedData(student);
        System.out.println(protectedData.getStudentName());
        student.setName("Jerry");
        System.out.println(protectedData.getStudentName());

        Student student1 = new Student("Tom1");
        ProtectedDataCorrect protectedDataCorrect = new ProtectedDataCorrect(student1);
        System.out.println(protectedDataCorrect.getStudentName());
        student.setName("Jerry1");
        System.out.println(protectedDataCorrect.getStudentName());
    }
}
