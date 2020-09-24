package org.philips.swcoe.qualityGatesDemo;
import java.util.*;
class Node
{
	String content;
	List<Node>children;
	Node(String content,List<Node>children)
	{
		this.content=content;
		this.children=children;
	}
	
}
public class Narry {
	public static String levelOrder(Node n1)
	{
		String output="";
		StringBuffer sb=new StringBuffer();
		// 1 (2 3) 4 5 6 7 8 (9 10 11 12 13) 14 15 16 17 18
		Queue<Node>q1=new LinkedList<Node>();
		Queue<Node>q2=new LinkedList<Node>();
		q1.offer(n1);
		while(!q1.isEmpty()|| !q2.isEmpty())
		{
			sb.append(emy(q1,q2));
			Stack<Node>st=emy1(q1,q2);
			sb.append(elemy(st));
		}
		output=sb.toString();
		return output;
	}
	public static String elemy(Stack<Node>st)
	{
		String output="";
		StringBuffer sb=new StringBuffer();
		while(!st.isEmpty())
		sb.append(st.pop().content+"-");
		output=sb.toString();
		return output;
	}
	public static String emy(Queue<Node>q1,Queue<Node>q2)
	{
		String output="";
		StringBuffer sb=new StringBuffer();
		while(!q1.isEmpty())
		{
			Node nn=q1.poll();
			sb.append(nn.content+"-");
			for(Node ii:nn.children)
				q2.offer(ii);
			output=sb.toString();
		}
		return output;
		
	}
	public static Stack<Node> emy1(Queue<Node>q1,Queue<Node>q2)
	{
		Stack<Node>st=new Stack<Node>();
		while(!q2.isEmpty())
		{
			Node nn=q2.poll();
			st.push(nn);
			for(Node ii:nn.children)
				q1.offer(ii);
		}
		return st;
		
	}
}
