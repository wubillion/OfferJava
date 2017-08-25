/**
 * Created by wbl on 2017/8/24.
 */

class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class No04reConstructBinaryTree
{
    public  TreeNode reConstructBinaryTree(int [] pre,int [] in)
    {
        int len = pre.length;
        if(len == 0)
            return null;

        int parentVal = pre[0];
        TreeNode parent = new TreeNode(parentVal);


        if(len == 1)
            return parent;

        int leftLength = 0;
        while(leftLength < len && in[leftLength] != parentVal)
            leftLength++;

        int[] preLeft = new int[leftLength];
        int[] inLeft = new int[leftLength];

        int rightLength = len - leftLength - 1;
        int[] preRight = new int[rightLength];
        int[] inRight = new int[rightLength];

        for(int i = 0; i < leftLength; i++)
        {
            preLeft[i] = pre[i+1];
            inLeft[i] = in[i];
        }

        for (int i = 0; i < rightLength; i++)
        {
            preRight[i] = pre[leftLength + i + 1];
            inRight[i] = in[leftLength + i + 1];
        }

        parent.left = reConstructBinaryTree(preLeft,inLeft);

        parent.right = reConstructBinaryTree(preRight,inRight);

        return parent;
    }


}
