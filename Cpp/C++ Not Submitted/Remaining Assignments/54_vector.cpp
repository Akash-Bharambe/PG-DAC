#include <iostream>
#include <vector>
using namespace std;

int main()
{
    vector<int> v(10);

    for (int i = 0; i < v.size(); i++)
    {
        cin >> v[i];
    }

    v.push_back(1);
    v.push_back(2);

    for (int i = 0; i < v.size(); i++)
    {
        cout<<v[i]<<" ";
    }
    cout<<endl;
    v.pop_back();
    v.pop_back();

    vector<int>::iterator it= v.begin();

    while (it != v.end())
    {
        cout<<*it++<<" ";;
    }
    

    

    return 0;
}