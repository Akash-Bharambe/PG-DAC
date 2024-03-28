#include<iostream>
#include"timeHead.h"
using namespace std;

int main(){
    Timee t1,t2;
    t1.acceptTime();
    t2.acceptTime();

    t1.diffTime(t2);
}