#include <iostream>
using namespace std;

int main()
{
    int n;
    cout<<"Enter count of numbers you want to enter: ";
    cin>>n;
    int arr[n];
    int sum =0;
    cout<<"Enter numbers: ";
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
        sum += arr[i];
    }
    cout<<"Average of ";
    for (int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<": "<<sum/n;
    
    return 0;
}