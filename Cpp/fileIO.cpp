#include <iostream>
#include <fstream>
using namespace std;

class Student
{
private:
    int rollNo;
    string name;
    double mks;

public:
    Student();
    Student(int, string, double);
    friend ostream &operator<<(ostream &, const Student &);
    friend istream &operator>>(istream &, Student &);
};
Student::Student() {}
Student::Student(int rollNo, string name, double mks) : rollNo(rollNo), name(name), mks(mks) {}
ostream &operator<<(ostream &os, const Student &s)
{
    os << "RollNo: " << s.rollNo << " Name: " << s.name << " Marks: " << s.mks << endl;
    return os;
}

istream &operator>>(istream &is, Student &s)
{
    cout << "Enter Roll No: ";
    is >> s.rollNo;
    cout << "Enter Name: ";
    cin.get();
    getline(is, s.name);
    cout << "Enter Marks: ";
    is >> s.mks;
    return is;
}

void inputFunc()
{
    ifstream fin("hello.txt", ios::in);
    Student s;
    fin.read((char *)&s, sizeof(Student));
    cout << s;
    fin.close();
}

void outputFunc(Student &s)
{
    ofstream fout("hello.txt", ios::out);
    cin >> s;
    fout.write((char *)&s, sizeof(Student));
    fout.close();
}

void inputFuncBin()
{
    ifstream fin("hellobin.dat", ios::binary);
    Student s;
    fin.read((char *)&s, sizeof(Student));
    cout << s;
    fin.close();
}

void outputFuncBin(Student &s)
{
    ofstream fout("hellobin.dat", ios::binary);
    cin >> s;
    fout.write((char *)&s, sizeof(Student));
    fout.close();
}

int main()
{
    Student s;
    outputFuncBin(s);
    inputFuncBin();
    return 0;
}
