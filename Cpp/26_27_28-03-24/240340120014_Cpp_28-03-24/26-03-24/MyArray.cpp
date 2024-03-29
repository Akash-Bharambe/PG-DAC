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
    Array(int);
    Array(const Array &);
    int &operator[](int);
    void operator!();
    bool operator==(Array &);
    bool operator!=(Array &that);
    friend istream &operator>>(istream &, Array &);
    friend ostream &operator<<(ostream &, const Array &);
    ~Array();
};

bool Array::operator==(Array &that)
{
    int key = 0;
    if (this->size != that.size)
        return false;

    for (int i = 0; i < size; i++)
    {
        if (this->arr[i] == that.arr[i])
            key++;
    }
    return key == size ? true : false;
}

bool Array::operator!=(Array &that)
{
    return !((*this) == that);
}

// cin>>arr[i]
istream &operator>>(istream &is, Array &a)
{
    for (int i = 0; i < a.size; i++)
    {
        cout << "Enter element at index " << i << ": ";
        is >> a.arr[i];
    }
    return is;
}

ostream &operator<<(ostream &os, const Array &a)
{
    for (int i = 0; i < a.size; i++)
        os << a.arr[i] << " ";
    return os;
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

Array::~Array()
{
    delete[] arr;
}

int main()
{
    Array a;
    cin >> a;
    Array b = a;
    b[0] = 10;
    if (a != b)
        cout << "Not Equal";
    else
        cout << "Equal";
    return 0;
}