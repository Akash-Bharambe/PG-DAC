#include <iostream>
using namespace std;

void copyArray(char arr[], char arr1[])
{
    for (int i = 0; arr[i] != '\0'; i++)
        arr1[i] = arr[i];
}

void printArray(char arr[])
{
    for (int i = 0; arr[i] != '\0'; i++)
        cout << arr[i];
}

void acceptArray(char arr[],int size)
{
    cout << "Enter a String: ";
    cin.getline(arr,size);
}

int main()
{
    const int size = 20;
    char arr[size];
    char arr1[size];
    
    acceptArray(arr,size);
    copyArray(arr, arr1);

    cout << "arr: ";
    printArray(arr);
    cout << "\nCopy of arr: ";
    printArray(arr1);
    return 0;
}