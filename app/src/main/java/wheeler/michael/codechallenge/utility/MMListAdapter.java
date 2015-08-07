package wheeler.michael.codechallenge.utility;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import wheeler.michael.codechallenge.R;
import wheeler.michael.codechallenge.REST.MovieDetailModel;

/**
 * Created by Alien on 8/6/2015.
 */
public class MMListAdapter extends ArrayAdapter<MovieDetailModel> {

    public ArrayList<MovieDetailModel> listOfMovies;
    public final Context context;

    public MMListAdapter(Context context, ArrayList<MovieDetailModel> objects) {
        super(context, 0, objects);
        this.listOfMovies = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        MovieDetailModel movie = getItem(position);

        if (view == null) {

            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item_movie, parent, false);
            TextView tv = (TextView) view.findViewById(R.id.movieListItem);
            tv.setText(movie.getTitle());
        }

        return view;
    }

}
