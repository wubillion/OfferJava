/**
 * Created by wbl on 2017/8/24.
 */

import java.util.Stack;

public class No05PushAndPop
{
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node)
    {
        stack1.push(node);

    }

    public int pop()
    {
        if(!stack2.empty())
            return stack2.pop();
        else if(stack2.empty() && !stack1.empty())
        {
            while (!stack1.empty())
            {
                int data = stack1.pop();
                stack2.push(data);
            }
        }

        return stack2.pop();
    }

}
