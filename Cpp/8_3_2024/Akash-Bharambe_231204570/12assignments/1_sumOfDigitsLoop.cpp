#include<iostream>
using namespace std;
int main(){
	int input;
	int sum =0;
	cout<<"Enter 4 digit Number: ";
	cin>>input;
	while(input != 0){
		sum += input % 10;
		input /= 10;
	}
	cout<<sum<<endl;
	return 0;
}
