#include "headComplex.h"
using namespace std;

Complex::Complex(int real, int imag)
{
    this->real = real;
    this->imag = imag;
}

void Complex::acceptData()
{
    cout << "Enter real: ";
    cin >> real;
    cout << "Enter imag: ";
    cin >> imag;
}

void Complex::displayData() const
{
    char ch = (this->imag >= 0) ? '+' : '-';
    cout << real << " " << ch << " i" << abs(imag)<<endl;
}

Complex Complex::operator+(const Complex &that) const
{
    Complex c;
    c.real = this->real + that.real;
    c.imag = this->imag + that.imag;
    return c;
}
Complex Complex::operator-(const Complex &that) const
{
    Complex c;
    c.real = this->real - that.real;
    c.imag = this->imag - that.imag;
    return c;
}