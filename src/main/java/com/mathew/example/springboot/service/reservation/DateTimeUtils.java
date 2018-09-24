package com.mathew.example.springboot.service.reservation;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

@Component
public class DateTimeUtils {

	private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

	public static Date createDateFromDateString(String dateString) {
		Date date = null;
		if (StringUtils.isNotBlank(dateString)) {
			try {
				date = new Date(DATE_FORMAT.parse(dateString).getTime());
			} catch (ParseException pe) {
				date = new Date(new java.util.Date().getTime());
			}
		} else {
			date = new Date(new java.util.Date().getTime());
		}
		return date;
	}

	public static String createDateStringFromDate(Date date) {
		if (null == date) {
			return DATE_FORMAT.format(new java.util.Date());
		}
		return DATE_FORMAT.format(date);
	}

}
