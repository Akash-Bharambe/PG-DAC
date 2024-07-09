namespace Employee_Arrays
{

    internal enum Choice
    {
        EXIT, ADD_EMPLOYEE, HIGHEST_SALARY, SEARCH_EMPLOYEE
    }

    internal class Program
    {
        static void Main()
        {
            Employee[] employees = new Employee[10];

            Choice ch;

            while ((ch = Utils.MenuList()) != Choice.EXIT)
            {
                try
                {
                    switch (ch)
                    {
                        case Choice.ADD_EMPLOYEE:
                            Utils.AddEmployee(employees);
                            break;

                        case Choice.HIGHEST_SALARY:
                            Console.WriteLine(Utils.EmployeeWithHighestSalary(employees));
                            break;

                        case Choice.SEARCH_EMPLOYEE:
                            Console.WriteLine(Utils.SearchEmployees(employees));
                            break;

                    }
                }
                catch (Exception ex) { Console.WriteLine(ex.ToString()); }
            }
        }
    }
}
