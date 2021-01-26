package part_04.java;

@FunctionalInterface 
interface Students { 
    void Print(); 
}

public class Application {
    public static void main(String[] args) {
        var matt = new Student("Matt", "1");
        var sarah = new Student("Sarah", "2");
      
        var john = new Trainee() {{
            setName("john");
            setStudentNumber("3");
            setJob("Blacksmith");
            setWage(3000.25f);
        }};

        Student studentPeter = new Trainee("Peter", "123", 30, "Data Scientist", 100);
        Trainee traineePeter = (Trainee)studentPeter;
      
        Students students = () -> {
          matt.Print();
          john.Print();
          sarah.Print();

          studentPeter.Print();
          traineePeter.Print();
        };
      
        students.Print();
      
        john.setName("John");
      
        john.setCredits(6);
        sarah.setCredits(9);
        matt.setCredits(3);
      
        students.Print();
    }
}
