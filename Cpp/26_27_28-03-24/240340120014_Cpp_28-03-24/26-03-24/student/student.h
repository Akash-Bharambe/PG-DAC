#include<string>
using namespace std;
class Student{
    private:
    int rollno;
    int marks;
    string name;

    public :
    Student();
    Student(int ,int ,string );
    int getRollno();
    int getMarks();
    string getName();
    void accept();
    void display();
    friend istream& operator>>(istream &is, Student &s);
    friend ostream& operator<<(ostream &os, Student &s);
    
};
void sortRollno(Student[],int);
void sortMarks(Student [],int );
void sortName(Student student[],int size);
