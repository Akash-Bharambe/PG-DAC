#include<iostream>
#include<cmath>
using namespace std;
int main(){
	int a,b,c;
	cout<<"Enter a: "<<endl;
	cin>>a;
	cout<<"Enter b: "<<endl;
	cin>>b;	
	cout<<"Enter c: "<<endl;
	cin>>c;


        int i = sqrt(b*b -4 * a * c);
	int x= (-b+i)/2*a;

        int y= (-b-i)/2*a;
	cout<<x<<endl;
	cout<<y<<endl;
	return 0;
}
