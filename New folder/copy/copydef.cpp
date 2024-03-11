#include<iostream>
#include"copyHead.h"

using namespace std;

void acceptchar(char arr[],int n){
    cout<<"enter the string "<<endl;
    cin.get();
    cin.getline(arr,n);
}
void copyarray(char arr[],char arr1[]){
      int i;
      for( i=0;arr[i]!='\0';i++){
        arr1[i]=arr[i];
      }
        arr1[i]='\0';

}

void printarray(char arr1[]){
      for(int i=0;arr1[i]!='\0';i++){
        cout<<arr1[i];
    }
}
