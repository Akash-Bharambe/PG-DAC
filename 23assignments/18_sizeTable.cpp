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
    charLine('_', 40);
    cout << "\tData type\tSize in Bytes" << endl;
    charLine('_', 40);
    cout << "\tBoolean\t\t\t" << sizeof(bool) << endl;
    charLine('_', 40);
    cout << "\tCharacter\t\t" << sizeof(char) << endl;
    charLine('_', 40);
    cout << "\t  Short\t\t\t" << sizeof(short) << endl;
    charLine('_', 40);
    cout << "\t Integer\t\t" << sizeof(int) << endl;
    charLine('_', 40);
    cout << "\t  Float\t\t\t" << sizeof(float) << endl;
    charLine('_', 40);
    cout << "\t  Double\t\t" << sizeof(double) << endl;
    charLine('_', 40);
    cout << "\t  Long\t\t\t" << sizeof(long) << endl;
    charLine('_', 40);
    cout << "\tInteger Pointer\t\t" << sizeof(int *) << endl;
    charLine('_', 40);
    cout << "\tVoid Pointer\t\t" << sizeof(void *) << endl;
    charLine('_', 40);
    return 0;
}