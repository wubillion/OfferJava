/**
 * Created by wbl on 2017/8/26.
 */
public class No07Fibonacci
{
    public int Fibonacci(int n)
    {
        int[] f = new int[40];
        f[0] = 0;
        f[1] = 1;
        f[2] = 1;
        for (int i = 2; i < 40; i++)
        {
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}
