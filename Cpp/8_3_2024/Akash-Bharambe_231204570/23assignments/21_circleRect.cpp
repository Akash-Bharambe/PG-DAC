#include <iostream>
using namespace std;

#define M_PI 3.142

void areaCircum(int *parea, int *pcircum)
{
    int radius;
    cout << "Enter Radius: ";
    cin >> radius;
    *parea = M_PI * radius * radius;
    *pcircum = 2 * M_PI * radius;
}

void areaPeri(int *parea, int *pperi)
{
    int length, breadth;
    cout << "Enter Length: ";
    cin >> length;
    cout << "Enter Breadth: ";
    cin >> breadth;
    *parea = length * breadth;
    *pperi = 2 * (length + breadth);
}

int menu()
{
    int ip;
    cout<<endl;
    cout << "1. Circle" << endl;
    cout << "2. Rectangle" << endl;
    cout << "Enter Choice: ";
    cin >> ip;
    return ip;
}

int main()
{
    int ip;
    int area, peri;
    do
    {
        switch (ip = menu())
        {
        case 1:
            areaCircum(&area, &peri);
            cout<<"Area: "<<area<<endl;
            cout<<"Circum: "<<peri<<endl;
            break;
        case 2:
            areaPeri(&area, &peri);
            cout<<"Area: "<<area<<endl;
            cout<<"Perimeter: "<<peri<<endl;
            break;
        default:
            cout << "Enter Valid input" << endl;
            break;
        }
    } while (ip != 0);

    return 0;
}