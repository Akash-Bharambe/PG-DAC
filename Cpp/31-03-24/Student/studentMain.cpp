#include "studentHead.h"
#include <iostream>
using namespace std;

int main()
{
    vector<Student> vStudent;
    int ch;
    while ((ch = menulist()) != 0)
    {
        switch (ch)
        {
        case 1:
            acceptStudent(vStudent);
            break;
        case 2:
            displayStudents(vStudent);
            break;
        case 3:
            findStudent(vStudent);
            break;
        case 4:
            sortStudent(vStudent);
            displayStudents(vStudent);
            break;
        case 5:
            renameStudent(vStudent);
            break;
        default:
            break;
        }
    }

    return 0;
}