#include <iostream>
using namespace std;

void charLine(char ch, int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << ch;
    }
    cout << endl;
}

int main()
{
    charLine('_', 50);
    
    cout << "\tData type\tSize in Bytes" << endl;
    charLine('_', 50);
    cout << "\t Integer\t\t" << sizeof(int) << endl;
    charLine('_', 50);
    cout << "\tCharacter\t\t" << sizeof(char) << endl;
    charLine('_', 50);
    cout << "\t  Float\t\t\t" << sizeof(float) << endl;
    charLine('_', 50);
    return 0;
}