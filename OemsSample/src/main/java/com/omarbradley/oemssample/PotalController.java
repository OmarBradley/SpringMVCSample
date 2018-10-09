package com.omarbradley.oemssample;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.omarbradley.oemssample.movie.vo.MovieVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class PotalController {

	private static final Logger logger = LoggerFactory.getLogger(PotalController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView createMovieVO() {
		ModelAndView modelAndView = new ModelAndView("main/MainPage", "command", new MovieVO());
		return modelAndView;
	}
	
}
