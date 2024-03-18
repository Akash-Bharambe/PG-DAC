// 35. Write a program to accept marks of a student in ‘n’ subjects.
// Allocate the space for the array of marks dynamically.
// Display average of marks. Use cin, cout, new, delete.

#include <iostream>
using namespace std;

float average(int *p, int n)
{
    float avg = 0.0f;
    for (int i = 0; i < n; i++)
        avg += p[i];
    return avg / n;
}

int main()
{
    int n;
    cout << "Enter Number of Subjects: ";
    cin >> n;

    int *p = new int[n];

    for (int i = 0; i < n; i++)
    {
        cout << "Enter marks of Subject " << i + 1 << ": ";
        cin >> p[i];
    }

    cout << "Average: " << average(p, n) << endl;
    delete[] p;
    return 0;
}