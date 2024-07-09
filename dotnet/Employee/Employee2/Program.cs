namespace Employee2
{

    class Employee
    {
        private string? name;
        public string? Name
        {
            set
            {
                if (!string.IsNullOrWhiteSpace(value))
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
        private static int empCount;

        static Employee()
        {
            empCount = 0;
        }

        public Employee() : this("Default", 50000, 500)
        {
        }

        public Employee(string name = "Default", decimal basicSalary = 50000, short deptNo = 100)
        {
            id = ++empCount;
            this.name = name;
            this.basicSalary = basicSalary;
            this.deptNo = deptNo;
        }


        public decimal GetNetSalary()
        {
            return basicSalary * (1 + 0.25m);
        }

        public override string ToString()
        {
            return $"{id} . {name} | salary = {GetNetSalary()} | Department No =  {deptNo}";
        }

    }

    internal class Program
    {
        static void Main()
        {
            Employee e1 = new("Akash", 100000, 10);
            e1.Name = "Sakshi";
            e1.Name = "";
            Employee e2 = new("Akash", 100000);
            Employee e3 = new("Akash");
            Employee e4 = new();
            Console.WriteLine(e1.ToString());
            Console.WriteLine(e2.ToString());
            Console.WriteLine(e3.ToString());
            Console.WriteLine(e4.ToString());
        }
    }
}
