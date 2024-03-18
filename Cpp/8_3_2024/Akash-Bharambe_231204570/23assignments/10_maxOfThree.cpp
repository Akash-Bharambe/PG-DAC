#include <iostream>
using namespace std;

int main()
{
    int a, b, c;
    cout << "Enter a: ";
    cin >> a;
    cout << "Enter b: ";
    cin >> b;
    cout << "Enter c: ";
    cin >> c;

    int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
    cout << "Maximum: " << max;
    return 0;
}