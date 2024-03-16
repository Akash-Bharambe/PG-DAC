// 44. Modify class Array in assignment – 41 to overload below operators
// 1. Overloaded [] operator - used to get/set array element e.g. arr[4] gives 4 th index element
// 2. Overloaded ! operator - reverses array elements.
// 3. Overload >> - Accepts array size from user. Also accepts elements of array from user.
// 4. Overload << - Displays array.

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
    int &operator[](int);
    void operator!();
    istream& operator>>(int);
    ~Array();
};
// cin>>arr[i]
istream& Array::operator>>(int)
{
    return arr[];
}

int &Array::operator[](int i)
{
    return arr[i];
}

void Array::operator!()
{
    for (int i = 0; i < this->size / 2; i++)
    {
        int temp = arr[i];
        arr[i] = arr[this->size - i - 1];
        arr[this->size - i - 1] = temp;
    }
}

Array::Array()
{
    this->size = 5;
    this->arr = new int[this->size];
    for (int i = 0; i < this->size; i++)
        arr[i] = i;
}

Array::Array(int size)
{
    this->size = size;
    this->arr = new int[this->size];
    for (int i = 0; i < this->size; i++)
        arr[i] = i;
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
    !a;
    a.display();
    a[1] = 5;
    a.display();

    return 0;
}