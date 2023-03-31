using System;

namespace IncompleteLibraryClass
{
    internal class Solution
    {
        static void Main(string[] args)
        {
            double length, width, areaRectangle;
            length = 2.5;
            width = 3.5;
            areaRectangle = area(length,width);
            Console.WriteLine(areaRectangle);
            Console.ReadLine();
        }

        static double area(double length, double width)
        {
            return length * width;
        }
    }
}

