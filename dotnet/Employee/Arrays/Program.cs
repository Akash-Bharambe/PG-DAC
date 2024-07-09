using Employee_Dictionary;

namespace Arrays
{
    internal class Program
    {
        static void Main()
        {
            Console.Write("Number of Employees: ");
            int num = Convert.ToInt32(Console.ReadLine());
            Employee[] employees = new Employee[num];

            // Accept details for all Employees
            for (int i = 0; i < employees.Length; i++ )
            {
                Console.Write("Enter Employee Id: ");
                int id = Convert.ToInt32(Console.ReadLine());

                Console.Write("Enter Employee Name: ");
                string? name = Console.ReadLine();

                Console.Write("Enter Basic Salary : ");
                decimal basic = Convert.ToDecimal(Console.ReadLine());

                Console.Write("Enter Department Number : ");
                short deptno = Convert.ToInt16(Console.ReadLine());

                employees[i] = new Employee(id, name, basic, deptno);
                Console.WriteLine();
            }

            // Display the Employee with highest Salary

            decimal maxSal = decimal.MinValue;
            int index = -1;

            for (int i = 0; i < employees.Length; i++)
            {
                if (employees[i].BasicSalary > maxSal)
                {
                    maxSal = employees[i].BasicSalary;
                    index = i;
                }
            }
            Console.WriteLine();
            Console.WriteLine("Employee with highest Salary: ");
            Console.WriteLine(employees[index]);


            // Accept EmpNo to be searched.Display all details for that employee.
            Console.WriteLine();
            Console.Write("Enter Employee Number to search: ");
            int empNo = Convert.ToInt32(Console.ReadLine());

            for (int i = 0; i < employees.Length; i++)
            {
                if (employees[i].Id == empNo)
                {
                    Console.WriteLine(employees[i]);
                    break;
                }
            }

        }
    }
}
