#ifndef STUDENT_H
#define STUDENT_H

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