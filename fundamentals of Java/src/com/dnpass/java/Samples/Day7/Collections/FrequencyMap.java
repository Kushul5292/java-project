package com.dnpass.java.Samples.Day7.Collections;
import java.util.*;

public class FrequencyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"hi","bye","hello","welcome"};
		Map<String,Integer> n= new HashMap<String , Integer>();
		for(String s:words) {
			Integer temp= n.get(s);
			n.put(s, (temp==null)?1:temp+1);
		}
		System.out.println(n+" "+n.size());
		for(String s:words) {
			Integer temp= n.get(s);
			n.put(s, (temp==null)?1:temp+1);
		}
		System.out.println(n+" "+n.size());
		
		for(String s:words) {
			Integer temp= n.get(s);
			n.put(s, (temp==null)?1:temp+1);
		}
		System.out.println(n+" "+n.size());
		
	}

}