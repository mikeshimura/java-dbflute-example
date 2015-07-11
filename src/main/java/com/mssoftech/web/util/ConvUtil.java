package com.mssoftech.web.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class ConvUtil {

	public static void dateConverter(Map map, String pattern, String... params) {
		if (pattern == null || pattern.equals("")) {
			return;
		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		for (String param : params) {
			LocalDate date = (LocalDate) map.get(param);
			if (date == null) {
				continue;
			}
			map.put(param, date.format(formatter));
		}

	}
	public static void datetimeConverter(Map map, String pattern, String... params) {
		if (pattern == null || pattern.equals("")) {
			return;
		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		for (String param : params) {
			LocalDateTime datetime = (LocalDateTime) map.get(param);
			if (datetime == null) {
				continue;
			}
			map.put(param, datetime.format(formatter));
		}

	}
	public static void timeConverter(Map map, String pattern, String... params) {
		if (pattern == null || pattern.equals("")) {
			return;
		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		for (String param : params) {
			LocalTime datetime = (LocalTime) map.get(param);
			if (datetime == null) {
				continue;
			}
			map.put(param, datetime.format(formatter));
		}

	}

}
