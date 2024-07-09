using System.Globalization;
using System.Text;

namespace Employee
{

    class Employee
    {
        private string? name;
        public string? Name
        {
            set
            {
                if (value != null && !value.Equals(""))

                    name = value;
                else
                    Console.WriteLine("Name Cannot be blank");
            }

            get => name;
        }

        private int id;
        public int Id
        {
            set
            {
                if (value > 0) id = value;
            }
            get => id;
        }

        private decimal basicSalary;
        public decimal BasicSalary
        {
            set
            {
                if (value >= 50000 && value <= 100000) basicSalary = value;
            }
            get => basicSalary;
        }

        private short deptNo;
        public short DeptNo
        {
            set
            {
                if (value > 0) deptNo = value;
            }
            get => deptNo;
        }

        public Employee() : this(0, "Default", 50000, 100) { }

        public Employee(int id = 0, string name = "Default", decimal basicSalary = 50000, short deptNo = 100)
        {
            this.id = id;
            this.name = name;
            this.basicSalary = basicSalary;
            this.deptNo = deptNo;
        }


        public decimal GetNetSalary()
        {
            return basicSalary * (decimal)(1 + 0.25);
        }

        public override string ToString()
        {
            Console.OutputEncoding = Encoding.UTF8;
            return $"{id} . {name} | salary = {GetNetSalary().ToString("C", CultureInfo.CreateSpecificCulture("hi-IN"))} | Department No =  {deptNo}";
        }

    }

    internal class Program
    {
        static void Main()
        {
            Employee e1 = new(1, "Akash", 100000, 10);
            e1.Name = "Sakshi";
            e1.Name = "";
            Employee e2 = new(1, "Akash", 100000);
            Employee e3 = new(1, "Akash");
            Employee e4 = new(1);
            Employee e5 = new();
            Console.WriteLine(e1.ToString());
            Console.WriteLine(e2.ToString());
            Console.WriteLine(e3.ToString());
            Console.WriteLine(e4.ToString());
            Console.WriteLine(e5.ToString());
        }
    }
}
