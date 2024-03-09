#include <iostream>
using namespace std;

int main()
{
    char ch;
    cout << "Enter Character: ";
    cin >> ch;
    int n = ch;

    if (ch >= 65 && ch <= 90)
    {
        n += 32;
        ch = (char)n;
        cout << ch;
    }
    else if (ch >= 97 && ch <= 122)
    {
        n -= 32;
        ch = (char)n;
        cout << ch;
    }
    else
        cout << "Entered Value is not an Alphabet";
    return 0;
}