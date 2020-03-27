package com.makunpeng.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelpTest {

	@Test
	public void test() {
		String str="qwere";
		boolean hasLength = StringHelp.hasLength(str);
		System.out.println(hasLength);
	}
	@Test
	public void testStr() {
		String str=" ";
		boolean hasLength = StringHelp.hasText(str);
		System.out.println(hasLength);
	}
	@Test
	public void testName() {
		String string = StringHelp.randomChineseString(5);
		System.out.println(string);
	}

	@Test
	public void testName1() {
		String string = StringHelp.generateChineseName();
		System.out.println(string);
	}
}
