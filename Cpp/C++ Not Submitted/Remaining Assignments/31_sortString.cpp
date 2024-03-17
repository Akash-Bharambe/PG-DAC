// 31. Write a program to sort five user entered strings into alphabetical order. //
//  Use dynamic memory allocation to store strings.

#include <iostream>
#include <string>
using namespace std;

void sortString(string *p)
{
    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            if (p[i] < p[j])
            {
                string temp = p[i];
                p[i] = p[j];
                p[j] = temp;
            }
        }
    }
}

void accept(string *p)
{
    for (int i = 0; i < 5; i++)
    {
        cout << "Enter String " << i + 1<<": ";
        cin >> p[i];
    }
}

void display(string *p)
{
    for (int i = 0; i < 5; i++)
        cout << p[i] << endl;
}

int main()
{
    string *p = new string[5];
    accept(p);
    sortString(p);
    display(p);
    delete[] p;
    return 0;
}