public class Student {
    private String name;
    private String studentNumber;
    private int credits;

    public Student() { }

    public Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public String getStudentNumber() { return this.studentNumber; }
    public void setStudentNumber(String studentNumber) { this.studentNumber = studentNumber; }

    public int getCredits() { return this.credits; }
    public void setCredits(int credits) { this.credits = credits; }

    public void Print() {
        var format = "{ \"name\": \"%s\", \"student_number\":, \"%s\", \"credits\": %d }";
        
        var json = String.format(
            format, 
            this.getName(),
            this.getStudentNumber(),
            this.getCredits());

        System.out.println(json);
    }
}
