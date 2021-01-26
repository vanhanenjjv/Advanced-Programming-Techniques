#include "trainee.h"

#include <iostream>

Trainee::Trainee() {
  this->set_job("");
  this->set_wage(0);
}

Trainee::Trainee(std::string name, std::string student_number, int credits, std::string job, float wage) {
  this->set_name(name);
  this->set_student_number(student_number);
  this->set_credits(credits);
  this->set_job(job);
  this->set_wage(wage);
}

std::string Trainee::job() { return this->job_; }
void Trainee::set_job(std::string job) { this->job_ = job; }

float Trainee::wage() { return this->wage_; }
void Trainee::set_wage(float wage) { this->wage_ = wage; }

void Trainee::Print() {
  std::cout << "{ "
            << "\"name\": "           << "\"" << this->name()           << "\", "
            << "\"student_number\": " << "\"" << this->student_number() << "\", "
            << "\"credits\": "        << this->credits()                << ", "
            << "\"job\": "            << "\"" << this->job()            << "\", "
            << "\"wage\": "           << this->wage()                 
            << " }\n";
}
