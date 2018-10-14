package com.omarbradley.oemssample.cmmn;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.omarbradley.oemssample.cmmn.ibsheet.HeaderMode;
import com.omarbradley.oemssample.cmmn.util.JsonParserUtil;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = { "file:src/main/resources/oemssample/spring/*.xml" })
public class JsonParserUtilTest {

	@Resource(name = "jsonParserUtil")
	private JsonParserUtil jsonParserUtil;

	@Test
	@DisplayName("HeaderMode 클래스를 Json String로 변환한다")
	public void test_convertJson() {
		// Given
		HeaderMode headerMode = new HeaderMode();
		headerMode.Sort = 0;
		headerMode.ColMove = 0;
		headerMode.ColResize = 0;
		headerMode.HeaderCheck = 0;
		
		// When
		String jsonParserString = jsonParserUtil.convertJson(headerMode);

		// Then
		String expextedJsonString = "{\"Sort\":0,\"HeaderCheck\":0,\"ColMove\":0,\"ColResize\":0}";
		assertThat(expextedJsonString, is(jsonParserString));
	}

}
