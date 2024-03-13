#include<iostream>
#include"copyHead.h"
using namespace std;
int main(){
    int n;
cout<<"enter the size of array: "<<endl;
cin>>n;
char arr[n];
char arr1[n];
acceptchar(arr,n);
copyarray(arr,arr1);
printarray(arr1);

return 0;
}