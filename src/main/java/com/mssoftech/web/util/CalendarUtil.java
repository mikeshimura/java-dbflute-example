package com.mssoftech.web.util;

import static java.time.temporal.TemporalAdjusters.firstDayOfMonth;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import dbfexample.exception.ErrorMessageException;

public class CalendarUtil {
	static DateTimeFormatter _dfDate = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	static DateTimeFormatter _dfDate2 = DateTimeFormatter.ofPattern("yyyyMMdd");
	static DateTimeFormatter _dfTimestamp = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	static DateTimeFormatter _dfTime = DateTimeFormatter.ofPattern("HH:mm");
	public static DateTimeFormatter getDfDate() {
		return _dfDate;
	}

	public static DateTimeFormatter getDfTimestamp() {
		return _dfTimestamp;
	}

	public static DateTimeFormatter getDfTime() {
		return _dfTime;
	}

	public static String getCurrentDate() {
		return LocalDate.now().format(getDfDate());
	}

	public static String getCurrentDatetime() {
		return LocalDateTime.now().format(getDfTimestamp());
	}

	public static LocalDateTime getCurrentTime() {
		return LocalDateTime.now();

	}

	public static void convertTimestampFromString(Map m, String ele)
			throws Exception {
		m.put(ele, timestampConvertFromString((String) m.get(ele)));
	}

	public static LocalDateTime timestampConvertFromString(String sDatetime)
			throws Exception {
		if (sDatetime == null) {
			return null;
		}
		return LocalDateTime.parse(sDatetime, getDfTimestamp());
	}

	public static LocalDate get1stOfMonth() {
		return LocalDate.now().with(firstDayOfMonth());
	}

	public static String getNextYear(String year) {
		Integer next_year = Integer.parseInt(year) + 1;
		return next_year.toString();
	}

	public static String getPreviousYear(String year) {
		Integer previou_year = Integer.parseInt(year) - 1;
		return previou_year.toString();
	}

	public static String getPreviousMonth(String month) {
		int imonth = Integer.parseInt(month);
		Integer previous_month = imonth - 1;
		if (previous_month == 0) {
			previous_month = 12;
		}
		return toTwoString(previous_month.toString());
	}

	public static String getNextMonth(String month) {
		int imonth = Integer.parseInt(month);
		Integer next_month = imonth + 1;
		if (next_month == 13) {
			next_month = 1;
		}
		return toTwoString(next_month.toString());
	}

	public static String toTwoString(String svalue) {
		if (svalue.length() > 1) {
			return svalue;
		}
		svalue = "0" + svalue;
		svalue = svalue.substring(svalue.length() - 2, svalue.length());
		return svalue;
	}

	public static String getStringDay(int iday) {
		String sday = toTwoString((new Integer(iday % 100)).toString());
		return sday;
	}

	public static LocalDate getDate(String sdate) {
		//yyyymmdd
		return LocalDate.parse(sdate, _dfDate2);
	}

	public static void convertData(Map updateInput, String... elements)
			throws Exception {
		for (String ele : elements) {
			convertEachData(updateInput, ele);
			convertEachData(updateInput, "ele");
		}

	}

	public static void convertEachData(Map updateInput, String element)
			throws Exception {
		String stime = (String) updateInput.get(element);
		String hour = "0";
		String min = "0";
		if (stime != null) {
			int pos = stime.indexOf(":");
			if (pos == -1) {
				if (stime.length() == 3 || stime.length() == 4) {
					hour = stime.substring(0, stime.length() - 2);
					min = stime.substring(stime.length() - 2, stime.length());
				} else {
					throw new ErrorMessageException("時間　:" + stime + "は正しくありません");
				}
			} else {
				String[] split = stime.split(":");
				if (split.length != 2) {
					throw new ErrorMessageException("時間　:" + stime + "は正しくありません");
				}
				hour = split[0];
				min = split[1];
			}
			// 日本の時差 ９時間を引く
			hour = toTwoString(hour);
			min = toTwoString(min);
			if (hour.compareTo("24") >= 0) {
				throw new ErrorMessageException("時間が異常値です。:" + hour);
			}
			if (min.compareTo("60") >= 0) {
				throw new ErrorMessageException("分が異常値です。:" + min);
			}
			Long milisecond = ((Long.parseLong(hour) - 9L) * 3600 + Long
					.parseLong(min) * 60) * 1000;
			Time time = new Time(milisecond);
			updateInput.put(element, time);
		}
	}

	public static void convertIntToTime(Map map, String... elements) {
		for (String ele : elements) {
			convertEachIntToTime(map, ele);
		}
	}

	private static void convertEachIntToTime(Map map, String ele) {
		Object tt = (Object) map.get(ele);
		map.put(ele, convertIntToStringTime(tt));
	}

	public static String convertIntToStringTime(Object tt) {
		Integer t = null;
		if (tt != null) {
			if (tt.getClass().equals(Integer.class)) {
				t = (Integer) tt;
			}
			if (tt.getClass().equals(Long.class)) {
				t = ((Long) tt).intValue();
			}

			if (t == 0) {
				return null;
			}
			Integer hour = t / 60;
			Integer min = t % 60;
			return hour.toString() + ":" + toTwoString(min.toString());
		} else {
			return null;
		}
	}

//	@SuppressWarnings("deprecation")
//	public static Date convertIntToDate(Integer i) {
//		if (i == null) {
//			return null;
//		}
//		return new Date(i * 60 * 1000 + (new Date("1900/01/01")).getTime());
//	}

	public static Integer convertStringTimeToInt(String stime) {
		if (stime == null) {
			return null;
		}
		String[] split = stime.split(":");
		if (split.length != 2) {
			return null;
		}
		return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
	}

	public static Double convertStringToDoubleTime(String data) {

		double s;
		double hh;
		double mm;
		// シリアル値への変換
		if (data == null) {
			return null;
		}
		if (data.length() == 4) {
			data = "0" + data;
		}
		hh = Double.parseDouble(data.substring(0, 2)) * (1.0 / 24.0);
		mm = Double.parseDouble(data.substring(3, 5)) * (1.0 / 24.0 / 60.0);
		s = hh + mm;
		return s;
	}

	static public String getStringFromDateTime(LocalDateTime d) {
		if (d == null) {
			return "";
		}
		return d.format(_dfTimestamp);
	}

	static public LocalDateTime getDateFromStrTimestamp(String s) {
		String ins = StringUtil.nullConvToString(s);
		if (ins.length() != 0 && ins.length() != 19) {
			throw new ErrorMessageException("日付の形式が違います。 (ｙｙｙy/mm/dd hh:mm:dd):" + s);
		}
		if (ins.length() == 0) {
			return null;
		}

		try {
			LocalDateTime date = LocalDateTime.parse(ins, _dfTimestamp);
			return date;
		} catch (Exception e) {
			throw new ErrorMessageException("日付が変換出来ません " + ins);
		}
	}
}
