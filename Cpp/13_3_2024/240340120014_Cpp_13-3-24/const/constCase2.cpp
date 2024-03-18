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

    void display()
    {
        cout << this->real << " + i(" << this->imag << ")";
    }
};

// Object Constant, Member Function non constant
int main()
{
    const Complex c;
    //c.accept(); //Not Allowed
    //c.display(); //Not Allowed
    return 0;
}
