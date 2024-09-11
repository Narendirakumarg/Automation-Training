package com.MyAssignments;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DAteTime {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		//cal.add(Calendar.DATE, -1);
		SimpleDateFormat s = new SimpleDateFormat("MMM/dd/yyyy");
		String today = s.format(new Date(cal.getTimeInMillis()));
		System.out.println(today);
		
		cal.add(Calendar.DATE, -1);
		
		s = new SimpleDateFormat("MMM/dd/yyyy");
		String yesterday = s.format(new Date(cal.getTimeInMillis()));
		System.out.println(yesterday);
	}

}