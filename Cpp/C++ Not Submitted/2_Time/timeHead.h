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
    void diffTime(Timee);
};
