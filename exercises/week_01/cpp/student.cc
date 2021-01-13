#include "student.h"

#include <iostream>

Student::Student() {
  this->set_credits(0);
}

Student::Student(std::string name, std::string student_number) {
  this->set_name(name);
  this->set_student_number(student_number);
  this->set_credits(0);
}

std::string Student::name() { return this->name_; }
void Student::set_name(std::string name) {
  this->name_ = name;
}

std::string Student::student_number() { return this->student_number_; }
void Student::set_student_number(std::string student_number) {
  this->student_number_ = student_number;
}

int Student::credits() { return this->credits_; }
void Student::set_credits(int credits) {
  this->credits_ = credits;
}

void Student::Print() {
  std::cout << "{ "
            << "\"name\": "           << "\"" << this->name() << "\", "
            << "\"student_number\": " << "\"" << this->student_number() << "\", "
            << "\"credits\": "        << this->credits()
            << " }\n";
}
