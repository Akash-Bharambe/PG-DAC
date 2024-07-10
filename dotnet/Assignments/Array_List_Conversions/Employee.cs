using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Globalization;
namespace Array_List_Conversions
{
    internal class Employee
    {
        private string? name;
        public string? Name
        {
            set
            {
                if (!string.IsNullOrWhiteSpace(value))
                    name = value;
                else
                    throw new ArgumentException("Name cannot be Blank");
            }

            get => name;
        }

        private int id;
        public int Id
        {
            set
            {
                if (int.IsPositive(value)) id = value;
                else throw new ArgumentException("Id cannot be negative");
            }
            get => id;
        }

        private decimal basicSalary;
        public decimal BasicSalary
        {
            set
            {
                if (value >= 50000 && value <= 100000) basicSalary = value;
                else throw new ArgumentException("Basic Salary must be between 50000-100000");
            }
            get => basicSalary;
        }

        private short deptNo;
        public short DeptNo
        {
            set
            {
                if (value > 0) deptNo = value;
                else throw new ArgumentException("Department Number cannot be negative");
            }
            get => deptNo;

        }

        public Employee(int id, string? name = "Default", decimal basicSalary = 50000, short deptNo = 100)
        {
            Id = id;
            Name = name;
            BasicSalary = basicSalary;
            DeptNo = deptNo;
        }


        public decimal GetNetSalary()
        {
            return basicSalary * (1 + 0.25m);
        }

        public override string ToString()
        {
            Console.OutputEncoding = Encoding.UTF8;
            return $"{id} . {name} | salary = {GetNetSalary().ToString("C", CultureInfo.CreateSpecificCulture("hi-IN"))} | Department No =  {deptNo}";
        }

    }
}
