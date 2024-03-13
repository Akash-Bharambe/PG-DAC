#include <iostream>
using namespace std;

void getDate(int* pdd, int* pmm, int* pyy){
    int date;
    cout<<"Enter Date: ";
    cin>>date;
    *pdd = date;
    cout<<"Enter Month: ";
    cin>>date;
    *pmm = date;
    cout<<"Enter Year: ";
    cin>>date;
    *pyy = date;
}

int main()
{
    int dd,mm,yy;
    getDate(&dd,&mm,&yy);
    cout<<dd<<"/"<<mm<<"/"<<yy;
    return 0;
}