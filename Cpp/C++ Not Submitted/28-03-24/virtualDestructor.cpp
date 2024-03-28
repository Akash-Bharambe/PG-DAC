#include <iostream>
using namespace std;

class Base
{
public:
    Base();
    virtual ~Base();
};

Base::Base()
{
    cout << "Base::Base()" << endl;
}

Base::~Base()
{
    cout << "Base::~Base()" << endl;
}

class Derived : public Base
{
private:
    int *p;

public:
    Derived();
    ~Derived();
};

Derived::Derived()
{
    this->p = new int[10];
    cout << "Derived::Derived()" << endl;
}

Derived::~Derived()
{
    cout << "Derived::~Derived()" << endl;
    delete[] p;
}

int main(int argc, char const *argv[])
{
    Base *ptr = new Derived;
    delete ptr;
    return 0;
}
