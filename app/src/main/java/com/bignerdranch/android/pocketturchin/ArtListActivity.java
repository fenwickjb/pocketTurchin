package com.bignerdranch.android.pocketturchin;

import android.support.v4.app.Fragment;

public class ArtListActivity extends SingleFragmentActivity
{
    @Override
    protected Fragment createFragment()
    {
        return new ArtListFragment();
    }
}
