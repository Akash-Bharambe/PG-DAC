// 26. Write a program to insert an element into an array.
//     Accept position of element to be inserted from user.

#include <iostream>
using namespace std;

void acceptArray(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        cout << "Enter element at index " << i << ": ";
        cin >> arr[i];
    }
}

void displayArray(int arr[], int size)
{
    for (int i = 0; i < size; i++)
        cout << arr[i] << " ";
    cout << endl;
}


void insertAtPosition(int indexAdd, int value, int arr[], int size) {
    for (int i = size - 1; i >= indexAdd; i--)
        arr[i + 1] = arr[i];
    arr[indexAdd] = value;
}

int main()
{
    int size;
    cout << "Enter Size of Array: ";
    cin >> size;
    int arr[size + 1];
    int indexAdd, value;
    acceptArray(arr, size);
    cout << "Array Before Insertion: " << endl;
    displayArray(arr, size);
    do
    {
        cout << "\nIndex to Add: ";
        cin >> indexAdd;
        cout << "\nEnter value to insert: ";
        cin >> value;
    } while (indexAdd > size || indexAdd < 0);
    size++;
    insertAtPosition(indexAdd, value, arr, size);
    cout << "Array After Insertion: " << endl;
    displayArray(arr, size);
    return 0;
}