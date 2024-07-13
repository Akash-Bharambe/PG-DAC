using System.Collections;
using System.IO;
using System.Runtime.Serialization.Json;
using System.Linq;

namespace FileHandling
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Employee> employees =
            [
                new Employee(1, "John Doe", 75000m, 101),
                new Employee(2, "Jane Smith", 80000m, 102),
                new Employee(3, "Michael Johnson", 90000m, 103)
            ];
            Employee emp1 = new(1, "John Doe", 98765m);
            //WriteObject(emp1);
            //Console.WriteLine(ReadObject(emp1));
            WriteCollection(employees);
            IEnumerable? readEmployees = ReadCollections<Employee>().Where(emp => emp != null);
            foreach (var emp in readEmployees)
            {
                Console.WriteLine(emp.ToString());
            }
        }

        public static void WriteObject(object obj)
        {
            DataContractJsonSerializer json = new(obj.GetType());
            Stream stream = new FileStream("D:\\Akash\\dotnet\\Assignments\\FileHandling\\Employee.json", FileMode.Create);
            json.WriteObject(stream, obj);
            Console.WriteLine("Written Successfully!");
            stream.Close();
        }

        public static T? ReadObject<T>()
        {
            DataContractJsonSerializer json = new(typeof(T));
            Stream input = new FileStream("D:\\Akash\\dotnet\\Assignments\\FileHandling\\Employee.json", FileMode.Open);

            T? emp = (T?)json.ReadObject(input);
            input.Close();
            return emp;
        }

        public static void WriteCollection(IEnumerable obj)
        {
            DataContractJsonSerializer json = new(obj.GetType());
            using (Stream stream = new FileStream("D:\\Akash\\dotnet\\Assignments\\FileHandling\\Employee.json", FileMode.Create))
            {
                json.WriteObject(stream, obj);
            }
            Console.WriteLine("Written Successfully!");
        }

        public static IEnumerable<T>? ReadCollections<T>()
        {
            DataContractJsonSerializer json = new(typeof(List<T>));
            using (Stream input = new FileStream("D:\\Akash\\dotnet\\Assignments\\FileHandling\\Employee.json", FileMode.Open))
            {
                List<T>? list = (List<T>?)json.ReadObject(input);
                return list;
            }
        }

        //public static void WriteCollection(IEnumerable obj)
        //{
        //    DataContractJsonSerializer json = new DataContractJsonSerializer(obj.GetType());
        //    using (Stream stream = new FileStream("D:\\Akash\\dotnet\\Assignments\\FileHandling\\Employee.json", FileMode.Create))
        //    {
        //        json.WriteObject(stream, obj);
        //    }
        //    Console.WriteLine("Written Successfully!");
        //}

        //public static IEnumerable<T>? ReadCollections<T>()
        //{
        //    DataContractJsonSerializer json = new(typeof(T));
        //    Stream input = new FileStream("D:\\Akash\\dotnet\\Assignments\\FileHandling\\Employee.json", FileMode.Open);
        //    T? obj;
        //    while ((obj = (T?)json.ReadObject(input)) != null)
        //    {
        //        yield return obj;
        //    }
        //    input.Close();
        //}

    }
}
