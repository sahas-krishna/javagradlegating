package org.philips.swcoe.qualityGatesDemo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.*;
public class ZigZagNArrayTest {

	@Test
	public void test() {
        Node n1=new Node("1",new ArrayList<Node>());
	Node n2=new Node("2",new ArrayList<Node>());
	Node n3=new Node("3",new ArrayList<Node>());
	n1.children.add(n2);
	n1.children.add(n3);
	Node n4=new Node("4",new ArrayList<Node>());
	Node n5=new Node("5",new ArrayList<Node>());
	n2.children.add(n4);
	n2.children.add(n5);
	Node n6=new Node("6",new ArrayList<Node>());
	Node n7=new Node("7",new ArrayList<Node>());
	Node n8=new Node("8",new ArrayList<Node>());
	n3.children.add(n6);
	n3.children.add(n7);
	n3.children.add(n8);
	Node n9=new Node("9",new ArrayList<Node>());
	n4.children.add(n9);
	Node n10=new Node("10",new ArrayList<Node>());
	Node n11=new Node("11",new ArrayList<Node>());
	Node n12=new Node("12",new ArrayList<Node>());
	Node n13=new Node("13",new ArrayList<Node>());
	n5.children.add(n10);
	n6.children.add(n11);
	n6.children.add(n12);
	n8.children.add(n13);
	String ss=ZigZagNArray.levelOrder(n1);
	assertEquals("1-3-2-4-5-6-7-8-13-12-11-10-9-",ss);
	}

}
