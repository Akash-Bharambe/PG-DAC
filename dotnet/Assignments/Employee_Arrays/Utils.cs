using Employee_Arrays;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Employee_Arrays
{
    internal class Utils
    {
        private static int count = 0;
        internal static Choice MenuList()
        {
            Console.WriteLine("0. EXIT");
            Console.WriteLine("1. Add Employee");
            Console.WriteLine("2. Employee with Highest Salary");
            Console.WriteLine("3. Search Employee by id");
            Console.Write("Enter Choice: ");
            return (Choice)Convert.ToInt32(Console.ReadLine());
        }

        internal static void AddEmployee(Employee[] employees)
        {
            Console.Write("Enter Employee Id: ");
            int id = Convert.ToInt32(Console.ReadLine());

            Console.Write("Enter Employee Name: ");
            string? name = Console.ReadLine();

            Console.Write("Enter Basic Salary : ");
            decimal basic = Convert.ToDecimal(Console.ReadLine());

            Console.Write("Enter Department Number : ");
            short deptno = Convert.ToInt16(Console.ReadLine());

            employees[count++] = new Employee(id, name, basic, deptno);
        }

        internal static Employee EmployeeWithHighestSalary(Employee[] employees)
        {
            if (count < 1)
                throw new ArgumentException("Employee array is empty");
            
            decimal maxSalary = decimal.MinValue;
            int index = -1;
            for (int i = 0; i <= count; i++)
            {
                if (employees[i].BasicSalary > maxSalary)
                {
                    maxSalary = employees[i].BasicSalary;
                    index = i;
                }
            }
            return employees[index];
        }

        internal static Employee? SearchEmployees(Employee[] employees)
        {
            if (count < 1)
                throw new ArgumentException("Employee array is empty");

            Console.Write("Enter Employee Number to search: ");
            int empNo = Convert.ToInt32(Console.ReadLine());

            for (int i = 0; i <= count; i++)
            {
                if (employees[i].Id == empNo)
                {
                    return employees[i];
                }
            }
            return null;
        }
    }
}
