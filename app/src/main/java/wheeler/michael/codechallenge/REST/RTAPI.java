package wheeler.michael.codechallenge.REST;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Alien on 8/6/2015.
 */
public interface RTAPI {
    String ROTTEN_API_KEY = "yy5at44a4hzqqbsgnm4u47ju";
    String API_BASE_URL = "http://api.rottentomatoes.com/api/public/v1.0/";

    @GET("/lists/movies/box_office.json?apikey=yy5at44a4hzqqbsgnm4u47ju")
    void getBoxOfficeMovies(Callback<MoviesGenre> callback);

    @GET("/lists/movies/in_theaters.json?apikey=yy5at44a4hzqqbsgnm4u47ju")
    void getInTheatersMovies(Callback<MoviesGenre> callback);

    @GET("/lists/movies/opening.json?apikey=yy5at44a4hzqqbsgnm4u47ju")
    void getOpeningMovies(Callback<MoviesGenre> callback);

    @GET("/lists/movies/upcoming.json?apikey=yy5at44a4hzqqbsgnm4u47ju")
    void getUpcomingMovies(Callback<MoviesGenre> callback);

    @GET("/movies/movies.json?apikey=yy5at44a4hzqqbsgnm4u47ju&q={search}&page_limit=20")
    void getAllMovies(@Path("search") String search,Callback<MoviesGenre> callback);
}
