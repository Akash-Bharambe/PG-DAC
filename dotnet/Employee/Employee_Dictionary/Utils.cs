using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Employee_Dictionary
{
    internal class Utils
    {

        internal static int MenuList()
        {
            Console.WriteLine("0. Exit");
            Console.WriteLine("1. Accept Employee Details");
            Console.WriteLine("2. Employee with highest salary");
            Console.WriteLine("3. Search Employee");
            Console.WriteLine("4. Nth Employee");
            Console.WriteLine("5. Display All Employees");
            Console.Write("Enter Choice: ");
            return Convert.ToInt32(Console.ReadLine());
        }

        internal static void AcceptEmployees(Dictionary<int, Employee> employees)
        {
            char ch;
            do
            {
                Console.Write("Enter Employee Id: ");
                int id = Convert.ToInt32(Console.ReadLine());

                Console.Write("Enter Employee Name: ");
                string? name = Console.ReadLine();

                Console.Write("Enter Basic Salary : ");
                decimal basic = Convert.ToDecimal(Console.ReadLine());

                Console.Write("Enter Department Number : ");
                short deptno = Convert.ToInt16(Console.ReadLine());

                employees.Add(id, new Employee(id, name, basic, deptno));

                Console.Write("Do You Want to Continue(y/n)? ");
                ch = Convert.ToChar(Console.Read());
                Console.ReadLine();
            } while (ch != 'n');

        }

        internal static void DisplayAllEmployees(Dictionary<int, Employee> employees)
        {
            foreach (KeyValuePair<int, Employee> employee in employees)
            {
                Console.WriteLine(employee.Value);
            }
        }

        internal static Employee GetEmployeeWithHighestSalary(Dictionary<int, Employee> employees)
        {
            int id = -1;
            decimal maxSal = decimal.MinValue;

            foreach (KeyValuePair<int, Employee> employee in employees)
            {
                if (employee.Value.BasicSalary > maxSal)
                {
                    maxSal = employee.Value.BasicSalary;
                    id = employee.Key;
                }
            }

            return employees[id];
        }

        internal static Employee GetNthEmployee(Dictionary<int, Employee> employees, int index)
        {
            return employees.ElementAtOrDefault(index).Value;
        }

        internal static Employee SearchEmployee(Dictionary<int, Employee> employees, int id)
        {
            return employees[id];
        }
    }
}
