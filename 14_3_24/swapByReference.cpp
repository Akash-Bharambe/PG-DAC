#include <iostream>
using namespace std;

void swap(int &ra, int &rb)
{
    ra = ra ^ rb;
    rb = ra ^ rb;
    ra = ra ^ rb;
}

void accept(int &ra, int &rb)
{
    cout << "Enter value of a: ";
    cin >> ra;
    cout << "Enter value of b: ";
    cin >> rb;
}

void display(int &ra, int &rb)
{
    cout << "a: " << ra << endl;
    cout << "b: " << rb << endl;
}

int main()
{
    int a, b;
    accept(a, b);
    cout << "Before Swap" << endl;
    display(a, b);
    swap(a, b);
    cout << "After Swap" << endl;
    display(a, b);

    return 0;
}
