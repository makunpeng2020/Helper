package com.makunpeng.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomHelpTest {

	@Test
	public void testRandom() {
		int i=RandomHelp.random(1,120);
		System.out.println(i);
	}
	@Test
	public void testSubRand() {
		int arr[]=RandomHelp.subRandom(1,3,2);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	@Test
	public void testChar() {
		char c=RandomHelp.randomCharacter();
		System.out.println(c);
	}
	@Test
	public void testString() {
		String i = RandomHelp.randomString(9);
		System.out.println(i);
	}
}
