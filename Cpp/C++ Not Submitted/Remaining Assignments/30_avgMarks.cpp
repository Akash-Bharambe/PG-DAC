// 30. Write a program that calculates the average marks of all the subjects.
//     The number of subjects ‘n’ is accepted from the user.
//     Allocate memory dynamically for ‘n’ integers. Free the memory when not in use.

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