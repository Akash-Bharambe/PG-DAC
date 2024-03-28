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
        cout << "Enter Hours ( Between 0-24 ): ";
        cin >> this->hours;
    } while (this->hours > 24 || this->hours < 0);
    do
    {
        cout << "Enter Minutes ( Between 0-60 ): ";
        cin >> this->minutes;
    } while (this->minutes > 60 || this->minutes < 0);

    do
    {
        cout << "Enter Seconds ( Between 0-60 ): ";
        cin >> this->seconds;
    } while (this->seconds > 60 || this->seconds < 0);
}

int Timee::compareTime(Timee another)
{
    if (this->hours != another.hours)
        return this->hours - another.hours;
    else if (this->minutes != another.minutes)
        return this->minutes - another.minutes;
    else
        return this->seconds - another.seconds;
}
void Timee::diffTime(Timee t2)
{
    int diffHours = this->hours - t2.hours;
    int diffMinutes = this->minutes - t2.minutes;
    int diffSeconds = this->seconds - t2.seconds;

    if (diffHours < 0 || diffMinutes < 0 || diffSeconds < 0)
    {
        diffHours = abs(diffHours);
        diffMinutes = abs(diffMinutes);
        diffSeconds = abs(diffSeconds);
    }
    cout << "Difference: " << diffHours << " hours " << diffMinutes << " minutes " << diffSeconds << " seconds" << endl;
}
