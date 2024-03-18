#include <string>
using namespace std;

#define SIZE 3
class Student
{
private:
    int rollNo;
    string name;
    int marks;

public:
    Student();
    Student(int, string, int);
    int getRollNo();
    string getName();
    int getMarks();
    void acceptData();
    void displayData();
    ~Student();
};

void sortName(Student[]);
void sortMarks(Student[]);
void sortRollNo(Student[]);
void findStudent(Student[]);
int menuList();