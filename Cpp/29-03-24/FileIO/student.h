#ifndef STUDENT_H
#define STUDENT_H
#include <fstream>
using namespace std;
class Student
{
private:
    char name[20];
    int rollno;

public:
    Student();
    Student(int, char[]);
    void accept();
    void display() const;
};

#endif