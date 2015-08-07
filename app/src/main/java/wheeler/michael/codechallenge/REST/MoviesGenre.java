package wheeler.michael.codechallenge.REST;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Alien on 8/6/2015.
 */
public class MoviesGenre {

    @SerializedName("movies")
    public ArrayList<MovieDetailModel> moviesFromJSONToJavaList;
}
