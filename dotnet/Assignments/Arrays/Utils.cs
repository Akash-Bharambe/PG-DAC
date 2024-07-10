using Employee_Dictionary;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Arrays
{
    internal class Utils
    {
        private static int count = -1;
        internal int MenuList()
        {
            Console.WriteLine("0. EXIT");
            Console.WriteLine("1. Add Employee");
            Console.WriteLine("2. Employee with Highest Salary");
            Console.WriteLine("3. Search Employee by id");
            Console.Write("Enter CHoice");
            return Convert.ToInt32(Console.ReadLine());
        }

        internal Employee AddEmployee(Employee[] employees)
        {

        }
    }
}
