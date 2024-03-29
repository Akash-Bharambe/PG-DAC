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
    // while(fin.read(ch,sizeof(ch)))
    // {
    //     fin >> ch;
    //     cout<<"fin: "<<ch<<endl;
    //     fout << ch;
    //     cout<<"fout: "<<ch<<endl;
    // }
    while (fin)
    {
        ch = fin.get();
        std::cout << ch;
        fout << ch;
    }

    // while (!fin.eof())
    // {
    //     fin >> ch;
    //     cout << "fin: " << ch << endl;
    //     fout << ch;
    //     cout << "fout: " << ch << endl;
    // }
    return 0;
}
