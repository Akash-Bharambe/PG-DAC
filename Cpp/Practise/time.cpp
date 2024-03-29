#include <iostream>
#include <ctime>
#include <iomanip> // For std::setw and std::setfill
using namespace std;
int main()
{
    // Get current time
    time_t currentTime = time(nullptr);

    // Convert to local time
    tm *localTime = localtime(&currentTime);

    // Format and display the local time
    cout << "Current local time is: ";
    cout << setw(2) << setfill('0') << localTime->tm_mday << "-"        // Day
         << setw(2) << setfill('0') << localTime->tm_mon + 1 << "-"     // Month (Note: tm_mon is 0-based)
         << setw(2) << setfill('0') << localTime->tm_year + 1900 << " " // Year (Note: tm_year is years since 1900)
         << setw(2) << setfill('0') << localTime->tm_hour << ":"        // Hour
         << setw(2) << setfill('0') << localTime->tm_min << ":"         // Minute
         << setw(2) << setfill('0') << localTime->tm_sec << endl;       // Second

    return 0;
}
