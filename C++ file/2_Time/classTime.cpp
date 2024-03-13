#include <iostream>
#include "timeHead.h"
using namespace std;

Timee::Timee()
{
    this->hours = 6;
    this->minutes = 55;
    this->seconds = 0;
}
Timee::Timee(int hours, int minutes, int seconds)
{
    this->hours = hours;
    this->minutes = minutes;
    this->seconds = seconds;
}
void Timee::displayTime()
{
    cout << hours << ":" << minutes << ":" << seconds;
}
void Timee::acceptTime()
{
    cout << "Enter Hours: ";
    cin >> this->hours;
    cout << "Enter Minutes: ";
    cin >> this->minutes;
    cout << "Enter Seconds: ";
    cin >> this->seconds;
}
int Timee::getHours()
{
    return this->hours;
}
int Timee::getMinutes()
{
    return this->minutes;
}
int Timee::getSeconds()
{
    return this->seconds;
}
int Timee::compareTime(Timee another)
{
    if (this->hours > another.getHours())
        return 1;
    else
        return -1;
    
    if (this->minutes > another.getMinutes())
        return 1;
    else
        return -1;
    
    if (this->seconds > another.getSeconds())
        return 1;
    else
        return -1;
    
    return 0;
    
}
void diffTime(Timee t1, Timee t2){
    if (t1.compareTime(t2) == 1)
        cout<<"Difference: "<<t1.getHours()-t2.getHours()<<":"<<t1.getMinutes()-t2.getMinutes()<<":"<<t1.getSeconds()-t2.getSeconds()<<endl;
    else if (t1.compareTime(t2) == -1)
        cout<<"Difference: "<<t2.getHours()-t1.getHours()<<":"<<t2.getMinutes()-t1.getMinutes()<<":"<<t2.getSeconds()-t1.getSeconds()<<endl;
    else
        cout<<"Time is SAME"<<endl;
}