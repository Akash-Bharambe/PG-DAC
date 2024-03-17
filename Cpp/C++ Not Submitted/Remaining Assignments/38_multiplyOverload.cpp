// 38. Write a single function “Multiply” to multiply two or three or four integers passed depending on call. Use default value arguments.

#include <iostream>
using namespace std;

int multiply(int a, int b, int c = 1, int d = 1)
{
    return a * b * c * d;
}

int main()
{
    int a, b, c, d;
    cout << "Enter a: ";
    cin >> a;
    cout << "Enter b: ";
    cin >> b;
    cout << "Enter c: ";
    cin >> c;
    cout << "Enter d: ";
    cin >> d;

    cout << a << " * " << b << " * " << " = " << multiply(a, b) << endl;
    cout << a << " * " << b << " * " << c << " = " << multiply(a, b, c) << endl;
    cout << a << " * " << b << " * " << c << " * " << d << " = " << multiply(a, b, c, d) << endl;
    return 0;
}