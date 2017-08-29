/**
 * Created by wbl on 2017/8/26.
 */
public class No10RectCover {
    public int RectCover(int target) {
        int[] re = new int[50];
        re[0] = 0;
        re[1] = 1;
        re[2] = 2;
        for (int i = 3; i < 50; i++)
        {
            re[i] = re[i-1] + re[i-2];
        }
        return re[target];
    }
}
