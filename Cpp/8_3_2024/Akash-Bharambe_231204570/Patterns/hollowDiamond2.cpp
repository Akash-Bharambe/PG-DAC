#include<iostream>
using namespace std;
int main(){
        for(int i = 1; i<=5;i++){
                for(int j = i; j<6;j++){
                        cout<<"*";
                }
                for(int k = 1; k<=2*i-2;k++){
                        cout<<" ";
                }
                for(int j = 6; j>i;j--){
                        cout<<"*";
                }
                cout<<endl;
        }
        for(int i = 4; i>=1;i--){
                for(int j = i; j<6;j++){
                        cout<<"*";
                }
                for(int k = 1; k<=2*i-2;k++){
                        cout<<" ";
                }
                for(int j = 6; j>i;j--){
                        cout<<"*";
                }
                cout<<endl;
        }


        return 0;
}

