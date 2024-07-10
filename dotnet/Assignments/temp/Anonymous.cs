using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace temp
{
    internal class Anonymous
    {
        static void Main()
        {
            // Cannot assign 'anonymous method' to anonymous type property
            //var obj1 = new { a = 1, b = 2, c = delegate (int x, int y) { return x == y; } };

            // Cannot assign 'lambda expression' to anonymous type property
            //var obj2 = new { a = 1, b = 2, c = (int x, int y) => x == y };

            //var obj3 = new { a = 1, b = 2, Func<int, int, bool>c = delegate (int x, int y) { return x == y; } };

            //var obj4 = new { a = 1, b = 2, Func<int, int, bool> c = (x, y) => x == y };

            var obj5 = new { a = 1, b = 2, c = new Func<int, int, bool>(( x, y) => x == y) };
            var obj6 = new { a = 1, b = 2, c = (Func<int, int, bool>)((x, y) => x == y) };
            Console.WriteLine(obj5.c(4, 4));
        }
    }
}
