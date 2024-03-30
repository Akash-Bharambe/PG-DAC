// Create an array of student, Accept student objects from user, write the student objects in a binary file, read student object from Binary file.
#include "functions.h"
#include <iostream>
using namespace std;

int main()
{
    char fileName[20];
    cout << "Enter File Name: ";
    cin.getline(fileName, 20);
    int size;
    cout << "Enter number of students you want to add: ";
    cin >> size;
    Student s[10];

    int ch, i = 0;
    while ((ch = Utils::menulist()) != 0)
    {
        switch (ch)
        {
        case 1:
            try
            {
                Utils::writerr(fileName, s[i]);
                i++;
            }
            catch (FileNotOpenedException e)
            {
                cerr << e.what() << endl;
            }
            break;
        case 2:
            try
            {
                Utils::readerr(fileName, *s);
            }
            catch (FileNotOpenedException e)
            {
                std::cerr << e.what() << endl;
            }
            break;
        default:
            cout << "Please Enter a valid Choice" << endl;
            break;
        }
    }

    return 0;
}