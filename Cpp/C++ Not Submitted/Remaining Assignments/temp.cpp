#include <iostream>
using namespace std;

int main()
{
    int a = 10, b = 20;

    // Swap the values of a and b using the XOR bitwise operator
    a ^= b ^= a ^= b;

    // Print the values of a and b after swapping
    cout << "a = " << a << ", b = " << b << endl;
    return 0;
}