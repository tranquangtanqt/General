using System;
using System.Collections;
using System.Text.RegularExpressions;

namespace DemoQueue
{
    class Program
    {
        public const string PATTENRN_FILE = "^Infile\\d*";

        static void Main(string[] args)
        {
            Queue queue = new Queue();
            queue.Enqueue("Infile1");
            queue.Enqueue("-");
            queue.Enqueue("INFILE");
            queue.Enqueue("Outfile");
            queue.Enqueue("-");
            queue.Enqueue("OUTFILE");

            while(queue.Count > 0)
            {
                String str = (String) queue.Dequeue();
                if (Regex.IsMatch(str, PATTENRN_FILE))
                {
                    if ("-".Equals(queue.Dequeue()))
                    {
                        Console.WriteLine("FILE-" + queue.Dequeue());
                    }
                }
            }

            Console.ReadKey();
        }
    }
}
