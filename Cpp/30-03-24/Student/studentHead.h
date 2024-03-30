#ifndef STUDENT_HEAD
#define STUDENT_HEAD
#include "cretificateHead.h"
#include "addrHead.h"
#include<stdexcept>

class Student
{
private:
    string name;
    int roll;
    Address addr;
    Certificate certi;

public:
    Student();
    Student(string name, int roll);
    Student(string name, int roll, int flatNumber, string area, string pinCode, string certiName, int certiNumber, string issuingAuth);
    void accept();
    void display();
};

class NegativeRollException : public runtime_error
{
private:
    string msg;
public:
    NegativeRollException(string);
    string what();
    ~NegativeRollException() throw();
};

#endif