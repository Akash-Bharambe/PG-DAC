#include <iostream>
using namespace std;

int main()
{
    int maths, science, marathi, hindi, english;

    cout << "Enter marks Obtained in Maths: ";
    cin >> maths;
    cout << "Enter marks Obtained in Science: ";
    cin >> science;
    cout << "Enter marks Obtained in Marathi: ";
    cin >> marathi;
    cout << "Enter marks Obtained in Hindi: ";
    cin >> hindi;
    cout << "Enter marks Obtained in English: ";
    cin >> english;

    int average = (maths + science + marathi + hindi + english) / 5;

    cout << "Average marks Obtained: " << average << endl;
    return 0;
}