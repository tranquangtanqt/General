using System;
using System.Collections;
using System.Text.RegularExpressions;

namespace DemoQueue
{
    class Program
    {

        static void Main(string[] args)
        {
            Queue queue = new Queue();
            queue.Enqueue("SELECT");
            queue.Enqueue("-");
            queue.Enqueue("1!2!3!4L");
            queue.Enqueue("-");
            queue.Enqueue("0000");
            queue.Enqueue(",");
            queue.Enqueue("2!2!3!4L");
            queue.Enqueue("-");
            queue.Enqueue("0001");
            queue.Enqueue(",");
            queue.Enqueue("DIEUKIEN");
            queue.Enqueue("-");
            queue.Enqueue("00new");
            queue.Enqueue(",");
            queue.Enqueue("SELECT1");
            queue.Enqueue("-");
            queue.Enqueue("3!2!3!4L");
            queue.Enqueue("-");
            queue.Enqueue("0002");
            queue.Enqueue(",");
            queue.Enqueue("END");
            string rs = "";
            var _cmd1 = queue.Dequeue();
            while (queue.Count > 0)
            {
                int countSelect = 0;
                while (_cmd1.ToString().Contains("SELECT"))
                {
                    if(countSelect != 0)
                    {
                        rs += ".or.";
                    }
                    countSelect++;
                    _cmd1 = queue.Dequeue(); // "-"
                    _cmd1 = queue.Dequeue(); // condition
                    rs += _cmd1 + ".";
                    _cmd1 = queue.Dequeue(); // "-"
                    _cmd1 = queue.Dequeue(); // "L + "
                    rs += _cmd1;
                    _cmd1 = queue.Dequeue(); //  ","  "\r\n"
                    while (_cmd1.Equals(",") || _cmd1.Equals("\r\n"))
                    {
                        _cmd1 = queue.Dequeue();
                    }
                    bool checkSelect = false;
                    while (!_cmd1.ToString().Contains("SELECT"))
                    {
                        var arr = queue.ToArray();
                        foreach(string str in arr)
                        {
                            if (str.Contains("SELECT"))
                            {
                                rs += ".and." + _cmd1 + "."; // condition
                                _cmd1 = queue.Dequeue(); // "-"
                                _cmd1 = queue.Dequeue(); // "L + "
                                rs += _cmd1;
                                _cmd1 = queue.Dequeue(); // ","  "\r\n"
                                while (_cmd1.Equals(",") || _cmd1.Equals("\r\n"))
                                {
                                    _cmd1 = queue.Dequeue();
                                }
                                checkSelect = true;
                                break;
                            }
                        }
                        if (!checkSelect) break;
                    }
                }

                if (queue.Count > 0)
                {
                    _cmd1 = queue.Dequeue();
                }
            }
            Console.WriteLine(rs);
            Console.ReadKey();
        }
    }
}
