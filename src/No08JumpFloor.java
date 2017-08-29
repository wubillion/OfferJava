/**
 * Created by wbl on 2017/8/26.
 */
public class No08JumpFloor
{
    public int JumpFloor(int target) {
        int[] ff = new int[40];
        ff[0] = 0;
        ff[1] = 1;
        ff[2] = 2;
        for (int i = 3; i < 40; i++)
        {
            ff[i] = ff[i-1] + ff[i-2];
        }
        return ff[target];

    }
}
