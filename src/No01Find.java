/**
 * Created by wbl on 2017/8/24.
 */

public class No01Find
{

    public static boolean Find(int target, int [][] array)
    {

        boolean flag = false;

        int row = array.length;

        if(row == 0)
            return flag;

        int column = array[0].length;


        int i = 0, j = column - 1;
        while (i < row && j >= 0)
        {
            if(array[i][j] == target)
            {
                flag = true;
                break;
            }
            else if(array[i][j] > target)
                j--;
            else if(array[i][j] < target)
                i++;

        }

        return flag;
    }

}
