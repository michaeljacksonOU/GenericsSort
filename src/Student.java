public class Student implements Comparable<Student> {
    private String name;
    private int grade;

    public Student(int grade) {
        this.grade = grade;
    }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grade "+ grade;
    }
    @Override
    public int compareTo(Student other) {
        return this.grade - other.grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public int getGrade() {
        return grade;
    }
    
}
