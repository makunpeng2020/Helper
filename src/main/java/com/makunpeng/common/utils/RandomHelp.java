package com.makunpeng.common.utils;

import java.util.HashSet;
import java.util.Random;

public class RandomHelp {

	public static int random(int  min,int max) {
		Random r=new Random();
		
		return r.nextInt(max-min+1)+min;
		
	}
	public static int[] subRandom(int min,int max,int subs) {
		if (subs>(max-min+1)) {
			throw new RuntimeException("Êý¾Ý·¶Î§´íÎó£¡");
		}
		HashSet< Integer> set =new HashSet<Integer>();
		while (set.size()!=subs) {
			set.add(random(min, max));
			
		}
		int []x=new int [subs];
		int i=0;
		for (Integer integer : set) {
			x[i]=integer;
				i++;
		}
		return x;
	}
	public static char randomCharacter() {
		String string="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		return string.charAt(random(0,string.length()-1));
	}
	public static String randomString(int length) {
		StringBuffer sv=new StringBuffer();
		for (int i = 0; i < length; i++) {
			sv.append(randomCharacter());
			
		}
		return sv.toString();
	}
}
