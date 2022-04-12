namespace PRGYOURNAMEFA1
{
    public class SearchReplace
    {
        bool Set = false;
        string UserString = "";

        public string SearchSubstring(string UserString, string Find, string Replace)
        {
            if (!Set)
            {
                this.UserString = UserString;
                Set = true;
            }

            if (this.UserString.Contains(Find))
                ReplaceSubstring(Find, Replace);

            while (this.UserString.Contains(Find))
                SearchSubstring(this.UserString, Find, Replace);

            return this.UserString;
        }

        public void ReplaceSubstring(string Find, string Replace)
        {
            string NewUserString = UserString;

            int Index = NewUserString.IndexOf(Find);
            int Length = Find.Length;

            NewUserString = NewUserString.Substring(0, Index) + Replace + NewUserString.Substring(Index + Length);

            UserString = NewUserString;
        }
    }
}
