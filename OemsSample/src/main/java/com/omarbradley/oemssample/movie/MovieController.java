package com.omarbradley.oemssample.movie;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.omarbradley.oemssample.PotalController;
import com.omarbradley.oemssample.movie.service.MovieService;
import com.omarbradley.oemssample.movie.vo.MovieVO;

@Controller
public class MovieController {

	private static final Logger logger = LoggerFactory.getLogger(PotalController.class);

	@Resource(name = "movieService")
	private MovieService movieService;

	/**
	 * 모든 영화 목록들을 보여주는 페이지로 간다
	 * 
	 * @param model
	 * @param request
	 * @return GetAllMovies.jsp
	 */
	@RequestMapping(value = "/getAllMovies")
	public ModelAndView getAllMovies() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("movie/GetAllMovies");
		modelAndView.addObject("movies", movieService.getAllMovies());
		return modelAndView;
	}

	/**
	 * 검색된 영화 페이지로 간다
	 * 
	 * @param model
	 * @param request
	 * @return SearchMovie.jsp
	 */
	@RequestMapping(value = "/searchMovie", method = RequestMethod.POST)
	public ModelAndView searchMovie(@ModelAttribute("movie") MovieVO movieVO) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("movie/SearchMovie");
		modelAndView.addObject("movies", movieService.getMovies(movieVO.getId()));
		return modelAndView;
	}

}
