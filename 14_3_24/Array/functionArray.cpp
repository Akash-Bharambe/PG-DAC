#include "headArray.h"
MyArray::MyArray(int size)
{
    this->size = size;
    p = new int[size];
}

int MyArray::getAtIndex(int index)
{
    return p[index];
}
void MyArray::setAtIndex(int index, int value)
{
    p[index] = value;
}

MyArray::~MyArray()
{
    delete[] p;
}
