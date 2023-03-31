using System;

namespace TemporaryField
{
    internal class NotClean
    {
        static void Main(string[] args)
        {
            Console.WriteLine(sum(2.5,3.5));
            Console.ReadLine();
        }

        static public double sum(double a, double b)
        {
            double c;
            c = a + b;
            return c;
        }
    }
}
