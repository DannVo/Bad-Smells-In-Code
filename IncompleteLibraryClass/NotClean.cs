using System;

namespace IncompleteLibraryClass
{
    internal class NotClean
    {
        static void Main(string[] args)
        {
            double length, width, areaRectangle;
            length = 2.5;
            width = 3.5;
            areaRectangle = Math.area(length, width);
            Console.WriteLine(areaRectangle);
            Console.ReadLine();
        }
    }
}
