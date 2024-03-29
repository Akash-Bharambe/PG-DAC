#include "stringHead.h"
#include <iostream>
using namespace std;

String::String(char ch[]) : size(10)
{
    this->p = new char[size];
}

String::String(int size, const char *ch) : size(size)
{
    this->p = new char[this->size];
    for (int i = 0; i < this->size; i++)
        this->p[i] = ch[i];
}

String::String(const String &s) : size(s.size)
{
    this->p = new char[this->size];
    for (int i = 0; i < this->size; i++)
        this->p[i] = s.p[i];
}

void String::display() const
{
    for (int i = 0; i < this->size; i++)
        cout << this->p[i];
    cout << endl;
}

String::~String()
{
    cout << "DTOR" << endl;
    delete[] p;
}
