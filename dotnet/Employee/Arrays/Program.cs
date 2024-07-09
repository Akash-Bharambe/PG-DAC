namespace Arrays
{
    internal class Program
    {
        static void Main()
        {
            Console.Write("Enter No of Batches: ");
            int batchCount = Convert.ToInt32(Console.ReadLine());
            int[][] batches = new int[batchCount][];

            for (int i = 0; i < batchCount; i++)
            {
                Console.Write($"Enter No of Students in Batch {i+1}: ");
                int studentsCount = Convert.ToInt32(Console.ReadLine());
                batches[i] = new int[studentsCount];

                for (int j = 0; j < studentsCount; j++)
                {
                    Console.Write($"Marks of student {j+1}, batch {i+1}: ");
                    batches[i][j] = Convert.ToInt32(Console.ReadLine());
                }
            }

            Console.WriteLine("\nMarks of Students: ");

            for (int i = 0; i < batchCount; i++)
            {
                Console.WriteLine($"Batch {i + 1}:");
                for (int j = 0; j < batches[i].Length; j++)
                {
                    Console.WriteLine($"  Student {j + 1}: {batches[i][j]}");
                }
                Console.WriteLine();
            }

        }
    }
}
