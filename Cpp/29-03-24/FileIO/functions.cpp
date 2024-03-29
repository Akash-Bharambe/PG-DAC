#include "functions.h"
#include <iostream>
#include <fstream>
using namespace std;
int Utils::menulist()
{
    return 0;
}

void Utils::readerr(ifstream &fin, const Student &s)
{
    if (!fin)
    {
        cerr << "File Cannot be Opened" << endl;
        exit(-1);
    }
    while (fin.read((char *)&s, sizeof(Student)))
    {
        s.display();
    }
    fin.close();
}

void Utils::writerr(ofstream &fout, Student &s)
{
    if (!fout)
    {
        cerr << "File Cannot be Opened" << endl;
        exit(-1);
    }
    char ch;
    do
    {
        s.accept();
        fout.write((char *)&s, sizeof(Student));
        cout << "Do you Wish to Continue (y/n): ";
        cin >> ch;
        cin.get();
    } while (ch != 'n');
    fout.close();
}
