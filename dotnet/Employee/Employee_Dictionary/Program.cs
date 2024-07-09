namespace Employee_Dictionary
{
    internal class Program
    {

        enum Choice
        {
            EXIT, ACCEPT_EMPLOYEES, HIGHEST_SALARY, SEARCH_EMPLOYEE, N_EMPLOYEE, ALL_EMPLOYEES
        }

        static void Main()
        {
            Dictionary<int, Employee> employees = [];
            employees.Add(1, new Employee(1, "Akash", 98765, 10));
            employees.Add(2, new Employee(2, "Sakshi", 88765, 20));
            employees.Add(3, new Employee(3, "Chinmay", 78765, 30));
            Choice choice;

            while ((choice = (Choice)Utils.MenuList()) != Choice.EXIT)
            {
                try
                {
                    switch (choice)
                    {
                        case Choice.EXIT:
                            Console.WriteLine("Quitting...!!!");
                            break;

                        case Choice.ACCEPT_EMPLOYEES:
                            Utils.AcceptEmployees(employees);
                            break;

                        case Choice.HIGHEST_SALARY:
                            Employee employee = Utils.GetEmployeeWithHighestSalary(employees);
                            Console.WriteLine(employee);
                            break;

                        case Choice.SEARCH_EMPLOYEE:
                            Console.Write("Enter Id of Employee: ");
                            int id = Convert.ToInt32(Console.ReadLine());
                            employee = Utils.SearchEmployee(employees, id);
                            Console.WriteLine(employee);
                            break;

                        case Choice.N_EMPLOYEE:
                            Console.Write("Enter Index: ");
                            int index = Convert.ToInt32(Console.ReadLine());
                            employee = Utils.GetNthEmployee(employees, index);
                            Console.WriteLine(employee);
                            break;

                        case Choice.ALL_EMPLOYEES:
                            Utils.DisplayAllEmployees(employees);
                            break;
                    }

                    Console.WriteLine();
                }
                catch (Exception ex) { Console.WriteLine(ex.ToString()); }
            }
        }
    }
}
