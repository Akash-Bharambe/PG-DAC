class Timee
{
private:
    int hours;
    int minutes;
    int seconds;

public:
    Timee();
    Timee(int, int, int);
    void displayTime();
    void acceptTime();
    int compareTime(Timee);
    int getHours();
    int getMinutes();
    int getSeconds();
};
void diffTime(Timee, Timee);
