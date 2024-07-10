using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace temp
{

    public delegate void Del1(Array[] arr, int index);

    internal class Delegate
    {
        static void Main(string[] args)
        {
            Del1 obj = Method;
            obj += args.CopyTo;
            try
            {
                obj(null, 0);
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        public static void Method(Array[] arr, int index)
        {
            Console.WriteLine("in method");
        }
    }

}
