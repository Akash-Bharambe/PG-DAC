// Create an array of student, Accept student objects from user, write the student objects in a binary file, read student object from Binary file.
#include "functions.h"
#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    char fileName[20];
    Student s;
    cout << "Enter File Name: ";
    cin.getline(fileName, 20);

    ifstream fin(fileName, ios::in | ios::binary);
    ofstream fout(fileName, ios::out | ios::binary);

    Utils::writerr(fout, s);
    Utils::readerr(fin, s);
    return 0;
}