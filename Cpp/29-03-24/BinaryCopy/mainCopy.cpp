#include <iostream>
#include <fstream>
using namespace std;

int main(int argc, char const *argv[])
{
    char ch;
    ifstream fin;
    fin.open(argv[1], ios::binary);
    ofstream fout;
    fout.open(argv[2], ios::binary);
    cout << sizeof(char) << endl;
    
    while (fin)
    {
        ch = fin.get();
        fout << ch;
    }

    // while (!fin.eof())
    // {
    //     fin >> ch;
    //     fout << ch;
    // }
    fin.close();
    fout.close();
    return 0;
}
