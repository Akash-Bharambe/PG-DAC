// 43. Create objects c1,c2,c3,c4 of class Complex implemented earlier. Overload necessary operators to execute following statements
// a. c3=c1+c2
// b. c3=c1-c2
// c. c2= -c1
// d. c4= ++c1
// e. c4=c1++

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
    Complex(const Complex &);
    void displayData() const;
    int getReal();
    int getImag();
    void setReal(int);
    void setImag(int);
    Complex operator+(const Complex &) const;
    Complex operator-(const Complex &) const;
    Complex operator-();
    Complex operator++(int);
    Complex operator++();
};

Complex Complex::operator-()
{
    Complex temp;
    temp.real = -this->real;
    temp.imag = -this->imag;
    return temp;
}

Complex Complex::operator++()
{
    this->real++;
    this->imag++;
    return *this;
}

Complex Complex::operator++(int)
{
    Complex temp(*this);
    this->setReal(this->getReal() + 1);
    this->setImag(this->getImag() + 1);
    return temp;
}

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

Complex::Complex(const Complex &that)
{
    this->real = that.real;
    this->imag = that.imag;
}
void Complex::displayData() const
{
    char ch = (this->imag >= 0) ? '+' : '-';
    cout << "\n"<< real << " " << ch << " i" << abs(imag) << endl;
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
int main()
{
    Complex c1(2, 3);
    Complex c6 = -c1;
    c6.displayData();
    Complex c2(2,3);
    Complex c3 = c1 + c2;
    c3.displayData();
    c3 = c1 - c2;
    c3.displayData();
    Complex c4 = ++c1;
    c4.displayData();
    Complex c5 = c2++;
    c5.displayData();
    return 0;
}