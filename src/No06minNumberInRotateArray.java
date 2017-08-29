/**
 * Created by wbl on 2017/8/24.
 */

public class No06minNumberInRotateArray
{


    //这种写法实际上是有问题的，因为对于[0,1,1,1,1,1]
    //的划分[1,0,1,1,1,1]和[1,1,1,0,1]这种，实际上是无法判断的.
    public int minNumberInRotateArray(int [] array)
    {
        int len = array.length;
        int left = 0, right = len-1;
        int mid, result;

        while(array[left] >= array[right])
        {
            if((right - left) == 1)
            {
                result = right;
                return array[result];
            }

            mid = (left + right) / 2;

            if(array[mid] >= array[right])
            {
                left = mid;
            }
            else if(array[mid] <= array[right])
            {
                right = mid ;
            }
        }

        return array[right];
    }

}
