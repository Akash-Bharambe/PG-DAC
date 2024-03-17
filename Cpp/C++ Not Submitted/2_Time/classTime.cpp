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
    do
    {
        cout << "Enter Hours: ";
        cin >> this->hours;
    } while (this->hours > 24 || this->hours < 0);
    do
    {
        cout << "Enter Minutes: ";
        cin >> this->minutes;
    } while (this->minutes > 60 || this->minutes < 0);

    do
    {
        cout << "Enter Seconds: ";
        cin >> this->seconds;
    } while (this->seconds > 60 || this->seconds < 0);
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
    if (this->hours != another.getHours())
        return this->hours - another.getHours();
    else if (this->minutes != another.getMinutes())
        return this->minutes - another.getMinutes();
    else
        return this->seconds - another.getSeconds();
}
void diffTime(Timee t1, Timee t2)
{
    int diffHours = t1.getHours() - t2.getHours();
    int diffMinutes = t1.getMinutes() - t2.getMinutes();
    int diffSeconds = t1.getSeconds() - t2.getSeconds();

    if (diffHours < 0 || diffMinutes < 0 || diffSeconds < 0)
    {
        diffHours = abs(diffHours);
        diffMinutes = abs(diffMinutes);
        diffSeconds = abs(diffSeconds);
    }
    cout << "Difference: " << diffHours << ":" << diffMinutes << ":" << diffSeconds << endl;
}