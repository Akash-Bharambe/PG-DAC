#include<iostream>
using namespace std;
int main(){
	int input;
	cout<<"Enter any number"<<endl;
	cin>>input;
	if(input %2 ==0){
		cout<<"not prime"<<endl;}
	else{
	for(int i =3; i<input;i+=2){
		if(input % i ==0){
			cout<<"not prime"<<endl;}
		else{
			cout<<"prime"<<endl;}
	}
	}
	return 0;
}

