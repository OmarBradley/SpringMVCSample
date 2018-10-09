package com.omarbradley.oemssample.movie.service;

import java.util.HashMap;
import java.util.List;

import com.omarbradley.oemssample.movie.vo.MovieVO;

public interface MovieService {

	public List<MovieVO> getAllMovies();

	public List<MovieVO> getMovies(int id);
}
