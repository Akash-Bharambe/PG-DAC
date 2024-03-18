#include <iostream>
using namespace std;

class Complex
{
private:
    int real;
    int imag;

public:
    Complex()
    {
        this->real = 0;
        this->imag = 0;
    }
    void accept()
    {
        cout << "Enter real: ";
        cin >> this->real;
        cout << "Enter imag: ";
        cin >> this->imag;
    }

    void display() const
    {
        cout << this->real << " + i(" << this->imag << ")";
    }
};

// Object and Member Function both Constant
int main()
{
    const Complex c;
    c.display(); //Allowed
    return 0;
}
