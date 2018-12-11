package com.bignerdranch.android.pocketturchin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.List;
import java.util.UUID;

public class ArtPagerActivity extends AppCompatActivity
{

    private static final String EXTRA_ART_ID = "com.bignerdranch.android.pocketturchin.art_id";

    private ViewPager mViewPager;
    private List<Art> mArt;

    public static Intent newIntent(Context packageContext, UUID artId)
    {
        Intent intent = new Intent(packageContext, ArtPagerActivity.class);
        intent.putExtra(EXTRA_ART_ID, artId);
        return intent;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_pager);

        UUID artId = (UUID) getIntent().getSerializableExtra(EXTRA_ART_ID);



        mViewPager = (ViewPager) findViewById(R.id.art_view_pager);
        mArt = ArtLab.get(this).getArtList();
        FragmentManager fragmentManager = getSupportFragmentManager();
        mViewPager.setAdapter(new FragmentStatePagerAdapter(fragmentManager)
        {
            @Override
            public Fragment getItem(int position)
            {
                Art art = mArt.get(position);
                return ArtFragment.newInstance(art.getArtID());
            }

            @Override
            public int getCount()
            {
                return mArt.size();
            }
        });
    }
}
