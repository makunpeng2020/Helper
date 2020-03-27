package com.makunpeng.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateHelpTest {

	@Test
	public void testGetAge() {
		Calendar c = Calendar.getInstance();
		c.set(2000,7,20);
		int age=DateHelp.getAgeByBirthday(c.getTime());
		System.out.println("您的年龄为"+age);
	}
	@Test
	public void monthEnd() {
		Calendar c = Calendar.getInstance();
		c.set(2015,5,20);
		Date endMonth = DateHelp.getEndMonth(c.getTime());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("月末时间是"+sdf.format(endMonth));
	}
	@Test
	public void monthStart() {
		Date intMonth = DateHelp.getIntMonth(new Date(10000000000000l));
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("月初时间是"+sdf.format(intMonth));
		
	}
	@Test
	public void testRandomDate() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.set(2000,7,20);
		
		Date date=new Date(10000000000l);
		System.out.println("毫秒值转化之后是"+sdf.format(date));
		System.out.println(Math.random());
	}
}
