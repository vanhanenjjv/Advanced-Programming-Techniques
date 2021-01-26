package part_02;

public class Trainee extends Student {
    private String job;
    private float wage;

    public Trainee() {}

    public Trainee(String name, String studentNumber, int credits, String job, float wage) {
        super(name, studentNumber);
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public float getWage() {
        return this.wage;
    }

    public void setWage(float wage) {
        this.wage = wage;   
    }

    public void Print() {
        var format = "{ \"name\": \"%s\", \"student_number\": \"%s\", "
                   + "\"credits\": %d, \"job\": \"%s\", \"wage\": %f }";
        
        var json = String.format(
            format, 
            this.getName(),
            this.getStudentNumber(),
            this.getCredits(),
            this.getJob(),
            this.getWage());

        System.out.println(json);
    }
}
