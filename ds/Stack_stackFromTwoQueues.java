/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


class GfG
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
        return q2.poll();
	// Your code here
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
        q1.add(a);
        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }
        Queue<Integer> q3 = q1;
        q1 = q2;
        q2 = q3;
	// Your code here	
    }
}