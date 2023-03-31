using System;

using System.Text.RegularExpressions;

namespace Comments
{
    internal class Solution
    {
        static void Main(string[] args)
        {
            
            string str = "hello7world8";
            Console.WriteLine(replaceNumberBySpace(str));
            Console.ReadLine();
        }

        static string replaceNumberBySpace(String str)
        {
            return Regex.Replace(str, "[0-9]", " ");
        }
    }
}
