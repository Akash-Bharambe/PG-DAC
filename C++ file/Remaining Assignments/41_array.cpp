// 41. Write a class Array which will store integer elements in dynamically allocated space.

// class Array
// {
//      int size;
//      int *arr;
// }
// Provide below functions in Array class -
// 1. Default constructor - Take 5 as default size. Initialize the array elements to 0
// 2. Parameterized constructor - Takes size as parameter. Initialize the array elements to 0.
// 3. Copy constructor - Performs deep copy of Array object.
// 4. Destructor - Deletes memory which is allocated dynamically.

#include <iostream>
using namespace std;

class Array
{
private:
    int size;
    int *arr;

public:
    Array();
    Array(int size);
    Array(const Array &that);
    void display() const;
    ~Array();
};

Array::Array()
{
    this->size = 5;
    this->arr = new int[this->size];
    for (int i = 0; i < this->size; i++)
        arr[i] = 0;
}

Array::Array(int size)
{
    this->size = size;
    this->arr = new int[this->size];
    for (int i = 0; i < this->size; i++)
        arr[i] = 0;
}

Array::Array(const Array &that)
{
    this->size = that.size;
    this->arr = new int[this->size];
    for (int i = 0; i < this->size; i++)
        this->arr[i] = that.arr[i];
}

void Array::display() const
{
    for (int i = 0; i < this->size; i++)
        cout << arr[i] << " ";
    cout << endl;
}

Array::~Array()
{
    delete[] arr;
}

int main()
{
    Array a(10);
    Array b(a);
    b.display();

    return 0;
}