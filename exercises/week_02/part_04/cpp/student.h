#ifndef STUDENT_H
#define STUDENT_H

#include <string>

class Student {
  private:
    std::string name_;
    std::string student_number_;
    int         credits_;

  public:
    Student();
    Student(std::string name, std::string student_number);
    ~Student();

    std::string name();
    void set_name(std::string);

    std::string student_number();
    void set_student_number(std::string);

    int credits();
    void set_credits(int);

    virtual void Print();
};

#endif
