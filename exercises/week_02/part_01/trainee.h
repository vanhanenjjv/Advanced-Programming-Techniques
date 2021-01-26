#ifndef TRAINEE_H
#define TRAINEE_H

#include "student.h"

class Trainee : public Student {
  private:
    float wage_;
    std::string job_;

  public:
    Trainee();
    Trainee(std::string name, std::string student_number, int credits, std::string job, float wage);
    float wage();
    void set_wage(float);
    std::string job();
    void set_job(std::string);
    void Print();
};

#endif
