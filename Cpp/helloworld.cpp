#include <iostream>
#include <chrono>
#include <thread>
#include <string>
using namespace std;

void loopTill(int till, string &str)
{
    int j;
    for (j = 97; j <= till - 1; j++)
    {
        cout << str << char(j) << endl;
        this_thread::sleep_for(chrono::milliseconds(35));
        cout << str << char(j) << endl;
        this_thread::sleep_for(chrono::milliseconds(35));
    }
    str += char(j);
}

int main()
{
    string str = "";
    int start = 97;
    int h = 104, e = 101, l = 108, o = 111;
    int w = 119, r = 114, d = 100;

    for (int i = 97; i <= h; i++)
    {
        cout << char(i) << endl;
        str = char(i);
        if (i == h)
        {
            loopTill(e, str);
            loopTill(l, str);
            loopTill(l, str);
            loopTill(o, str);
            str += " ";
            loopTill(w, str);
            loopTill(o, str);
            loopTill(r, str);
            loopTill(l, str);
            loopTill(d, str);
        }
    }
    for (int i = 0; i < 50; i++)
    {
        cout << str << endl;
        this_thread::sleep_for(chrono::milliseconds(35));
    }
    return 0;
}