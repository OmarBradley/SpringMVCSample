package com.omarbradley.oemssample.cmmn.util;

import javax.annotation.Resource;

import com.google.gson.Gson;

public class JsonParserUtil {

	@Resource(name = "gson")
	private Gson gson;

	public String convertJson(Object object) {
		return gson.toJson(object);
	}

}
