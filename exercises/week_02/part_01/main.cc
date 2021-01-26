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

  auto print_students = [&]{
    matt.Print();
    john.Print();
    sarah->Print();
  };

  print_students();

  john.set_name("John");

  john.set_credits(6);
  sarah->set_credits(9);
  matt.set_credits(3);

  print_students();

  delete sarah;
}
