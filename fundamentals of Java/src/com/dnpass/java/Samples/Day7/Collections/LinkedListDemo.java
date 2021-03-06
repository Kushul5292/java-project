package com.dnpass.java.Samples.Day7.Collections;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll1=new LinkedList<Integer>();
		ll1.add(1);
		ll1.add(2);
		ll1.add(4);
		ll1.add(8);
		ll1.add(2, 11);
		ll1.add(11);
		ll1.add(10);
		ll1.add(100);
		ll1.add(17);
		ll1.add(22);
		
		System.out.println(ll1.offer(9));
		
		System.out.println(ll1);
		Iterator llIter = ll1.descendingIterator();
		while(llIter.hasNext()) {
			System.out.println(llIter.next());
		}
		System.out.println("peek :"+ll1.peek());
		System.out.println("Sublist :"+ll1.subList(2, 5));
		
		Set<Integer> hset= new HashSet<Integer>(ll1);
		System.out.println(hset);
		Set<Integer> tset= new TreeSet<Integer>(ll1);
		System.out.println(tset);
		Iterator tsetIter= tset.iterator();
	}

}

