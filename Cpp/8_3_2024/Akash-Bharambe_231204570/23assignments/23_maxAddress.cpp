#include <iostream>
using namespace std;

int *maxi(int *a, int *b)
{
    return *a > *b ? a : b;
}

int main()
{
    int a, b;
    cout << "Enter a: ";
    cin >> a;
    cout << "Enter b: ";
    cin >> b;

    cout << "Address of a: " << &a << endl;
    cout << "Address of b: " << &b << endl;

    cout <<"Maximum Number's Address is: "<< maxi(&a, &b);

    return 0;
}