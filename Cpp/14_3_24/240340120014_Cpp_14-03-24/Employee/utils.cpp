#include "utils.h"
void sortSalary(Employee arr[], int size)
{
    for (int i = 0; i < 4; i++)
    {
        for (int j = i + 1; j < 5; j++)
        {
            if (arr[i].getSalary() > arr[j].getSalary())
            {
                Employee temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}