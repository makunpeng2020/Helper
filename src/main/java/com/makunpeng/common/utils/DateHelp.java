package com.makunpeng.common.utils;

import java.util.Calendar;
import java.util.Date;

public class DateHelp {

	public static int getAgeByBirthday(Date bitrhday) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DAY_OF_MONTH);
		c.setTime(bitrhday);
		
		int byear = c.get(Calendar.YEAR);
		int bmonth = c.get(Calendar.MONTH);
		int bdate= c.get(Calendar.DAY_OF_MONTH);
		int age=year-byear;
		
		if (month<bmonth) {
			age--;
		}
		if (month==bmonth&&date<bdate) {
			age--;
		}
		return age;
	}
	public static Date getIntMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}
	public static Date getEndMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.MONTH,1);
		Date intMonth=getIntMonth(c.getTime());
		c.setTime(intMonth);
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}
	public static Date RandomDate(Date start,Date end)
	{
		long time = start.getTime();
		long time2 = end.getTime();
		if (time2<time) {
			throw new RuntimeException("日期有误请检查！（开始大于结束）");
		}
		long time3=(long)(Math.random()*(time2-time)+time);
		return new Date(time3);
	}
}
