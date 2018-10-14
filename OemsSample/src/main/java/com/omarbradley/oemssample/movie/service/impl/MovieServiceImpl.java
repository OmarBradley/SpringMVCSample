package com.omarbradley.oemssample.movie.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.omarbradley.oemssample.movie.service.MovieService;
import com.omarbradley.oemssample.movie.vo.MovieVO;

@Service("movieService")
public class MovieServiceImpl implements MovieService {

	@Resource(name = "movieMapper")
	private MovieMapper movieMapper;

	@Override
	public List<MovieVO> getAllMovies() {
		return movieMapper.getAllMovies();
	}

	@Override
	public List<MovieVO> getMovies(int id) {
		return movieMapper.getMovies(id);
	}

}
