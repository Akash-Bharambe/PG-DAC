#include <iostream>
using namespace std;

int main()
{
    char ch;
    cout << "Enter a character: ";
    cin >> ch;
    int n = ch;

    if (n >= 65 && n <= 90)
        cout << ch << " is Capital letter";
    else if (n >= 97 && n <= 122)
        cout << ch << " is Small letter";
    return 0;
}