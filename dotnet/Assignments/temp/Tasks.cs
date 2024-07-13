using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;


namespace temp
{
    internal class Tasks
    {

        static async Task Main()
        {
            Console.WriteLine("Before starting tasks");

            //// Start baking the cake (asynchronous task)
            Task<string> cakeTask = BakeCakeAsync();

            // Do other work while the cake is baking
            Console.WriteLine("Doing other work while waiting for the cake to bake...");
            var frostingResult =  PrepareFrostingAsync();  // Non-blocking call for preparing frosting
            var frostingResult1 =  PrepareFrostingAsync();  // Non-blocking call for preparing frosting
            var frostingResult2 =  PrepareFrostingAsync();  // Non-blocking call for preparing frosting
            Console.WriteLine(await frostingResult);
            Console.WriteLine(await frostingResult1);
            Console.WriteLine(await frostingResult2);

            // Wait for the cake to be baked
            string cakeResult = await cakeTask;
            Console.WriteLine(cakeResult);

            Console.WriteLine("After all tasks");
        }

        static async Task<string> BakeCakeAsync()
        {
            await Task.Delay(2000);  // Simulates baking time
            return "Cake is baked";
        }

        static async Task<string> PrepareFrostingAsync()
        {
            await Task.Delay(1900);  // Simulates frosting preparation time
            return "Frosting is prepared";
        }
    }

}

