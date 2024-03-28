#include <iostream>
using namespace std;

class Animal
{
private:
    int weight;

public:
    Animal();
    Animal(int weight);
    void setWeight(int weight);
    void showWeight();
};
Animal::Animal() : weight(0) {}
Animal::Animal(int weight) : weight(weight) {}
void Animal::setWeight(int weight)
{
    this->weight = weight;
}

void Animal::showWeight()
{
    cout << "Weight: " << this->weight << endl;
}

class Lion : virtual public Animal
{
private:
    int length;

public:
    Lion();
    Lion(int length, int weight);
};

Lion::Lion() : length(0) {}
Lion::Lion(int length, int weight) : length(length)
{
    Lion::setWeight(weight);
}

class Tiger : virtual public Animal
{
private:
    int height;

public:
    Tiger();
    Tiger(int height, int weight);
};

Tiger::Tiger() : height(height) {}
Tiger::Tiger(int height, int weight) : height(height)
{
    Tiger::setWeight(weight);
}

class Liger : public Lion, public Tiger
{
};

int main(int argc, char const *argv[])
{
    Liger l;
    l.setWeight(100);
    Animal *pa = NULL;
    pa = &l;
    pa->showWeight();
    return 0;
}

