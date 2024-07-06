namespace Employee2
{

    class Employee
    {
        private string? name;
        public string? Name
        {
            set
            {
                if (value != null && !value.Equals(""))

                    this.name = value;
                else
                    Console.WriteLine("Name Cannot be blank");
            }

            get
            {
                return this.name;
            }
        }

        private int id;
        public int Id
        {
            set
            {
                if (value > 0) this.id = value;
            }
            get
            {
                return this.id;
            }
        }

        private decimal basicSalary;
        public decimal BasicSalary
        {
            set
            {
                if (value <= 50000 && value >= 100000) this.basicSalary = value;
            }
            get
            {
                return this.basicSalary;
            }
        }

        private short deptNo;
        public short DeptNo
        {
            set
            {
                if (value > 0) this.deptNo = value;
            }
            get
            {
                return this.deptNo;
            }
        }
        private static int empCount;

        static Employee()
        {
            empCount = 0;
        }

        public Employee() : this("Default", 50000, 100)
        {
        }

        public Employee(string name = "Default", decimal basicSalary = 50000, short deptNo = 100)
        {
            this.id = ++empCount;
            this.name = name;
            this.basicSalary = basicSalary;
            this.deptNo = deptNo;
        }


        public decimal GetNetSalary()
        {
            return this.basicSalary * (decimal)(1 + 0.25);
        }

        public override string ToString()
        {
            return this.id + ". " + this.name + " | salary = " + this.GetNetSalary() + " | Department No = " + this.deptNo;
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
