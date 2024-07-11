namespace temp
{

    public partial class Class1
    {
        // Step 1: Create a delegate class whose signature matches with event handling class
        public delegate void InvalidOperationEventHandler();

        // Step 2: Create an event reference of delegate class
        public event InvalidOperationEventHandler? InvalidOperation;

        private int p1;
        public int P1
        {
            get => p1;
            set
            {
                if (value < 0)
                    // Step 3: Raise an event
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
            // step 4: Create an Object of event handling class
            Class1 class1 = new();

            // Add Event Handling Method reference to event object
            class1.InvalidOperation += Class1_InvalidOperation;
            class1.Method();
            class1.P1 = -1;
        }

        // Event Handling method
        private static void Class1_InvalidOperation()
        {
            Console.WriteLine("Event Handled");
        }
    }
}

