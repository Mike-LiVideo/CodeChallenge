package wheeler.michael.codechallenge.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import wheeler.michael.codechallenge.R;
import wheeler.michael.codechallenge.utility.ConstatnsInterface;
import wheeler.michael.codechallenge.utility.MainMenuPagerAdapter;

/**
 * Created by Alien on 8/6/2015.
 */
public class MainActivity
        extends FragmentActivity {

    public final static int PAGES = 5;
    public final static int LOOPS = 1000;
    public final static int FIRST_PAGE = PAGES * LOOPS / 2;
    protected static final String LOGTAG = MainActivity.class.getSimpleName();
    public MainMenuPagerAdapter mMainMenuPagerAdapter;
    public ViewPager mViewPager;

    public static int getRealPosition(int pos) {
        return pos % PAGES;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager) findViewById(R.id.myviewpager);
        mMainMenuPagerAdapter = new MainMenuPagerAdapter(this, this.getSupportFragmentManager());
        mViewPager.setAdapter(mMainMenuPagerAdapter);
        mViewPager.setOnPageChangeListener(mMainMenuPagerAdapter);
        mViewPager.setCurrentItem(FIRST_PAGE);

//        Button inTheatersButton = (Button) findViewById(R.id.inTheaters);
//        Button boxOfficeButton = (Button) findViewById(R.id.boxOffice);
//        Button openingButton = (Button) findViewById(R.id.opening);
//        Button upComingButton = (Button) findViewById(R.id.upComing);
//        inTheatersButton.setOnClickListener(this);
//        boxOfficeButton.setOnClickListener(this);
//        openingButton.setOnClickListener(this);
//        upComingButton.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public Context getMainMenuContext() {
        return getApplicationContext();
    }

}
