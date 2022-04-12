using System;

namespace PRGYOURNAMEFA1
{
    public static class TestSearchReplace
    {
        public static void Run()
        {
            Console.Write("Please enter a string: ");
            string UserString = Console.ReadLine();
            Console.Write("Please enter the substring you wish to find: ");
            string Find = Console.ReadLine();
            Console.Write("Please enter a string to replace the given substring: ");
            string Replace = Console.ReadLine();

            SearchReplace searchReplace = new SearchReplace();
            
            string NewUserString = searchReplace.SearchSubstring(UserString, Find, Replace);

            Console.WriteLine("Your new string is: " + NewUserString);

            Console.ReadKey();
        }
    }
}
