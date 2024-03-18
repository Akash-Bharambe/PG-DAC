#include <iostream>
using namespace std;

int main()
{
    int n;
    cout<<"Enter Number of Characters: ";
    cin>>n;
    cout<<"Enter string: ";
    char arr[n];
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    for (int i = 0; i < n; i++)
    {
        cout<<arr[i];
    }
    
    return 0;
}