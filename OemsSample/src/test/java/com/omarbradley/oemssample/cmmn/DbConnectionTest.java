package com.omarbradley.oemssample.cmmn;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = { "file:src/main/resources/oemssample/spring/*.xml" })
public class DbConnectionTest {

	@Autowired
	private SqlSessionFactory sqlSession;

	@Test
	@DisplayName("데이터베이스 연결 테스트")
	public void test_connectDb() {
		// Given
		boolean isConnect = false;

		// When
		try {
			SqlSession session = sqlSession.openSession();
			isConnect = true;
		} catch (Exception e) {
			e.printStackTrace();
			isConnect = false;
		}

		// Then
		assertThat(true, is(isConnect));
	}

}
