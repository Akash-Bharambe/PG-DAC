using System.ComponentModel;

namespace Employee_Inheritance
{

    internal class Program
    {
        static void Main(string[] args)
        {
            Employee employee1 = new Manager("Akash",10,100000,"Developer");
            Employee employee2 = new GeneralManager("BAkash", 20, 200000, "Developer","Java");
            Employee employee3 = new CEO("CAkash", 30, 500000);

            Console.WriteLine(employee1);
            Console.WriteLine(employee2);
            Console.WriteLine(employee3);
        }
    }
}
