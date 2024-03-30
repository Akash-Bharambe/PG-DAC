#include "functions.h"
#include <iostream>
using namespace std;
int Utils::menulist()
{
    int ip;
    cout << "1. Add Student" << endl;
    cout << "2. Display Student" << endl;
    cout << "0. Exit" << endl;
    cin >> ip;
    return ip;
}

void Utils::readerr(char fileName[], const Student &s)
{
    ifstream fin(fileName, ios::in | ios::binary);

    if (!fin)
    {
        cerr << "File Cannot be Opened" << endl;
        throw FileNotOpenedException("File Cannot Be Opened...");
    }
    while (fin.read((char *)&s, sizeof(Student)))
    {
        s.display();
    }
    fin.close();
}

void Utils::writerr(char fileName[], Student &s)
{
    ofstream fout(fileName, ios::app | ios::binary);
    if (!fout)
    {
        cerr << "File Cannot be Opened" << endl;
        throw FileNotOpenedException("File Cannot Be Opened...");
    }
    s.accept();
    fout.write((char *)&s, sizeof(Student));
    fout.close();
}

FileNotOpenedException::FileNotOpenedException(string x) : message(x), runtime_error(x) {}

string FileNotOpenedException::what()
{
    return message;
}

FileNotOpenedException::~FileNotOpenedException() throw() {}