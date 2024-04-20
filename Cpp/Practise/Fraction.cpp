#include <iostream>
using namespace std;

class Fraction
{
private:
    int nume;
    int deno;

public:
    Fraction();
    Fraction(int, int);
    Fraction(const Fraction &);
    static void reduced(Fraction &);
    Fraction operator+(const Fraction &) const;
    Fraction operator-(const Fraction &) const;
    Fraction operator*(const Fraction &) const;
    Fraction operator/(const Fraction &) const;
    friend ostream &operator<<(ostream &, const Fraction &);
    ~Fraction();
};
Fraction::Fraction() : nume(1), deno(1) {}
Fraction::Fraction(int nume, int deno) : nume(nume), deno(deno) {}
Fraction::Fraction(const Fraction &that): nume(that.nume), deno(that.deno) {}

ostream &operator<<(ostream &os, const Fraction &temp)
{
    if (temp.deno != 1)
        os << temp.nume << "/" << temp.deno;
    else
        os << temp.nume;
    return os;
}

void Fraction::reduced(Fraction &temp)
{
    int a = temp.nume, b = temp.deno;
    if (a == 0 || b == 0)
    {
        temp.nume = 0;
        temp.deno = 1;
        return;
    }
    a = abs(a);
    b = abs(b);
    while (b != 0)
    {
        int t = b;
        b = a % b;
        a = t;
    }

    temp.nume = temp.nume / a;
    temp.deno = temp.deno / a;
    
    if (temp.deno < 0)
    {
        temp.nume = -temp.nume;
        temp.deno = -temp.deno;
    }
}

Fraction Fraction::operator+(const Fraction &s) const
{
    Fraction temp;
    temp.nume = (this->nume * s.deno) + (this->deno * s.nume);
    temp.deno = this->deno * s.deno;
    reduced(temp);
    return temp;
}

Fraction Fraction::operator-(const Fraction &s) const
{
    Fraction temp;
    temp.nume = (this->nume * s.deno) - (this->deno * s.nume);
    temp.deno = this->deno * s.deno;
    reduced(temp);
    return temp;
}

Fraction Fraction::operator*(const Fraction &s) const
{
    Fraction temp;
    temp.nume = this->nume * s.nume;
    temp.deno = this->deno * s.deno;
    reduced(temp);
    return temp;
}

Fraction Fraction::operator/(const Fraction &s) const
{
    Fraction temp;
    temp.nume = this->nume * s.deno;
    temp.deno = this->deno * s.nume;
    reduced(temp);
    return temp;
}

Fraction::~Fraction() {}

int main()
{
    Fraction f1(3, 2), f2(3, 3);
    Fraction f3 = f1 + f2;
    cout << f3 << endl;
    f3 = f1 - f2;
    cout << f3 << endl;
    f3 = f1 * f2;
    cout << f3 << endl;
    f3 = f1 / f2;
    cout << f3 << endl;

    return 0;
}