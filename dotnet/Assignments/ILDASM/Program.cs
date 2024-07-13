using System.Reflection;

namespace ILDASM
{
    internal class Program
    {
        static void Main()
        {
            Assembly assembly = Assembly.LoadFile(@"D:\Akash\dotnet\Assignments\Employee_Arrays\bin\Debug\net8.0\Employee_Arrays.dll");

            Console.WriteLine(assembly.GetName().Name);
            foreach (Type type in assembly.GetTypes())
            {
                Console.WriteLine("     " + type.Name);


                // Properties
                PropertyInfo[] properties = type.GetProperties();
                if (properties.Length != 0)
                {
                    Console.WriteLine("         Properties:");
                    foreach (var property in properties)
                    {
                        MethodInfo[] methodInfos = property.GetAccessors();
                        string str = "";
                        if (methodInfos.Length != 0)
                        {
                            foreach (var item in methodInfos)
                            {
                                str += item.Name.Remove(3) + " ";
                            }
                        }
                        Console.WriteLine("             " + property.Name + " " + str);
                    }
                }

                // Constructors
                ConstructorInfo[] constructors = type.GetConstructors();
                if (constructors.Length != 0)
                {
                    Console.WriteLine("         Constructors:");
                    foreach (var constructor in constructors)
                    {
                        ParameterInfo[] parameters = constructor.GetParameters();
                        string str = " ";
                        if (parameters.Length != 0)
                        {
                            foreach (var item in parameters)
                            {
                                str += item.Name + ", ";
                            }
                            str = str.Remove(str.Length - 2) + " ";
                        }
                        Console.WriteLine("             " + constructor.Name + "(" + str + ")");
                    }
                }


                // Methods
                MethodInfo[] methods = type.GetMethods();
                if (methods.Length != 0)
                {
                    Console.WriteLine("         Methods:");
                    foreach (var method in methods)
                    {
                        ParameterInfo[] parameters = method.GetParameters();
                        string str = " ";
                        if (parameters.Length != 0)
                        {
                            foreach (var item in parameters)
                            {
                                str += item.Name + ", ";
                            }
                            str = str.Remove(str.Length - 2) + " ";
                        }

                        Console.WriteLine("             " + method.Name + " (" + str + ")");
                    }
                }

            }
        }
    }
}
