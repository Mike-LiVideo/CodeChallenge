package wheeler.michael.codechallenge.utility;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import wheeler.michael.codechallenge.ui.MainActivity;
import wheeler.michael.codechallenge.ui.MainMenuItemsFragment;

public class MainMenuPagerAdapter
        extends FragmentPagerAdapter
        implements
        ViewPager.OnPageChangeListener {

    private MainActivity mMainMenuActivityContext;
    private FragmentManager mFragmentManager;

    public MainMenuPagerAdapter(MainActivity context, FragmentManager fm) {
        super(fm);
        this.mFragmentManager = fm;
        this.mMainMenuActivityContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        position = MainActivity.getRealPosition(position);
        ConstatnsInterface.MOVIE_GENRES frag = ConstatnsInterface.MOVIE_GENRES.getFragmentFromPosition(position);
        String action = mMainMenuActivityContext.getString(frag.getTitleId());

        return MainMenuItemsFragment.newInstance(mMainMenuActivityContext, action, frag);
    }

    @Override
    public int getCount() {
        return MainActivity.PAGES * MainActivity.LOOPS;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset,
                               int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
    }

    @Override
    public void onPageScrollStateChanged(int state) {
    }

}
