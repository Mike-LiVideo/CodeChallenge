package wheeler.michael.codechallenge.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import wheeler.michael.codechallenge.R;
import wheeler.michael.codechallenge.utility.ConstatnsInterface;

/**
 * A placeholder fragment containing a simple view.
 */
public class MovieDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_movie_detail);
        ImageView moviePoster = (ImageView) findViewById(R.id.movie_poster);
        TextView movieTital = (TextView) findViewById(R.id.tv_movie_title);
        TextView year = (TextView) findViewById(R.id.tv_year);
        TextView ratning = (TextView) findViewById(R.id.tv_mpaa_rating);
        TextView runtime = (TextView) findViewById(R.id.tv_run_time);
        TextView syopsis = (TextView) findViewById(R.id.tv_synopsis_string);
        TextView rating = (TextView) findViewById(R.id.tv_rating);

        Intent intent = getIntent();
        Picasso.with(this).load(intent.getStringExtra(ConstatnsInterface.POSTER)).into(moviePoster);
        movieTital.setText(intent.getStringExtra(ConstatnsInterface.TITLE));
        year.setText(intent.getStringExtra(ConstatnsInterface.YEAR));
        ratning.setText(intent.getStringExtra(ConstatnsInterface.RATING));
        runtime.setText(intent.getStringExtra(ConstatnsInterface.RUNTIME) + " min");
        syopsis.setText(intent.getStringExtra(ConstatnsInterface.SYNOPSIS));
        rating.setText(intent.getStringExtra(ConstatnsInterface.SCORE + "%"));

    }
}
