package wheeler.michael.codechallenge.utility;

import android.util.Log;

import wheeler.michael.codechallenge.R;

/**
 * Created by Alien on 8/6/2015.
 */
public interface ConstatnsInterface {
    String TITLE = "title";
    String YEAR = "year";
    String POSTER = "poster";
    String RATING = "rating";
    String RUNTIME = "runtime";
    String SYNOPSIS = "synopsis";
    String SCORE = "score";

    enum MOVIE_GENRES {

        BOX_OFFICE(R.string.box_office, 0),
        IN_THEATERS(R.string.in_theaters, 1),
        OPENING(R.string.opening, 2),
        UP_COMING(R.string.up_coming, 3),
        SEARCH(R.string.search, 4);

        private final int mTitleString;
        private final int mPosition;

        MOVIE_GENRES(final int fragmentTitle, final int position) {
            mTitleString = fragmentTitle;
            mPosition = position;
        }

        public static MOVIE_GENRES getFragmentFromPosition(int pos) {

            switch (pos) {
                case 0:
                    return BOX_OFFICE;
                case 1:
                    return IN_THEATERS;
                case 2:
                    return OPENING;
                case 3:
                    return UP_COMING;
                case 4:
                    return SEARCH;
                default:
                    Log.e("Fragment", "Invalid Position");
                    return null;

            }

        }

        public int getTitleId() {
            return mTitleString;
        }

        public int getPosition() {
            return mPosition;
        }

    }

}
