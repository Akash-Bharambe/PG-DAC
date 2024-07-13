using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;

namespace ILDASM
{
    internal class CreateObject
    {
        static void Main()
        {
            Assembly assembly = Assembly.GetExecutingAssembly();
            object[] param = [1, "Akash", 98765, 10];
            Activator.CreateInstance(typeof(Employee), param);
            if (assembly.CreateInstance("Employee") is Employee employee)
            {
                Console.WriteLine(employee.ToString());
            }
        }
    }
}
