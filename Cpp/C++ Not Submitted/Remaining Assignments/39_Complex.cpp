// 39. Implement class Complex with real (int) and imaginary (int) parts as data members of class.
// Implement below functions inside this class.
// default constructor, parameterized constructor, getter functions for real and imaginary parts, setter functions for real and imaginary parts, display function.

#include <iostream>
using namespace std;

class Complex
{
private:
    int real;
    int imag;

public:
    Complex();
    Complex(int, int);
    void displayData() const;
    int getReal();
    int getImag();
    void setReal(int real);
    void setImag(int imag);
};

Complex::Complex()
{
    this->real = 0;
    this->imag = 0;
}

Complex::Complex(int real, int imag)
{
    this->real = real;
    this->imag = imag;
}

void Complex::displayData() const
{
    char ch = (this->imag >= 0) ? '+' : '-';
    cout << real << " " << ch << " i" << abs(imag) << endl;
}

int Complex::getReal()
{
    return this->real;
}
int Complex::getImag()
{
    return this->imag;
}
void Complex::setReal(int real)
{
    this->real = real;
}
void Complex::setImag(int imag)
{
    this->imag = imag;
}

int main()
{
    Complex c1(2, 3);
    Complex c2(5, -5);
    c1.displayData();
    c2.displayData();
    return 0;
}