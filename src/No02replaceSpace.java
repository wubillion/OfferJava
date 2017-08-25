/**
 * Created by wbl on 2017/8/24.
 */
public class No02replaceSpace
{
    public String replaceSpace(StringBuffer str)
    {
        int length = str.length();

        int newLength = length;

        for(int i = 0; i < length; i++)
        {
            if(str.charAt(i) == ' ')
                newLength += 2;
        }

        str.setLength(newLength);

        int first = length - 1;
        int second = newLength - 1;
        while (first >= 0)
        {
            if(str.charAt(first) != ' ')
            {
                str.setCharAt(second--, str.charAt(first--));
            }
            else
            {
                str.setCharAt(second--, '0');
                str.setCharAt(second--, '2');
                str.setCharAt(second--, '%');
                first--;
            }
        }

        return str.toString();
    }

}
