package com.learning.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {
	public static Date addDate(Date date, String type, int index) {
		if (date == null || type == null || "".equals(type) || index == 0) {
			return date;
		}
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setGregorianChange(new Date(Long.MIN_VALUE));
		calendar.setTime(date);
		if ("YEAR".equals(type.toUpperCase())) {
			calendar.add(1, index);
		} else if ("MONTH".equals(type.toUpperCase())) {
			calendar.add(2, index);
		} else if ("DAY".equals(type.toUpperCase())) {
			calendar.add(5, index);
		} else if ("HOUR".equals(type.toUpperCase())) {
			calendar.add(10, index);
		} else if ("HOUR_OF_DAY".equals(type.toUpperCase())) {
			calendar.add(11, index);
		} else if ("MINUTE".equals(type.toUpperCase())) {
			calendar.add(12, index);
		} else if ("SECOND".equals(type.toUpperCase())) {
			calendar.add(13, index);
		}
		return calendar.getTime();
	}

	public static String convertDateTime(Date time, String format) {
		try {
			SimpleDateFormat formater = new SimpleDateFormat(format);
			formater.setLenient(false);
			return formater.format(time);
		} catch (Exception ex) {
			return null;
		}
	}

	public static class DATE_PARTTERN {
		public static String DATE_TIME_FULL_PATTERN = "yyyy/MM/dd (E) HH:mm:ss";

		public static String DATE_TIME_PATTERN = "yyyy/MM/dd (E) HH:mm";

		public static String DATE_WITHOUT_DAY_IN_WEEK = "yyyy/MM/dd";

		public static String DATE_WITH_DAY_IN_WEEK = "yyyy/MM/dd (E)";

		public static String MONTH_DATE = "MM/dd";

		public static String TIME_COLON_PATTERN = "HH:mm";

		public static String TIME_NO_COLON_PATTERN = "HHmm";

		public static String MONTH_TIME_HOUR = "MM/dd HH:mm";

		public static String NAME_DAY_IN_WEEK = "E";

		public static String YYYY = "yyyy";

		public static String MM = "MM";

		public static String DD = "dd";

		public static String YEAR_MONTH = "yyyy/MM";

		public static String YMDHM = "yyyyMMddHHmm";

		public static String YMD = "yyyyMMdd";

		public static String YM = "yyyyMM";
		public static String YMDHMS = "yyyyMMddHHmmss";
	}
}
