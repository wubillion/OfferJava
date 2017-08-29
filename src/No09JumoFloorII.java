import static java.lang.Math.pow;

/**
 * Created by wbl on 2017/8/26.
 */
public class No09JumoFloorII {

    public int JumpFloorII(int target)
    {
        int[] f = new int[15];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < 15; i++)
        {
            f[i] = 2 * f[i-1];
        }
        return f[target];
    }
}
