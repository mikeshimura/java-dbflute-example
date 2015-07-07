package com.mssoftech.web.util;

import java.util.HashMap;

public class WebUtil {

	public static HashMap setErrorMessage(String errorMessage) {
		return setFetchResult(errorMessage, -1, 0, 1);
	}

	public static HashMap setFetchResult(Object data, int status, int startRow,
			int totalRows) {
		HashMap response = getResponse(data, status, startRow, totalRows);
		HashMap result = new HashMap();
		result.put("response", response);
		return result;
	}
	
	public static HashMap setSingleFetchResult(Object data) {
		return setFetchResult(data, 0, 0, 1);
	}

	private static HashMap getResponse(Object data, int status, int startRow,
			int totalRows) {
		HashMap response = new HashMap();
		response.put("status", status);
		response.put("startRow", startRow);
		response.put("endRow", startRow + totalRows - 1);
		response.put("totalRows", totalRows);
		response.put("data", data);
		return response;
	}

	}
