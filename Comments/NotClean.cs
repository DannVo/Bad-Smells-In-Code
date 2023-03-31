using System;

using System.Text.RegularExpressions;

namespace Comments
{
    internal class NotClean
    {
        static void Main(string[] args)
        {
            
            string str = "hello7world8";
            //In String str, if it is exists any number then delete all of it with spaces.
            str = Regex.Replace(str, "[0-9]", " ");
            Console.WriteLine(str);
            Console.ReadLine();
        }
    }
}
