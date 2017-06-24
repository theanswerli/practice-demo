package com.theanswerli;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Wade on 2016/11/13.
 */
public class StringFormat {

	public static void main(String[] args) {
		Date date = new Date();
		String year = String.format("%tF", date);
		String time = String.format("%tT", date);
		System.out.println(year + " " + time);

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = simpleDateFormat.format(date);
		System.out.println(format);
	}

}
