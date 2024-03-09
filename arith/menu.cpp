#include<iostream>
#include"head.h"
using namespace std;
int main(){
int n,a,b;
do{
n=menu();
switch(n){
	case 1:
		input(&a,&b);
		add(a,b);
	break;	
	case 2:
	
		input(&a,&b);
	sub(a,b);
       break;
	case 3:
       
		input(&a,&b);
       mult(a,b);
	break;
	case 4:
		input(&a,&b);
	divi(a,b);
	break;
}
}while(n!=0);
return 0;}

