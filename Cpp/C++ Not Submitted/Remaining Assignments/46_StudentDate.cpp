#include <iostream>
#include <cstring>
using namespace std;

class Date
{
private:
    int dd;
    int mm;
    int yy;

public:
    Date(int, int, int);
    friend ostream &operator<<(ostream &, const Date &);
    friend istream &operator>>(istream &, Date &);
};
Date::Date(int dd, int mm, int yy) : dd(dd), mm(mm), yy(yy) {}

istream &operator>>(istream &is, Date &d)
{
    cout << "Enter Day: ";
    is >> d.dd;
    cout << "Enter Month: ";
    is >> d.mm;
    cout << "Enter Year: ";
    is >> d.yy;
    return is;
}

ostream &operator<<(ostream &os, const Date &d)
{
    os << d.dd << "-" << d.mm << "-" << d.yy << endl;
    return os;
}

class Student
{
private:
    int static cnt;
    int roll_no;
    char *name;
    Date dob;

public:
    Student(int, int, int, char[]);
    friend ostream &operator<<(ostream &, const Student &);
    friend istream &operator>>(istream &, Student &);
    ~Student();
};

int Student::cnt = 1;

Student::Student(int dd, int mm, int yy, char name[]) : dob(dd, mm, yy), roll_no(cnt)
{
    this->name = new char[20];
    strcpy(this->name, name);
    cnt++;
}

istream &operator>>(istream &is, Student &s)
{
    cout<<"Enter Name: ";
    is>>s.name;
    is>>s.dob;
    return is;
}

ostream &operator<<(ostream &os, const Student &s)
{
    os << "RollNo: " << s.roll_no << " Name: " << s.name << " DOB: " << s.dob;
    return os;
}
Student::~Student()
{
    delete[] name;
    name = NULL;
}

int main()
{
    Student s1(26,06,2002,"Akash");
    cout<<s1;
    return 0;
}
