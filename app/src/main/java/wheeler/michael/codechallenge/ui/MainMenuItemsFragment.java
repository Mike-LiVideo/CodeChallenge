package wheeler.michael.codechallenge.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import wheeler.michael.codechallenge.R;
import wheeler.michael.codechallenge.REST.MovieDetailModel;
import wheeler.michael.codechallenge.REST.MoviesGenre;
import wheeler.michael.codechallenge.REST.RTAPI;
import wheeler.michael.codechallenge.utility.ConstatnsInterface;
import wheeler.michael.codechallenge.utility.MMListAdapter;

public class MainMenuItemsFragment
        extends Fragment implements AdapterView.OnItemClickListener {

    public static Fragment newInstance(MainActivity context, String act, ConstatnsInterface.MOVIE_GENRES fragmentEnum) {
        Bundle mBundle = new Bundle();
        mBundle.putString("action", act);
        mBundle.putSerializable("fragment", fragmentEnum);
        return Fragment.instantiate(context, MainMenuItemsFragment.class.getName(), mBundle);
    }

    private ListView mListView;

    private RTAPI RTService;
    private RestAdapter restAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }
        RelativeLayout mLinearLayout = (RelativeLayout) inflater.inflate(R.layout.fragment_movie_list, container, false);
        EditText editText = (EditText) mLinearLayout.findViewById(R.id.search_box);
        final String mAction = this.getArguments().getString("action");
        assert mAction != null;
        if (mAction.equalsIgnoreCase("search")){
            editText.setVisibility(View.VISIBLE);
            editText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            });
        }
        TextView mMTextView = (TextView) mLinearLayout.findViewById(R.id.title_text);
        mMTextView.setText(mAction);

        return mLinearLayout;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final ConstatnsInterface.MOVIE_GENRES mFragmentEnum = (ConstatnsInterface.MOVIE_GENRES) this.getArguments().getSerializable("fragment");
        mListView = (ListView) view.findViewById(R.id.fragment_recycler_view);
        setRestAdapter();
        connectToService(mFragmentEnum);
        mListView.setOnItemClickListener(this);

    }

    public void setRestAdapter() {
        restAdapter = new RestAdapter.Builder().setEndpoint(RTAPI.API_BASE_URL).build();
        RTService = restAdapter.create(RTAPI.class);
    }

    public void connectToService(ConstatnsInterface.MOVIE_GENRES movieGenre) {
        switch (movieGenre) {
            case BOX_OFFICE:
                RTService.getBoxOfficeMovies(new RTMovieListResponseHandler());
                break;
            case UP_COMING:
                RTService.getUpcomingMovies(new RTMovieListResponseHandler());
                break;
            case IN_THEATERS:
                RTService.getInTheatersMovies(new RTMovieListResponseHandler());
                break;
            case OPENING:
                RTService.getOpeningMovies(new RTMovieListResponseHandler());
                break;
            case SEARCH:
                RTService.getAllMovies("A",new RTMovieListResponseHandler());
                break;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(getActivity(), MovieDetailActivity.class);
        MovieDetailModel movie = (MovieDetailModel) mListView.getItemAtPosition(position);
        intent.putExtra(ConstatnsInterface.TITLE, movie.getTitle());
        intent.putExtra(ConstatnsInterface.YEAR, "" + movie.getYear());
        intent.putExtra(ConstatnsInterface.POSTER, movie.getPosters().getDetailed());
        intent.putExtra(ConstatnsInterface.RATING, movie.getMpaaRating());
        intent.putExtra(ConstatnsInterface.RUNTIME, "" + movie.getRuntime());
        intent.putExtra(ConstatnsInterface.SYNOPSIS, movie.getSynopsis());
        intent.putExtra(ConstatnsInterface.SCORE, "" + movie.getRatings().getAudienceScore());

        startActivity(intent);
    }

    public class RTMovieListResponseHandler implements Callback<MoviesGenre> {
        ArrayList<MovieDetailModel> myMovies = new ArrayList<>();
        MMListAdapter adapter = new MMListAdapter(getActivity(), myMovies);

        @Override
        public void success(MoviesGenre movies, Response response) {
            Log.d("test", " we made it");

            for (MovieDetailModel aMovie : movies.moviesFromJSONToJavaList) {
                adapter.add(aMovie);
            }
            mListView.setAdapter(adapter);
        }

        @Override
        public void failure(RetrofitError retrofitError) {

        }
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(String id);
    }

}
