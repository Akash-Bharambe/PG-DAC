using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace temp
{

    public partial class Class1
    {
        public delegate void InvalidOperationEventHandler();

        public event InvalidOperationEventHandler? InvalidOperation;

        private int p1;
        public int P1
        {
            get => p1;
            set
            {
                if (value < 0)
                    InvalidOperation?.Invoke();
                p1 = value;
            }

        }
    }

    public partial class Class1
    {
        public void Method()
        {
            InvalidOperation?.Invoke();
        }
    }

    internal class EventHandling
    {
        static void Main()
        {
            Class1 class1 = new();
            class1.InvalidOperation += Class1_InvalidOperation;
            class1.Method();
            class1.P1 = -1;
        }

        private static void Class1_InvalidOperation()
        {
            Console.WriteLine("Event Handled");
        }
    }
}

