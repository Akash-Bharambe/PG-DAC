using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Array_List_Conversions
{
    internal class Utils
    {
        private static int count = 0;
        internal static Choice MenuList()
        {
            Console.WriteLine();
            Console.WriteLine("0. EXIT");
            Console.WriteLine("1. Add Employee");
            Console.WriteLine("2. Convert Array to List");
            Console.WriteLine("3. Convert List to Array");
            Console.WriteLine("4. Display Array");
            Console.WriteLine("5. Display List");
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

            Console.WriteLine("Employee Added Successfully...!!!");

        }

        internal static List<Employee> ArrayToList(Employee[] employees)
        {
            if (employees.Length == 0) throw new ArgumentException("Array is Empty...!!!");
            List<Employee> list = [.. employees];
            Console.WriteLine("Converted from Array to List Successfully...!!!");
            return list;
        }

        internal static void Display(IEnumerable<Employee> employees)
        {
            if(!employees.Any()) throw new ArgumentException("Collection is Empty...!!!");
            foreach (Employee employee in employees)
            {
                Console.WriteLine(employee);
            }
        }

        internal static Employee[] ListToArray(List<Employee> list)
        {
            if (list.Count == 0)
                throw new ArgumentException("List is Empty...!!!");
            Console.WriteLine("Converted from List to Array Successfully...!!!");
            return [.. list];
        }
    }
}
