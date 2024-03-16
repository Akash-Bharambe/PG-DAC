// 36. Implement function “Swap” to swap to integers. Use call by reference.

#include <iostream>
using namespace std;

void swapByRef(int &a, int &b)
{
    a ^= b ^= a ^= b;
}
int main()
{
    int a, b;
    cout << "Enter a: ";
    cin >> a;
    cout << "Enter b: ";
    cin >> b;
    cout<<"Before Swap: \ta: "<<a<<" b: "<<b<<endl;

    swapByRef(a, b);
    cout<<"After Swap: \ta: "<<a<<" b: "<<b<<endl;
    return 0;
}