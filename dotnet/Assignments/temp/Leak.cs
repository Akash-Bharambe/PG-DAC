using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace temp
{
    internal class Leak
    {
        static void Main()
        {
                int length = 10; // Specify the desired length of the random string
            while (true)
            {
                string randomString = GenerateRandomString(length);
                Console.WriteLine(randomString);
            }
        }

        static string GenerateRandomString(int length)
        {
            const string chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            StringBuilder result = new(length);
            Random random = new ();

            for (int i = 0; i < length; i++)
            {
                result.Append(chars[random.Next(chars.Length)]);
            }

            return result.ToString();
        }
    }
}
