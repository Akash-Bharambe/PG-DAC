#ifndef STUDENT_HEAD
#define STUDENT_HEAD
#include <string>
#include <vector>
using namespace std;
class Student
{
private:
    string name;
    int roll;

public:
    Student();
    Student(string, int);
    int getRoll();
    void setName(string);
    void accept();
    void display();
};

int menulist();
void acceptStudent(vector<Student> &);
void displayStudents(vector<Student> &);
void renameStudent(vector<Student> &);
void findStudent(vector<Student> &);
void sortStudent(vector<Student> &);
#endif