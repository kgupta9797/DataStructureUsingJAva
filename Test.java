import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test
{
    public static void main(String args[])
    {
        String str="what is your name";
        //op->wht s yr nm
        System.out.println("After removing: "+removeVowel(str));
    }
    static String removeVowel(String str)
    {
        Set<Character>vowel=new HashSet<>();
        StringBuilder sb = new StringBuilder();
        vowel.add('a');vowel.add('e');vowel.add('i');vowel.add('o');vowel.add('u');

        char[]charArray=str.toCharArray();
        for(char ch:charArray)
        {
            if(!vowel.contains(ch))//if not then append
            {
                sb.append(ch);
            }

        }
        return sb.toString();
    }

}
