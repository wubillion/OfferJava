/**
 * Created by wbl on 2017/8/24.
 */

import jdk.nashorn.internal.objects.NativeUint8Array;

import java.util.ArrayList;
import java.util.Stack;

class ListNode
{
    int val;
    ListNode next = null;

    ListNode(int val)
    {
        this.val = val;
    }
}

public class No03printListFromTailToHead
{
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode)
    {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        while (listNode != null)
        {
            stack.push(listNode.val);
            listNode = listNode.next;
        }


        while (!stack.empty())
        {
            result.add(stack.pop());
        }

        return result;
    }

}
