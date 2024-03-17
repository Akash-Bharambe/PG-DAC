#include<iostream>
#include"timeHead.h"
using namespace std;

int main(){
    Timee t1,t2;
    t1.acceptTime();
    t2.acceptTime();

    diffTime(t1,t2);
}