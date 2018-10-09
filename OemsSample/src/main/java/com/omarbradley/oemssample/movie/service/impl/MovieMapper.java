package com.omarbradley.oemssample.movie.service.impl;

import java.util.List;
import com.omarbradley.oemssample.movie.vo.MovieVO;

public interface MovieMapper {

	public List<MovieVO> getAllMovies();

	public List<MovieVO> getMovies(int id);

}
