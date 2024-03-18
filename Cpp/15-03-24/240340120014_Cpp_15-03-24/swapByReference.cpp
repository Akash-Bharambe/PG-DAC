#include <iostream>
using namespace std;

void swap(int &ra, int &rb)
{
    ra = ra ^ rb;
    rb = ra ^ rb;
    ra = ra ^ rb;
}
void swap(float &ra, float &rb)
{
    float temp = ra;
    ra = rb;
    rb = temp;
}

void accept(int &ra, int &rb)
{
    cout << "Enter value of a: ";
    cin >> ra;
    cout << "Enter value of b: ";
    cin >> rb;
}
void accept(float &ra, float &rb)
{
    cout << "Enter value of a: ";
    cin >> ra;
    cout << "Enter value of b: ";
    cin >> rb;
}

void display(int &ra, int &rb)
{
    cout << "a: " << ra << endl;
    cout << "b: " << rb << endl;
}
void display(float &ra, float &rb)
{
    cout << "a: " << ra << endl;
    cout << "b: " << rb << endl;
}

int main()
{
    int a, b;
    accept(a, b);
    cout << "Before Swap" << endl;
    display(a, b);
    swap(a, b);
    cout << "After Swap" << endl;
    display(a, b);
    
    float fa, fb;
    accept(fa, fb);
    cout << "Before Swap" << endl;
    display(fa, fb);
    swap(fa, fb);
    cout << "After Swap" << endl;
    display(fa, fb);

    return 0;
}
