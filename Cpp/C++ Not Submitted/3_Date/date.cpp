#include "date.h"

Date::Date() : dd(1), mm(1), yy(1) {}
Date::Date(int dd, int mm, int yy) : dd(dd), mm(mm), yy(yy) {}

bool isLeapYear(int year)
{
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}

int getDaysInMonth(int year, int month)
{
    static const int daysInMonth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int days = daysInMonth[month];
    if (month == 2 && isLeapYear(year))
        days++; // February has 29 days in a leap year
    return days;
}

int Date::diffDate(Date d)
{
    int totalDays = 0;
    // Calculate days from year1 to year2 (excluding year2)
    for (int year = this->yy; year < d.yy; year++)
        totalDays += isLeapYear(year) ? 366 : 365;

    // Calculate days from month1 to month2 (excluding month2) in year2
    for (int month = 1; month < d.mm; month++)
        totalDays += getDaysInMonth(d.yy, month);

    // Add remaining days in month2
    totalDays += d.dd;

    // Subtract days from month1 to month2 (excluding month1) in year1
    for (int month = 1; month < d.mm; month++)
        totalDays -= getDaysInMonth(this->yy, month);

    // Subtract remaining days in month1
    totalDays -= this->dd;

    return totalDays;
}

bool Date::comparedate(Date d)
{
    return (this->dd == d.dd && this->mm == d.mm && this->yy == d.yy) ? true : false;
}

bool Date::operator==(Date d)
{
    return (this->dd == d.dd && this->mm == d.mm && this->yy == d.yy) ? true : false;
}

bool Date::operator!=(Date d)
{
    return !((*this) == d);
}

Date Date::operator+(Date d)
{
    int dd1 = this->dd + d.dd;
    int mm1 = this->mm + d.mm;
    int yy1 = this->yy + d.yy;
    if (dd1 > 30)
    {
        dd1-=30;
        mm1++;
    }
    if (mm1 > 12)
    {
        mm1-=12;
        yy1++;
    }
    return Date(dd1,mm1,yy1);
}

Date Date::operator-(Date d)
{
    int dd1 = this->dd > d.dd ? this->dd - d.dd : d.dd - this->dd;
    int mm1 = this->mm - d.mm;
    int yy1 = this->yy - d.yy;
    if (dd1 > 30)
    {
        dd1-=30;
        mm1++;
    }
    if (mm1 > 12)
    {
        mm1-=12;
        yy1++;
    }
    return Date();
}

Date::~Date() {}
