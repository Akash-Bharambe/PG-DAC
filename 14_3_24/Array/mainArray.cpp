#include<iostream>
#include"headArray.h"
using namespace std;

int main(){
    MyArray arr(5);
    for (int i = 0; i < 5; i++)
    {
        int value;
        cout<<"Enter value at index "<<i<<" : ";
        cin>>value;
        arr.setAtIndex(i,value);
    }

    for (int i = 0; i < 5; i++)
    {
        cout<<"Value at index "<<i<<" : "<<arr.getAtIndex(i)<<endl;
        
    }
    

    return 0;
}