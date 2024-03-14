#ifndef HEADARRAY_H
#define HEADARRAY_H
class MyArray
{
private:
    int size;
    int *p;

public:
    MyArray(int size);
    int getAtIndex(int index);
    void setAtIndex(int index, int value);
    ~MyArray();
};
#endif