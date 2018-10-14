package com.omarbradley.oemssample.movie.service.impl;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.omarbradley.oemssample.movie.vo.MovieVO;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = { "file:src/main/resources/oemssample/spring/*.xml" })
public class MovieMapperTest {

	@Resource(name = "movieMapper")
	private MovieMapper movieMapper;

	@Test
	@DisplayName("영화 데이터가 비어지지 않았다")
	public void testGetAllMovies() {
		// Given
		List<MovieVO> movieVos = movieMapper.getAllMovies();

		// When
		boolean isEmpty = movieVos.isEmpty();

		// Then
		assertThat(false, is(isEmpty));
	}

	@Test
	@DisplayName("영화 아이디 1번의 제목은 '굿바이 싱글' 이다")
	public void testGetMoviesById() {
		// Given
		int movieId = 1;

		// When
		MovieVO movie = movieMapper.getMovies(movieId).get(0);
		
		// Then
		assertThat("굿바이 싱글", is(movie.getTitle()));
	}

}
