namespace Array_List_Conversions
{
    internal enum Choice
    {
        EXIT, ADD_EMPLOYEE, CONVERT_ARRAY_LIST, CONVERT_LIST_ARRAY, DISPLAY_ARRAY, DISPLAY_LIST
    }

    internal class Program
    {
        static void Main(string[] args)
        {
            Employee[] employees = new Employee[10];
            List<Employee> list = [];

            employees[0] = new Employee(1);
            employees[1] = new Employee(2);

            Choice choice;
            while ((choice = Utils.MenuList()) != Choice.EXIT)
            {
                try
                {

                    switch (choice)
                    {
                        case Choice.ADD_EMPLOYEE:
                            Utils.AddEmployee(employees);
                            break;
                        case Choice.CONVERT_ARRAY_LIST:
                            list = Utils.ArrayToList(employees);
                            break;
                        case Choice.CONVERT_LIST_ARRAY:
                            employees = Utils.ListToArray(list);
                            break;
                        case Choice.DISPLAY_ARRAY:
                            Utils.Display(employees);
                            break;
                        case Choice.DISPLAY_LIST:
                            Utils.Display(list);
                            break;
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }
    }
}
