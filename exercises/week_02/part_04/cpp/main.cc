#include "student.h"
#include "trainee.h"

int main() {
  Student matt("Matt", "1");

  auto sarah = new Student("Sarah", "2");

  Trainee john;
  john.set_name("john");
  john.set_student_number("3");
  john.set_wage(3000.25f);
  john.set_job("Blacksmith");

  Student *student_peter = new Trainee("Peter", "123", 30, "Data Scientist", 100);
  Trainee *trainee_peter = (Trainee *)student_peter;

  auto print_students = [&]{
    matt.Print();
    john.Print();
    sarah->Print();
    student_peter->Print();
    trainee_peter->Print();
  };

  print_students();

  john.set_name("John");

  john.set_credits(6);
  sarah->set_credits(9);
  matt.set_credits(3);

  print_students();

  delete sarah;
}
