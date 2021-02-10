package part_02.Areas.Student;

import part_02.Infrastructure.MVP.Model;

public class StudentModel extends Model {
    private String name = "";
    private String studentNumber = "";
    private int credits;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;

        raisePropertyChanged("name", oldName, name);
    }

    public String getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        var oldStudentNumber = this.studentNumber;
        this.studentNumber = studentNumber;

        raisePropertyChanged("studentNumber", oldStudentNumber, studentNumber);
    }

    public int getCredits() {
        return this.credits;
    }

    public void setCredits(int credits) {
        int oldCredits = this.credits;
        this.credits = credits;

        System.out.println("credits set " + credits);

        raisePropertyChanged("credits", oldCredits, credits);
    }
}
