using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace temp
{
    internal class Tuples
    {
        static void Main()
        {
            var (Message, Method) = ( "Hello",(Predicate<int>)(x => x > 0));
            Console.WriteLine(Method(-5));
            Console.WriteLine((Message,Method));
        }
    }
}
