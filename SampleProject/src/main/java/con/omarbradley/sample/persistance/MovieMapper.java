package con.omarbradley.sample.persistance;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface MovieMapper {

	@Select("SELECT * FROM movie")
	public List<Movie> getMovies();

}
